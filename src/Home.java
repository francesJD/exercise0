public class Home {
    Bathroom bathroom;
    LivingRoom livingRoom;
    Bedroom bedroom;
    Kitchen kitchen;
    StudyRoom studyRoom;
    String people;
    Puppy puppy;
    Address address;
    Direction direction;

    Home() {
        System.out.println("A home is initialized.");
        direction = new Direction();
        address = new Address();
    }

    public Home(String address) {
        System.out.println("The home is at: " + address);
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getOwner() {
        System.out.println("The home is owned by: " + people);
        return people;
    }

    public void getAddressInfo() {
        this.address.getAddress();
    }

    public void getDirectionInfo() {
        this.direction.getDirection();
    }

    private class Address {
        String address1 = "877 S Winchester Blvd";
        String address2 = null;
        String city = "San Jose";
        String state = "CA";
        int zipcode = 95128;

        Address() {
            System.out.println("A new address is initialized.");
        }

        Address(String address1, String address2, String city, String state, int zipcode) {
            this.address1 = address1;
            this.address2 = address2;
            this.city = city;
            this.state = state;
            this.zipcode = zipcode;
        }

        private void getAddress() {
            System.out.println("The address is: " + address1 + ", " + address2 + ", " + city + ", " + state + ", " + zipcode);
        }

        private void getCity() {
            System.out.println("The address is in: " + city);
        }
    }

    private class Direction {
        boolean south = true;
        boolean north = false;

        Direction() {
            System.out.println("A new direction is initialized.");
        }

        private void getDirection() {
            if (south == true) {
                System.out.println("The home is facing to South.");
            } else {
                System.out.println("The home is not facing to South.");
            }
            if (north == true) {
                System.out.println("The home is facing to North.");
            } else {
                System.out.println("The home is not facing to North.");
            }
        }
    }
}

