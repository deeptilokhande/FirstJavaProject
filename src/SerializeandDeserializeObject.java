import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeandDeserializeObject {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f =new File("serializeobj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		writeObject(oos);
		
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		readObject(ois);
		
	}
	
	private static void writeObject(ObjectOutputStream oos) throws IOException {
		Dog d = new Dog();
		oos.writeObject(d);
	}
	
	private static void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		
		Dog newly= (Dog)ois.readObject();
		System.out.println(newly.i);
		System.out.println(newly.j);
	}
	

}

class Dog implements Serializable {
	
	int i =5;
	int j=6;
}
