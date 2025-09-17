import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class ReleJobFinder {
    private static final String USAJOBS_SEARCH_URL = "https://data.usajobs.gov/api/search";
    private static final String USER_AGENT = "ReleJobFinder/1.0 (your.email@example.com)"; // Replace with your contact info as per API guidelines

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect Full Name
        System.out.print("Full Name: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("Full Name (required): ");
            name = scanner.nextLine().trim();
        }

        // Collect Age
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Age (0-150): ");
            try {
                age = Integer.parseInt(scanner.nextLine().trim());
                if (age >= 0 && age <= 150) {
                    validAge = true;
                } else {
                    System.out.println("Age must be between 0 and 150.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for age.");
            }
        }

        // Collect Gender
        String gender = "";
        while (true) {
            System.out.print("Gender (Male/Female/Other): ");
            gender = scanner.nextLine().trim();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other")) {
                gender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
                break;
            } else {
                System.out.println("Please enter 'Male', 'Female', or 'Other'.");
            }
        }

        // Collect Education Level
        String education = "";
        System.out.println("Level of Education (select one):");
        System.out.println("1. Primary/Middle Education");
        System.out.println("2. Secondary Education");
        System.out.println("3. Vocational Education");
        System.out.println("4. Tertiary Education");
        while (true) {
            System.out.print("Enter number (1-4): ");
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    education = "Primary/Middle Education";
                    break;
                case "2":
                    education = "Secondary Education";
                    break;
                case "3":
                    education = "Vocational Education";
                    break;
                case "4":
                    education = "Tertiary Education";
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    continue;
            }
            break;
        }

        // Collect Address
        System.out.print("Current Address: ");
        String address = scanner.nextLine().trim();
        while (address.isEmpty()) {
            System.out.print("Current Address (required): ");
            address = scanner.nextLine().trim();
        }

        // Collect Previous Jobs
        boolean previousJobs = false;
        while (true) {
            System.out.print("Any previous jobs? (true/false): ");
            String jobInput = scanner.nextLine().trim().toLowerCase();
            if (jobInput.equals("true")) {
                previousJobs = true;
                break;
            } else if (jobInput.equals("false")) {
                previousJobs = false;
                break;
            } else {
                System.out.println("Please enter 'true' or 'false'.");
            }
        }

        // Display Summary
        System.out.println("\n--- Submitted Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Education Level: " + education);
        System.out.println("Address: " + address);
        System.out.println("Previous Jobs: " + (previousJobs ? "Yes" : "No"));

        // Search for relevant jobs using the collected info
        System.out.println("\n--- Searching for Relevant Jobs ---");
        searchJobs(education, previousJobs);

        scanner.close();
    }

    /**
     * Searches for jobs using the USAJOBS public API based on education level and previous experience.
     * This is a simple integration; in a real app, handle rate limits, errors, and more filters.
     * Requires Java 11+ for HttpClient. Add Gson dependency for JSON parsing (e.g., via Maven).
     */
    private static void searchJobs(String education, boolean hasPreviousJobs) {
        try {
            // Construct search query based on user input
            String keyword;
            if (hasPreviousJobs) {
                keyword = education.replace("/", " ") + " developer"; // Example: Tailor to "experienced" roles
            } else {
                keyword = "entry level " + education.replace("/", " ").toLowerCase();
            }

            // Build URL with parameters
            String queryParams = "?Keyword=" + java.net.URLEncoder.encode(keyword, "UTF-8") +
                                "&ResultsPerPage=5&Page=1"; // Limit to 5 results for demo
            URI uri = URI.create(USAJOBS_SEARCH_URL + queryParams);

            // Create HTTP request with required User-Agent header
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("User-Agent", USER_AGENT)
                    .GET()
                    .build();

            // Send request using HttpClient (Java 11+)
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                // Parse JSON response using Gson
                Gson gson = new Gson();
                JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
                JsonArray searchResults = jsonResponse.getAsJsonObject("SearchResult")
                                                     .getAsJsonArray("SearchResultItems");

                if (searchResults != null && searchResults.size() > 0) {
                    System.out.println("Found " + searchResults.size() + " relevant job(s):");
                    for (int i = 0; i < searchResults.size(); i++) {
                        JsonObject job = searchResults.get(i).getAsJsonObject()
                                                      .getAsJsonObject("MatchedObjectDescriptor");
                        String positionTitle = job.get("PositionTitle").getAsString();
                        String organization = job.get("OrganizationName").getAsString();
                        String location = job.get("Location").getAsString();
                        String applyUrl = job.get("PositionURI").getAsString();

                        System.out.println((i + 1) + ". **" + positionTitle + "**");
                        System.out.println("   Organization: " + organization);
                        System.out.println("   Location: " + location);
                        System.out.println("   Apply: " + applyUrl);
                        System.out.println();
                    }
                } else {
                    System.out.println("No jobs found for your criteria. Try adjusting your profile.");
                }
            } else {
                System.out.println("API request failed with status: " + response.statusCode());
                System.out.println("Response: " + response.body());
            }
        } catch (Exception e) {
            System.out.println("Error searching for jobs: " + e.getMessage());
            e.printStackTrace();
        }
    }
}