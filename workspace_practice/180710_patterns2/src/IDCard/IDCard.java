package IDCard;

import Framework.*;

public class IDCard extends Product {
	
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "�� IDī��" );
		this.owner = owner;
	}
	
	public void use() {
		System.out.println(owner + "�� IDī�尡 ���Ǿ����ϴ�." );
	}
	
	public String getOwner() {
		return owner;
	}
	
}
