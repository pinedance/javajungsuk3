package ex02;

public class SCV extends GroundUnit implements Repairable {
	
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		System.out.println("called");
		if ( r instanceof Unit ) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}
}
