
public class NPC {

		private String name;
		private String desc;
		
		public NPC(String name, String desc) {
			this.name = name;
			this.desc = desc;
		}
		
		public String getName() {
			return name;
		}
		
		public void setDesc(String dialog) {
			this.desc = desc;
		}
		
		public void say(String dialog) {
			Game.print(name+": "+dialog);
		}
		
		public void talk() {
			Game.print("you can't talk to "+name+".");
		}
		
		public void getResponse(String[] options) {
			for(int i=0; i<options.length; i++) {
				Game.print("Option "+(i+1)+": "+options[i]);
			}
			
			Game.print("Enter an option (1-"+options.length+"):");
			int option = Game.scan.nextInt();
			Game.scan.nextLine();
			response(option);
		}
}


