class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("Jumping:"+height);
	}
	public void move(String direction,double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}
public class Application {

	public static void main(String[] args) {
		
		Robot cyborg=new Robot();
		cyborg.speak("Mohamed");
		cyborg.jump(99);
		cyborg.move("West", 5.6);
		
		String greetings="On Jarama";
		cyborg.speak(greetings);
		int number=12;
		cyborg.jump(number);

	}

}
