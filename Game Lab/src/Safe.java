
public class Safe extends Item {
	public safe(String name, String description) {
		super(name, description);
	}
	@Override
	public void open() {
		Item Combination = Game.getplayer().getItemFromInventory("combination");
		if (combination != null) {
			Game.print("using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
			Item diamond = new Item("Diamond", "A valuable diamond.");
			Game.getPlayer().addItemToinventory(diamond);
		}else {
			Game.print("The safe is locked and you don't have the combination.");
		}
	}
}
