package rest;

public class Account {
	private final long id;
    private final String name;
    private final String token;
	
	public Account(long id, String name, String token) {
		super();
		this.id = id;
		this.name = name;
		this.token = token;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getToken() {
		return token;
	}
}
