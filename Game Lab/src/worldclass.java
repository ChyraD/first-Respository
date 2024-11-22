import java.util.ArrayList;

public class worldclass {
	private static Room[]rooms;
	
}
public class World {
	private List<Rooms> rooms;
	public void setupWorld() {
		Room office = new Room("office");
		Room vaultRoom = new Room("Vault Room");
		
		Safe safe = new Safe("Safe", "It's an impressive safe!");
		Combination combination = new Combination("Combination", "A combination for a safe.");
		
		office.addItem(combination);
		vaultRoom.addItem(safe);
	}
	public World() {
		rooms = new ArrayList<>();
		rooms.add(new Room("Cafe"));
		rooms.add(new Room("Bookstore"));
		rooms.add(new Room("Health Office"));
		rooms.add(new Room("Gym"));
	}	
}
