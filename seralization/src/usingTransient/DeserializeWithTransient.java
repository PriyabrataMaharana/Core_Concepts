package usingTransient;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeWithTransient {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student) ois.readObject();
			ois.close();
			fis.close();

			System.out.println("ID: " + s.id);
			System.out.println("Name: " + s.name);
			System.out.println("Password: " + s.password); // 👈 will print null
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
