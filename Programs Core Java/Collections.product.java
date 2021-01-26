package collections.product;
import java.lang.Comparable;
public class Product implements Comparable<Product> {

	private int id;
	private float weight, price;
	private static int idgenerator = 101;

	
	@Override
	public int compareTo(Product o) {
		if (weight > o.getWeight()) 
			return -1;
		else if(weight < o.getWeight())
			return 1;
			
		
		return 0;
	}
	
	
	
	
	
	
	public Product(float weight, float price) {
		id = idgenerator++;
		this.weight = weight;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
	}


	
	
}

package collections.product;

import java.util.*;

public class ProductInfo {
	public static void main(String[] args) {

		List<Product> productList = new LinkedList<Product>();
		productList.add(new Product(23.5f, 480f));
		productList.add(new Product(12.3f, 560f));
		productList.add(new Product(2.5f, 80f));
		productList.add(new Product(1.5f, 40f));
		productList.add(new Product(123.5f, 1480f));
		productList.add(new Product(24.5f, 460f));
		productList.add(new Product(56.5f, 480f));
		productList.add(new Product(23f, 480f));
		productList.add(new Product(96f, 580f));
		productList.add(new Product(89.5f, 480f));
		productList.add(new Product(55.5f, 80f));
		productList.add(new Product(15.5f, 980f));

		for (Product p : productList) {
			System.out.println(p);
		}

		System.out.println("---------------------------------------------------");
		/*
		 * Collections.sort(productList);
		 * 
		 * for (Product p : productList) { System.out.println(p); }
		 */

		Set<Product> productSet = new TreeSet<Product>();
		productSet.addAll(productList);
		for (Product p : productSet) {
			System.out.println(p);
		}

		System.out.println("---------------------------------------------------");

		getDuplicateCostProducts(productList);

	}


	public static void getDuplicateCostProducts(List<Product> productList) {
		
		System.out.println("--------------------------------------------------------------");
		for (Product p1 : productList) {
			int count = 0;
			for(Product p2 : productList) {
				if(p1.getPrice() == p2.getPrice()) {
					count++;

				}
			}
			if(count >=2)
				System.out.println(p1);

		}
	}
	
	public void getDuplicate(List<Product> productList) {
		Set<String> priceSet = new TreeSet<String>();
		
		for(Product p1 : productList) {
			String price = String.valueOf(p1.getPrice());
			
	//		if(priceSet.contains(price))
				
		}
		
		
	}

}
