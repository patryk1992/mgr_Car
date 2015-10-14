package rest;

public class Group {
	private final long id;
    private final String userName;
    private final String groupName;
    private final String name;
	public Group(long id, String userName, String groupName, String name) {
		super();
		this.id = id;
		this.userName = userName;
		this.groupName = groupName;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getGroupName() {
		return groupName;
	}
	public String getName() {
		return name;
	}
    
}
