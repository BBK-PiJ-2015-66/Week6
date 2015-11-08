import java.util.Scanner;
public class Employee {


 	Scanner scanner = new Scanner(System.in);
	int numberOfEmp = 2;

    	private int[] employeeID = new int[numberOfEmp];	
    	private String[] employeeName = new String[numberOfEmp];
	

	public void printEmpIdLess1000 (int[] employeeID, String[] employeeName) {
		System.out.println("Employee List: ID less than 1000");
		System.out.println("Name \t ID");

        	for(int i=0; i<numberOfEmp;i++) {
			if (employeeID[i] <= 1000) {
				System.out.println(employeeName[i] + "\t" + employeeID[i]);
			}
        	}
	}
	public void printEmpNameStartingWithJorS (int[] employeeID, String[] employeeName) {
		System.out.println("Employee List: Names starting with J or S");
		System.out.println("Name \t ID");

        	for(int j=0; j<numberOfEmp;j++) {
			char empIntial = employeeName[j].charAt(0);
			if (empIntial == 'J' || empIntial == 'S') {
				System.out.println(employeeName[j] + "\t" + employeeID[j]);
			}
        	}
	}
}