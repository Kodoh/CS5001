package W3;

public class Person {
    String name;
    int age;

    public Person() {
        this.name = "Not Found";
        this.age = -1;
    }

    public Person(String name) {
        this.name = name;
        this.age = -1;
    }

    public Person(int age) {
        this.name = "Not found";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printPersonDetails() {
        System.out.println("Person Name: " + this.name);
        if (this.age > -1) {
            System.out.println("Person Age: " + this.age);
        }
        else {
            System.out.println("Person Age: Not Found");
        }
    }
}


