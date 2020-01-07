package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;	// Key : 회원번호, value : Member
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if( hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	// Map은 key와 value를 동시에 순회할 수 없다.
	public void showAllMember() {
		
		// hashMap.values().iterator()	// 모든 value를 반환(Collection 타입으로)
		Iterator<Integer> ir = hashMap.keySet().iterator();	// 모든 Key를 반환(Set 타입으로)
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
		
	}
	
}
