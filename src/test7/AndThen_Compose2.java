package test7;

import java.util.function.Function;

public class AndThen_Compose2 {
	
	public static void main(String[] args) {
		
		Function<Member2, Address2> funA;
		Function<Address2, String> funB;
		Function<Member2, String> funAB;
		
		funA = (m) -> m.getAddress();
		funB = (a) -> a.getCity();
		
		funAB = funA.andThen(funB);
		String city = funAB.apply(
				new Member2("aaa", "bbb", new Address2("tt", "bb"))
				);
			
		System.out.println("city:"+ city);
		
		
		funAB = funB.compose(funA);
		city = funAB.apply(
				new Member2("aaa", "bbb", new Address2("tt", "bb"))
				);
		System.out.println("city:"+ city);
		
	}
	
}

class Member2 {
	private String name;
	private String id;
	private Address2 address;
	
	public Member2(String name, String id, Address2 address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}
	
	
}

class Address2 {
	private String country;
	private String city;
	
	public Address2(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
