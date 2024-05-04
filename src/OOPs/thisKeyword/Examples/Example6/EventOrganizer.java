package OOPs.thisKeyword.Examples.Example6;

class Friend {
    String name;
    Friend(String name)
    {
        this.name=name;
    }

    void showTalent() {
        System.out.println("I'm performing my talent!");
        // Here, you want to call another method (perhaps to coordinate the event),
        // but you want to pass yourself as an argument to that method.
        performEvent(this); // Passes itself (the current object) as an argument
        checkFriend(this);
    }

    void performEvent(Friend friend) {
        System.out.println("Friend " + friend.name + " is performing at the event!");
    }

    void checkFriend(Friend friend)
    {
        if(this == friend)
        {
            System.out.println(friend.name+" checked");
        }
        else {
            System.out.println(friend.name+" unchecked");
        }
    }
}

public class EventOrganizer {
    public static void main(String[] args) {
        Friend friend = new Friend("Sayantan"); // Create a new friend (object)
        friend.showTalent(); // Ask the friend to perform their talent
    }
}