
public class itemclass {
	private String name;
	private String description;
	
	public itemclass(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public String getname() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public itemclass() {
		return item;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String Description) {
		this.description = description;
	}
	public String toString() {
		return name;
	}
	public class item {
		public void open() {
			Game.print("You can't open that!");
		}
		public void use() {
			Game.print("You can't use that!");
		}
	}
}	
	