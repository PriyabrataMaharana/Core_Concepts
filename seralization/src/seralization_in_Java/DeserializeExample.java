package seralization_in_Java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Student s = (Student) ois.readObject();  // 🔸 deserialize

            ois.close();
            fis.close();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

