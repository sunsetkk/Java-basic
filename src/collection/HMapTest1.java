package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HMapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();
		
//		HashMap에 요소 추가하기
		dict.put("fly", "날다");
		dict.put("walk", "걷다");
		dict.put("run", "뛰다");
		
//		HashMap의 간단하게 구조 파악하기
		System.out.println(dict);
		
//		HashMap의 요소 수정하기
//		기존의 존재하던 Key에 새로운 Value를 추가하면 수정이 일어난다.
		dict.put("run", "달리다");
		System.out.println(dict);
		
//		HashMap의 요소 삭제하기
//		System.out.println(dict.remove("run"));
//		System.out.println(dict);
		
		dict.remove("run", "달리다");
		System.out.println(dict);
		
//		HashMap에서 요소 가져오기 
		System.out.println(dict.get("walk"));
		
//		String[] keys = {"fly", "walk", "run"};
		Set<String> keyset = dict.keySet();
		Iterator<String> keyiter = keyset.iterator();
		
//					HashMap의 요소 개수(한 쌍을 한개로 센다)
		for (int i = 0; i < dict.size(); i++) {
//			dict.get(keys[i]);
			System.out.println("키 : " + keyiter.next());
		}
		
		Collection<String> values = dict.values();
		Iterator<String> valuesiter = values.iterator();
		
		Set<Entry<String, String>> entryset = dict.entrySet();
		Iterator<Entry<String, String>> entryiter = entryset.iterator();
		
		Entry<String, String> entry = entryiter.next();
		System.out.println("엔트리의 키 : " + entry.getKey());
		System.out.println("엔트리의 값 : " + entry.getValue());
	}
}




















