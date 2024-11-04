import itemclass.item;

public class playerInventory {
}

public class Game {
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
	