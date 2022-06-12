package collection;

import java.util.HashMap;

public class HMapTest2 {
	public static void main(String[] args) {
		HashMap<User, Integer> users = new HashMap<User, Integer>();
		users.put(new User(1, "apple", "김사과"), 1000);
		users.put(new User(2, "banana", "반하나"), 2000);
		users.put(new User(3, "cherry", "이체리"), 3000);
		
		
//		HashMap, HashSet은 HashCode()를 이용해서 두 객체가 동일한지를 비교
		users.remove(new User(2, "banana", "반하나"));
		
		System.out.println(users);
	}
	
	
}
