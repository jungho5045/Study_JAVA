package Chapter5;

import Chapter5.Student;
import Chapter5.Taxi;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentL = new Student("LeeJungHo", 10000);
		
		Taxi taxi7749 = new Taxi(7749);
		
		studentL.takeTaxi(taxi7749);
		
		studentL.showStudentInfo();
		
		taxi7749.showTaxiInfo();
		
	}

}
