public class HtmlGreeter extends Greeter {
	private String tagname;

	@Override
	public String greet(String name) {
		return ("<" + tagname + ">" + super.greet(name) + "<" + tagname + ">");
	}

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public HtmlGreeter(String greeting) {
		super(greeting);
		tagname = "h1";
	}

}