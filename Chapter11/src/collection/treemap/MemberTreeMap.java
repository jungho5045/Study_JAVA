package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;	// Key : 회원번호, value : Member
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if( treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	// Map은 key와 value를 동시에 순회할 수 없다.
	public void showAllMember() {
		
		// treeMap.values().iterator()	// 모든 value를 반환(Collection 타입으로)
		Iterator<Integer> ir = treeMap.keySet().iterator();	// 모든 Key를 반환(Set 타입으로)
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
		
	}
	
}
