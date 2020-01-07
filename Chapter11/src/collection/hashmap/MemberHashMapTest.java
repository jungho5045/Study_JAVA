package collection.hashmap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);	// key값이 Integer로 선언되있고, Integer에서 이미 equals, hashcode가 구현되어있어서 굳이 구현을 안해도 중복처리가 가능하다.
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
	}

}