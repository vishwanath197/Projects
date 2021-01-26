package collections.cabCustomer;

public class CabCustomer {
	
	  private  int custId ;
	  private String customerName , pickupLocation ,dropLocation ;
	  private int  distance; 
	  private long phone ;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	 
	  
	public CabCustomer() {}
	
	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			long phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
	}
	
}


package collections.cabCustomer;
import java.util.*;
public class CabCustomerService {
	
	private ArrayList<CabCustomer> customerList = new ArrayList<CabCustomer>();
	
	
	/*public ArrayList<CabCustomer> getCustomerList() {
		return customerList;
	}*/

	public void addCabCustomer(CabCustomer customer) {
		
		customerList.add(customer);
		
	}
	
	public boolean isFirstCustomer(CabCustomer customer) {
		
		for(CabCustomer customer1 : customerList) {
			if(customer1.getPhone() == customer.getPhone()) {
				
				return false;
			}	
		}
		
		
		
		//addCabCustomer(customer);
		return true;
	}
	
	public double calculateBill(CabCustomer customer) {//c1
		
		if(isFirstCustomer(customer))// c1
			return 0.0;
		
		else if(customer.getDistance() <= 4)
			return 80.0;
		
		else
			return 80 + ((customer.getDistance() - 4) * 6);
		
	}
	
	
	public String printBill(CabCustomer customer) {//c1
		
		return customer.getCustomerName() + "  Please pay your bill of  "  + calculateBill(customer);
		
	}

}

// {1,1,2,3,4,3,4,5,6}  1 - 2, 2 - 1 , 3 - 2  , 





package collections.cabCustomer;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		CabCustomer c1 = new CabCustomer(101,"Arun","SEC","JNTU",56,987456321l);
		CabCustomer c2 = new CabCustomer(102,"Sneha","Gachibowli","HitechCity",5,9632588741l);
		CabCustomer c3 = new CabCustomer(101,"Arun","SEC","JNTU",57,987456321l);
		
		
		CabCustomerService service = new CabCustomerService();
		//service.addCabCustomer(c1);
		
		
		System.out.println(service.printBill(c1));
		System.out.println(service.printBill(c2));
		System.out.println(service.printBill(c3));
		

	}

}

