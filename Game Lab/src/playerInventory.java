import itemclass.item;

public class playerInventory {
}

public class Game {
	private Room currentRoom;
	public staticvoid print(Object obj) {
		System.out.println(obj.toString());
	}
}
	private static Room currentRoom;
	public static Room getCurrentRoom() {
		return currentRoom;
	}
	public Item getItemFromInventory(String itemName) {
		for(Item item : playerInventory) {
			if(item.getName().equalsDismissCase(itemName)) {
		}
	}
	return null;
}
	public void enterRoom(Room room) {
		if(room.locked()) {
			System.out.println("The room is locked, you will need a key to enter");
		}else {
			currentRoom = room;
			System.out.println("you have entered" + room.getName()+ ".");
		}
	}
	public void unlock
	switch (command) {
		case "use":
			item itemToUse = getItemFromRoomOrInventory(itemName);
			if (itemToUse != null) {
				itemToUse.use();
			}else {
				game.print("You do not have that item.");
			}
			break;
		case "open":
			item itemToOpen = getItemFromRoomOrinventory(itemname);
			if (itemToOpen !=null) {
				itemToOpen.open();
			}else {
				Game.print("You do not have that item.");
			}
			break;
}
	