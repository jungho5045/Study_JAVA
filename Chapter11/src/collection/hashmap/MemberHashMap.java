package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;	// Key : ȸ����ȣ, value : Member
	
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
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	
	// Map�� key�� value�� ���ÿ� ��ȸ�� �� ����.
	public void showAllMember() {
		
		// hashMap.values().iterator()	// ��� value�� ��ȯ(Collection Ÿ������)
		Iterator<Integer> ir = hashMap.keySet().iterator();	// ��� Key�� ��ȯ(Set Ÿ������)
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
		
	}
	
}
