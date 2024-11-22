
public class Roomclass {
	private String description;
	private Item item;
}
	public Roomclass(String description) {
		description = description;	
	}
	public String getDescription() {
		return description;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}

public class Room {
	private boolean locked;
	private String name;
	
	public Room(String name) {
		this.name = name;
		this.locked = false;
	}
	public boolean islocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}