package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}



public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// Human human = (Human)hAnimal; - 정상
		// Eagle human = (Eagle)hAnimal; - 컴파일 오류는 안나지만 런타임 오류가 발생
		/*if(hAnimal instanceof Human) {		// hAnimal이 정말 Human의 인스턴스 였는지 true, false를 반환한다. - 안정적 형변환
			Human human = (Human)hAnimal;
			human.readBooks();
		}*/
		
		/*AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		/*for(Animal animal : animalList) {
			animal.move();
		}*/
		
	}
	
	// Downcasting 영역
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();		//이부분이 Polymorphism
	}

}
