package W3;

public class Student extends Person{
    int matricNumber;
    String uniEmail;
    int year;

    public Student() {
        this.matricNumber = -1;
        this.uniEmail = "Not Found";
        this.year = -1;
    }

    public Student(String uniEmail,int matricNumber, String name, int age, int year) {
        super(name,age);
        this.matricNumber = matricNumber;
        this.uniEmail = uniEmail;
        this.year = year;
    }

    public void printStudentDetails() {
        printPersonDetails();
        System.out.println("Student email: " + this.uniEmail);

        if (this.age > -1) {
            System.out.println("Student year: " + this.year);
        }
        else {
            System.out.println("Student year: Not Found");
        }

        if (this.matricNumber > -1) {
            System.out.println("Student id: " + this.matricNumber);
        }
        else {
            System.out.println("Student id: Not Found");
        }

    }

}
