package test8;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member()...");
	}
	
	public Member(String id) {
		System.out.println("Member(String id)...");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)...");
		this.name = name;
		this.id = id;
	}
	
}
