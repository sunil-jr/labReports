package labsheet1.q10;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        serializeStudents();

        deserializeStudents();
    }

    private static void serializeStudents() {
        Student student1 = new Student("Sunil", 101, 'A');
        Student student2 = new Student("Subedi", 102, 'B');

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            outputStream.writeObject(student1);
            outputStream.writeObject(student2);

            System.out.println("Students serialized and written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeStudents() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.ser"))) {
            Student student1 = (Student) inputStream.readObject();
            Student student2 = (Student) inputStream.readObject();

            System.out.println("Details of Deserialized Students:");
            System.out.println("Student 1: Name - " + student1.getName() +
                    ", Roll Number - " + student1.getRollNumber() +
                    ", Grade - " + student1.getGrade());

            System.out.println("Student 2: Name - " + student2.getName() +
                    ", Roll Number - " + student2.getRollNumber() +
                    ", Grade - " + student2.getGrade());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


