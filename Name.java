package p;

public class Name {

    String firstName;
    String secondName;
    String thirdName;

    public Name(String firstName, String secondName) {
        this(firstName,secondName,null);
    }

    public Name(String firstName) {
        this(firstName,null,null);
    }

    public Name(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

}
