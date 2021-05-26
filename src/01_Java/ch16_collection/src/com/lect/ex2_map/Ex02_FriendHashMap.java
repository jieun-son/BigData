package com.lect.ex2_map;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
public class Ex02_FriendHashMap {
	public static void main(String[] args) {
		HashMap<String, Friend> friends = new HashMap<String, Friend>();
		friends.put("홍길동", new Friend("홍길동","9999-9999", new Date(90,0,1)));
		friends.put("신길동", new Friend("신길동","8888-8888"));
		friends.put("마길동", new Friend("마길동","7777-8888"));
		Iterator<String> iterator = friends.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+"의 데이터 " + 
						friends.get(key));
		}
	}
}
