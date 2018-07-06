package ex02;

class GroundUnit extends Unit {
	GroundUnit( int hp ){
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp){
		super(hp);
	}
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}
	


