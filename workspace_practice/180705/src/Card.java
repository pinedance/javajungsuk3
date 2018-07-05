
public class Card {
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	int kind;
	int number;
	static int width = 100;
	static int height = 1;
	
	Card(int k, int n){
		this.kind = k;
		this.number = n;
	}
}
