package abstraction;

public abstract class HeadOffice {
	private String name;
	
	public HeadOffice(){}
	
	public HeadOffice(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	abstract void ageValidation();
	abstract void NationValidation();

}

package abstraction;

public class IndiaCountry extends HeadOffice{
	
	
	public IndiaCountry(){}
	
	public IndiaCountry(String name){
		super(name);
	}
	
	
	
	void ageValidation() {
		System.out.println("Age Validation is done through DOB certificate");
	}
	 void NationValidation() {
		 System.out.println("Nation Validation is done through AADHAR Card");
	 }

}

package abstraction;

public class PakistanCountry extends HeadOffice{

	void ageValidation() {
		System.out.println("Age Validation is done through Transfer certificate");
	}
	 void NationValidation() {
		 System.out.println("Nation Validation is done through Ration Card");
	 }
}

package abstraction;

public class Validation {

	public static void main(String[] args) {
		
		HeadOffice h ;
		
		
		IndiaCountry India  = new IndiaCountry("IndianPassport");
		System.out.println(India.getName());
		India.ageValidation();
		
		
		PakistanCountry Pakistan = new PakistanCountry();
		Pakistan.ageValidation();

	}

}

