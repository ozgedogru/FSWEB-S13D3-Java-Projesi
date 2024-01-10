public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    String phoneNumber;
    boolean isStudent;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String email, String phoneNumber, boolean isStudent){
        this(firstName, lastName, age);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isStudent= isStudent;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean getOccupation() {
        return isStudent;
    }
    public boolean isTeen() {
        return age>= 13 && age <=19;
    }

}
