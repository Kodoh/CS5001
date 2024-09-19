package W3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testDefaultConstructor() {
        Student student = new Student();

        assertEquals(-1, student.matricNumber);
        assertEquals("Not Found", student.uniEmail);
        assertEquals(-1, student.year);
    }

    @Test
    void testParameterizedConstructor() {
        String name = "John Doe";
        int age = 20;
        String uniEmail = "johndoe@uni.edu";
        int matricNumber = 123456;
        int year = 2;

        Student student = new Student(uniEmail, matricNumber, name, age, year);

        assertEquals(name, student.name); 
        assertEquals(age, student.age); 
        assertEquals(matricNumber, student.matricNumber);
        assertEquals(uniEmail, student.uniEmail);
        assertEquals(year, student.year);
    }

    @Test
    void testPrintStudentDetails() {
        String name = "John Doe";
        int age = 20;
        String uniEmail = "johndoe@uni.edu";
        int matricNumber = 123456;
        int year = 2;
        Student student = new Student(uniEmail, matricNumber, name, age, year);

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        student.printStudentDetails();

        String expectedOutput = "Name: John Doe\nAge: 20\nStudent email: johndoe@uni.edu\nStudent year: 2\nStudent id: 123456\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPrintStudentDetailsWithDefaultConstructor() {
        Student student = new Student();

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        student.printStudentDetails();

        String expectedOutput = "Name: Not Found\nAge: -1\nStudent email: Not Found\nStudent year: Not Found\nStudent id: Not Found\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
