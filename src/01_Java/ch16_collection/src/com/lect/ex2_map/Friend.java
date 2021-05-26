package com.lect.ex2_map;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Friend {
	private String name;
	private String tel;
	private Date birth;
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public Friend(String name, String tel, Date birth) {
		this.name = name;
		this.tel = tel;
		this.birth = birth;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("M월 d일");
		if(birth!=null) {
			return name+"의 연락처 : "+tel+", 생일 : "+sdf.format(birth);
		}else {
			return name+"의 연락처 : "+tel;
		}
	}
}






