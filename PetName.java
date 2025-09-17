 public String getName() {
        return name;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", true);
        myPet.feedPet(); 
        myPet.feedPet(); 
    }
}