public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("John", "Doe", 20);
        Person person1 = new Person("Ahmet", "Demir", 25, "ahmet@gmail.com", "123456789", false);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is he student? " + person1.getOccupation());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }


}

