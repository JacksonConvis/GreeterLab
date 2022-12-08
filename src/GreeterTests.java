import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {
	@Test
	void greeterTest() {
		String hi = "Hi";
		String jack = "Jack";
		Greeter greet1 = new Greeter(hi);
		assertEquals("Hi, Jack!", greet1.greet(jack));
	}

	@Test
	void greeterTest2() {
		String hello = "Hello";
		String dustin = "Dustin";
		Greeter greet1 = new Greeter(hello);
		assertEquals("Hello, Dustin!", greet1.greet(dustin));
	}

	@Test
	void simonTest() {
		SimonGreeter greet = new SimonGreeter("howdy");
		assertEquals("Simon says, howdy, Jack!", greet.greet("Jack"));
	}

	@Test
	void simonTest2() {
		SimonGreeter greet = new SimonGreeter("Hola");
		assertEquals("Simon says, Hola, Sedgewick!", greet.greet("Sedgewick"));
	}

	@Test
	void loudTest() {
		LoudGreeter lgreet = new LoudGreeter("hey");
		assertEquals("hey, Eustace!!", lgreet.greet("Eustace"));
	}

	@Test
	void loudTest2() {
		LoudGreeter lgreet2 = new LoudGreeter("Greetings!");
		assertEquals("Greetings!, Samwise!!", lgreet2.greet("Samwise"));
	}

	@Test
	void htmltest() {
		HtmlGreeter htmlgreet = new HtmlGreeter("welcome");
		assertEquals("<h1>welcome, Bilbo!<h1>", htmlgreet.greet("Bilbo"));
	}

	@Test
	void htmltest2() {
		HtmlGreeter htmlgreet = new HtmlGreeter("Enter");
		assertEquals("<h1>Enter, Brendan!<h1>", htmlgreet.greet("Brendan"));
	}

}