
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
