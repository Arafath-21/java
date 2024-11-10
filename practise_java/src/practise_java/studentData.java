package practise_java;

public class studentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Student data
	    String studentName = "John Doe";
	    int studentID = 15;
	    int studentAge = 23;
	    float studentFee = 75.1234567890f; 
	    double Fse = 75.123456789012345678901234567890;
	    char studentGrade = 'B';
	    int x=10;
	    int a=10;
	    int sum = 0;  
	    for(int j = 1; j<=10; j++) {  
	    	sum = sum + j;  
	    	}  
	    	System.out.println("The sum of first 10 natural numbers is " + sum);  
	    // Print variables
	    System.out.println("Student name: " + studentName);
	    System.out.println("Student id: " + studentID);
	    System.out.println("Student age: " + studentAge);
	    System.out.println("Student fee: " + studentFee);
	    System.out.println("Student grade: " + studentGrade);
	    System.out.println(Fse);
	    System.out.println("first initialised :"+x);
	    System.out.println(x++);
	    System.out.println("After initialised :"+x);
	    System.out.println("first initialised :"+a);
	    System.out.println(++a);
	    System.out.println("After initialised :"+a);

	}

}
