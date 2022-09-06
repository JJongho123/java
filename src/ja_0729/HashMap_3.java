package ja_0729;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3 {
	
	static HashMap phonebook = new HashMap();
	
	public static void main(String[] args) {
		
		addPhoneNo("친구","수선화","010-456-7890");
		addPhoneNo("친구","해당화","010-123-1230");
		addPhoneNo("친구","해당화","010-432-1250");
		addPhoneNo("친구","들국화","010-678-6780");
		addPhoneNo("회사","영산강","010-457-7767");
		addPhoneNo("회사","섬진강","010-546-5890");
		addPhoneNo("회사","금강","010-886-7770");
		addPhoneNo("회사","한강","010-945-2560");
		addPhoneNo("세탁","010-456-7890");
		
		printList();
		
		
	}
	//전화 번호부 전체를 출력
	
	private static void printList() {
		Set set = phonebook.entrySet();
		Iterator itt = set.iterator();
		
		while(itt.hasNext()) {
			
			Map.Entry e = (Entry)itt.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				
				Map.Entry subE = (Entry)subIt.next();
				
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				
				System.out.println(name + " "+telNo);
			}
			System.out.println();
			}
	}
	private static void addPhoneNo(String name , String tel) {
		
		addPhoneNo("기타",name,tel);
	}

	private static void addPhoneNo(String groupName , String name , String tel) {
		addGroup(groupName);
		
		HashMap group = (HashMap)phonebook.get(groupName);
		group.put(tel, name);
	}
	private static void addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap());
		}
	}
}





































