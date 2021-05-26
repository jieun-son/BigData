package com.lect.ex1_list;
import java.util.ArrayList;
import java.util.Date;
import com.lect.ex2_map.Friend;
public class Ex04_FriendArrayList {
	public static void main(String[] args) {
		Friend[] friends = new Friend[2]; 
		friends[0] = new Friend("홍길동", "9999-9999", new Date(100, 2, 1));
		friends[1] = new Friend("신길동", "8888-8888", new Date(100, 5, 6));
		// **************************************************
		ArrayList<Friend> fs = new ArrayList<Friend>();
		Friend temp = new Friend("홍길동", "9999-9999", new Date(100, 2, 1));
		fs.add(temp);
		fs.add(new Friend("신길동", "8888-8888", new Date(100, 5, 6)) );
		System.out.println(fs);
		for(int i=0 ; i<fs.size() ; i++) {
			System.out.println(fs.get(i));
		}
		for(Friend f : fs) {
			System.out.println(f);
		}
	}
}









