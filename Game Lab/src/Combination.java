
public class Combination extends Item {
	public Combination(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void use() {
		Game.print("If you find a safe, try opening it!");
	}
}
