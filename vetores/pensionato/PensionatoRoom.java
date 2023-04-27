package vetores;

public class PensionatoRoom {
	private String name;
	private String email;
	private int room;
	
	public PensionatoRoom(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String toString() {
		return room + ": " + name + ", " + email;
	}
	
}
