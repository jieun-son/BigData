package com.lect.ex2_map;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
public class Ex02_FriendHashMap {
	public static void main(String[] args) {
		HashMap<String, Friend> friends = new HashMap<String, Friend>();
		friends.put("ȫ�浿", new Friend("ȫ�浿","9999-9999", new Date(90,0,1)));
		friends.put("�ű浿", new Friend("�ű浿","8888-8888"));
		friends.put("���浿", new Friend("���浿","7777-8888"));
		Iterator<String> iterator = friends.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+"�� ������ " + 
						friends.get(key));
		}
	}
}
