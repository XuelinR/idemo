package designpattern.factory.idcard;

import java.util.ArrayList;

import designpattern.factory.framework.Factory;
import designpattern.factory.framework.Product;



/**
 * @author XuelinR
 *	Factory Method 生产ID卡的工厂
 */
public class IDCardFactory extends Factory {
	private ArrayList<String> owners = new ArrayList<String>();

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add(((IDCard)product).getOwner());
	}
	public ArrayList<String> getOwners(){
		return owners;
	}
}
