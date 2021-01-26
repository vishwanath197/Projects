package classAndobject;

public class Mobile {
public String processor; // Snapdrive
	public String OS;// Andriod
	protected int RAM;//4
	int battery ;//4500
	
	void communciation (){
		System.out.println("Calls , Texting, Mails");
	}
	void entertainment(){
		System.out.println("Music,Video Streaming,playing Games");
	}
	public String toString() {
		return "Processor : " + processor + " RAM : " + RAM + " Battery : " + battery;
	}
	
}

package classAndobject;

public class MobileMain {

	public static void main(String[] args) {
		Mobile Mi = new Mobile();
		
		//  Access -- Referencevariable.classMember
		
		
		Mi.processor = "Snapdrive";
		Mi.OS = "Andriod";
		Mi.RAM = 4;
		Mi.battery = 4500;
		
		Mi.communciation();
		Mi.entertainment();
		
		System.out.println("Mi : ");
		System.out.println("Processor : " + Mi.processor);
		System.out.println("OS : " + Mi.OS);
		System.out.println("RAM : " + Mi.RAM);
		System.out.println("Battery : " + Mi.battery);
		
		System.out.println("------------------------------------------------");
		
		Mobile oneplus = new Mobile();
		oneplus.processor = "SnapDrive";
		oneplus.RAM = 8;
		oneplus.OS = "Andriod 11";
		oneplus.battery =  5500;
		
		
		System.out.println("oneplus : ");
		System.out.println("Processor : " + oneplus.processor);
		System.out.println("OS : " + oneplus.OS);
		System.out.println("RAM : " + oneplus.RAM);
		System.out.println("Battery : " + oneplus.battery);
		
		oneplus.communciation();
		oneplus.entertainment();
		
		
			
		Mobile m1 ; // created a reference variable
		
		m1 = oneplus;
		System.out.println("------------------------------------------------");
		System.out.println(m1.battery);
		

	}

}

package classAndobject;

public class Rectangle {
	// fields
	private float length; 
	private float breadth;
	
	// setters: assign value to fields  and Getters : Access those fields
	
	public void setLength(float length) { // l = 2.3
		this.length = length; // length = 2.3
		
	}
	
	public void setBreadth(float breadth) { 
		this.breadth = breadth; // 1.5
	}
	
	
	public float getLength() {
		return length;
	}
	
	
	public float getBreadth() {
		return breadth;
	}
	
	
	double getArea() {
		return length * breadth;
	}

	double getPerimeter() {
		return 2 * (length + breadth);
	}

	public String toString() {
		return "length : " + length + "\n" + "Breadth : " + breadth + "\n" + "Area : " + getArea() + "\n"
				+ "Perimeter : " + getPerimeter();
	}
}

package classAndobject;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
	
		r1.setLength(2.3f);
		r1.setBreadth(1.5f);
		
		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());
		
		
		System.out.println(r1.toString());
		
		Rectangle r2 = new Rectangle();
		
		
		System.out.println("-----------------------------------------------------------");
	
		
		System.out.println(r2.toString());
	}
}

package AccessModifiers;

import classAndobject.Mobile;

public class MainClass {
	public static void main(String[] args) {
		Mobile vivo = new Mobile();
		vivo.OS = "Andriod 9";
		vivo.processor = "";
			}

}
