package Banner;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		showWithParen();
	}

	@Override
	public void printString() {
		// TODO Auto-generated method stub
		showWithAster();
	}
	
	
	
}
