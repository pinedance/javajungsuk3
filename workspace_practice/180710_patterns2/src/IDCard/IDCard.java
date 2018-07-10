package IDCard;

import Framework.*;

public class IDCard extends Product {
	
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "의 ID카드" );
		this.owner = owner;
	}
	
	public void use() {
		System.out.println(owner + "의 ID카드가 사용되었습니다." );
	}
	
	public String getOwner() {
		return owner;
	}
	
}
