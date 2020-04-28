package com.misaka.libmanager.po;

public class Book {
	private String id;
	private String name;
	int flag;
	public Book(String id, String name,int flag) {
		super();
		this.id = id;
		this.flag = flag;
		this.name = name;
	}
	public String getId() {
		return id;//返回id
	}
	public void setId(String id) {
		this.id = id;//id赋值
	}
	public String getName() {
		return name;
		/*返回用户姓名*/
	}
	public void setName(String name) {
		this.name = name;//姓名赋值
	}
	public int getFlag() {
		return flag;
	}
	public String toString() {
		return "'"+id+"'"+","+"'"+name+"',"+"'"+flag+"'";
	}
}
