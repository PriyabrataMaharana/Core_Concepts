package usingTransient;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable {
    int id;
    String name;
    transient String password;  // 🔒 this won't be serialized

    Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class SerializeWithTransient {
	public static void main(String[] args) {
        Student s = new Student(101, "Soumya", "soumya@123");

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();

            System.out.println("Object with transient field serialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
