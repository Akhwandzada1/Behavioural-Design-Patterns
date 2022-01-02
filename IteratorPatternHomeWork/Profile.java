package IteratorPatternHomeWork;

public class Profile {
	private String email;
	private String id;
	public Profile(String email,String id) {
		this.email=email;
		this.id=id;
	}
	public String getEmail() {
		return email;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Profile [email=" + email + ", id=" + id + "]";
	}
	
}
