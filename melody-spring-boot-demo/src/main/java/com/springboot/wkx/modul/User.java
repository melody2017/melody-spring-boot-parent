package com.springboot.wkx.modul;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class User {
	
	@JSONField(serialize = false)
	private String username;
	private String address;
	private String age;
	private String email;
	private String sex;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private String bornTime;
}
