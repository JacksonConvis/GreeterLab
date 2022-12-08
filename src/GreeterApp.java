import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the greeter application: Please enter a greeting");
		String greeting = scan.next();
		Greeter greet1 = new Greeter(greeting);
		System.out.println("Great! now enter your name!");
		String name = scan.next();
		System.out.println(greet1.greet(name));

		System.out.println("Enter another greeting:");

		greeting = scan.next();

		System.out.println("Enter your name:");
		name = scan.next();
		// calling various subclass objects of the greeter class
		LoudGreeter loudgreet = new LoudGreeter(greeting);
		HtmlGreeter htmlgreet = new HtmlGreeter(greeting);
		SimonGreeter simongreet = new SimonGreeter(greeting);
		loudgreet.addVolume();
		System.out.println("Would you like the default HTML tag?(y/n)");
		String yn = scan.next();
		if (yn.equalsIgnoreCase("n")) {
			System.out.println("Please enter your desired HTML tag");
			String tagname = scan.next();
			htmlgreet.setTagname(tagname);
		}

		System.out.println(loudgreet.greet(name));
		System.out.println(simongreet.greet(name));
		System.out.println(htmlgreet.greet(name));

		scan.close();

	}

}