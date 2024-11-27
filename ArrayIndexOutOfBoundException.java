package Array;

public class ArrayIndexOutOfBoundException {
	
	public static void main(String[] args) {
		String[] student= {"ramya","Arjun","Rahul"};
		for(int i=1;i<student.length;i++) {
			System.out.println("Student"+(i+3)+" : "+student[i]);
			
		}
		System.out.println("\nAccessing a student outside the array bounds:");
		System.out.println("Student 3:"+student[4]);
		
		
	}

}
