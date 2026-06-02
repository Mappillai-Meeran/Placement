class User {
    String name;
    String phone;
    String location;

    User(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public void basicinfo() {
        System.out.println("Name: " + name + " | Phone: " + phone + " | Location: " + location);
    }
}

class foodUser extends User {
    String favfoods;

    foodUser(String name, String phone, String location, String favfoods) {
        super(name, phone, location);
        this.favfoods = favfoods;
    }

    public void userDetails() {
        basicinfo(); 
        System.out.println("Favfoods: " + favfoods);
    }
}

public class Inherit {
    public static void main(String[] args) {
        foodUser user1 = new foodUser("Meeran", "909223292442", "chennai", "malai");
        user1.userDetails();
    }
}