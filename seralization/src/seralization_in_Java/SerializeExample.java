package seralization_in_Java;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeExample {
    public static void main(String[] args) {
    	
        Student s1 = new Student(101, "Soumya");

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(s1);  // 🔸 serialize the object
            
            oos.close();
            fos.close();

            System.out.println("Object serialized successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
