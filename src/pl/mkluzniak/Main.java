package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //      The class "owns" the static member

        Friend friend1 = new Friend("Spongebob"); //creating name objects
        Friend friend2 = new Friend("Patric");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        //System.out.println(Friend.numberOfFriends); // it is best practice to type name of class that owns static member followed by static member that try to acces
    Friend.displayFriend();

    }
}
