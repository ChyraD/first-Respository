
public class Puppy extends NPC {
	
	public Puppy() {
		super("puppy", "A hideous puppy wags his tail.");
	}
	
	@Override
	public void talk() {
		if(talkCount==0) {
			say("Hi! I'm an adorable puppy!");
			String[] options= {
					"Yes you are! Who's a good boy/girl?",
					"Ew, no. You're actually kinda hideous."
			};
			getResponse(options);
			} else if (talkCount==1) {
				say("Hey! Wanna play fetch? say yes!");
				String[] options = {
						"Yes! I love fatch!",
						"No. I am a horrible person and don't like playing with puppies."
				};
				getResponse(options);
				} else {
					say("Yip!");
					Game.print("The puppy wags his tail happily.");
				}
				talkCount++;
		}
	}
	@Override
	public void response(int option) {
		if(talk count==1) {
			switch(option) {
				say("I am! I'm a good boy!");
				break;
				say("I am adorable! Why are you so mean to me?");
				Game.print("The puppy bites you!");
				break;
			}
		}
		else if(talk count==2) {
			switch(option) {
				say("yay! Fetch!");
				Game.print("The puppy runs off.");
				break;
				say("you're a bad person.");
				Game.print("puppy runs away and no return.");
				break;
			}
		}
	}	
}
