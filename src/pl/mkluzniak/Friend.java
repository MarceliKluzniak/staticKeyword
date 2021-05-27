package pl.mkluzniak;

public class Friend {

    String name; // data type of name variable
    static int numberOfFriends; // static variable that share class

    Friend(String name) { //parametres that the name is set up
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriend(){ //static method that returns number of friends
        System.out.println("You have " +numberOfFriends+" friends.");
    }
}
