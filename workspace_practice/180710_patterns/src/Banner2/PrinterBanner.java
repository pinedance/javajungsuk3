package Banner2;


public class PrinterBanner extends Printer  {

	private Banner banner;
	
	public PrinterBanner(String string) {
		this.banner = new Banner(string);
	}

	public void printWeak() {
		banner.showWithParen();
	}

	public void printString() {
		banner.showWithAster();
	}
	
	
}
