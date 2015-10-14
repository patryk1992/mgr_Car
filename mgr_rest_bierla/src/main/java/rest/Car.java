package rest;

public class Car {
	private final long id;
    private final String userName;
    private final String car;
	public Car(long id, String userName, String car) {
		super();
		this.id = id;
		this.userName = userName;
		this.car = car;
	}
	public long getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getCar() {
		return car;
	}
}
