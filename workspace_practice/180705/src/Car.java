
public class Car {

	String color;
	String gearType;
	int door;
	
	static int n = 0;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car( String color, String gearType, int door ){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		n++;
	}
	
	Car( Car c ){
		this(c.color, c.gearType, c.door);
	}
	
	void del() {
		n--;
	}
	
	static int count() {
		return n;
	}
	

	
}

