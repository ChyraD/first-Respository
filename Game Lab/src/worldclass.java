
public class worldclass {
	private static Room[]rooms;
	
}
public class World {
	public void setupWorld() {
		Room office = new Room("office");
		Room vaultRoom = new Room("Vault Room");
		
		Safe safe = new Safe("Safe", "It's an impressive safe!");
		Combination combination = new Combination("Combination", "A combination for a safe.");
		
		office.addItem(combination);
		vaultRoom.addItem(safe);
	}
}
