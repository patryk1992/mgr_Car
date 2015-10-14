package rest;

public class Login {
	private final long id;
    private final String name;
    private final String password;
	public Login(long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
    
}
