package rest;

public class Registration {
	 	private final long id;
	    private final String name;
	    private final String email;
	    private final String password;
	    private final String city;

	    public Registration(long id, String name, String email, String password, String city) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.city = city;
		}

		public long getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	    public String getEmail() {
			return email;
		}

		public String getPassword() {
			return password;
		}

		public String getCity() {
			return city;
		}
}
