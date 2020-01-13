package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Person implements Serializable {
class Person implements Externalizable {			// 'Externalizable' 인터페이스 : Serializable과 다르게 입력과 출력을 구현 할 수 있다.
	String name;
	transient String job;						// 'transient' 키워드 : 이 변수는 직렬화 하지 마라 라는 의미
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		try( FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
				
		
	}

}
