package encapsulation;

public class Student {
	private int id; // 101
	private String name; //Arvind
	private int[] marks; // {56,89,78,45,96,63};
	private static String CollegeName = "SVIET";
	
	// setters
	
	public void setId(int i) { // i =  101
		id = i;
	}	
	public void  setName(String n) { //n = Arvind
		name = n;
	}	
	public void setMarks(int[] m) { // m = {56,89,78,45,96,63};
		marks = m;
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
	
	
	public float getPercentage() {
		int sum = 0;
		
		for(int i = 0;i<marks.length;i++) {
			sum += marks[i];
		}
		
		return ((float)sum / (marks.length*100))*100;
	}
	
	
	public String toString() {
		String m = "";
		
		for (int i = 0;i < marks.length; i++ ) {
			m +=    marks[i] + ","; 
		}
		
		return "ID : " + id + ", Name = " + name  + ", Marks = " + m +" Percentage : " + getPercentage() +" CollegeName" + CollegeName;
	}
	
}

package encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		Student s1 = new Student(); // JVM created Default constructor
		s1.setId(101);
		s1.setName("Arvind");
		
		int[] marks = {56,89,78,45,96,63};
		s1.setMarks(marks);
		
		
		System.out.println(s1.getPercentage());
		System.out.println(s1.getId() + " " + s1.getPercentage());
		System.out.println(s1.getName() + " " + s1.getPercentage());
//.collegeName;
		System.out.println(s1);
		
		Student s2 = new Student();
			s2.setId(102);
			s2.setName("Rahul");
			s2.setMarks(marks);
		System.out.println(s2);

	}

}
