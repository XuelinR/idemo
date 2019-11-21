package designpattern.factory.idcard;

import designpattern.factory.framework.Product;

/**
 * @author XuelinR
 *  Factory Method ID卡产品加工处理
 */
public class IDCard extends Product {
	private String owner;
	
	IDCard(String owner) {
		// TODO Auto-generated constructor stub
		System.out.println("制作"+owner+"的ID卡");
		this.owner = owner;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("使用"+owner+"的ID卡");
	}
	public String getOwner() {
		return owner;
	}
}
