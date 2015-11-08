import java.util.Scanner;
public class EmployeeMain {
    	public static void main(String[] args) {

 		Scanner scanner = new Scanner(System.in);
		int numberOfEmp = 2;

    		int[] employeeID = new int[numberOfEmp];	
    		String[] employeeName = new String[numberOfEmp];

		Employee employee = new Employee();
        	for(int i=0; i<numberOfEmp;i++) {
			System.out.print("Please enter employee ID: ");
            		employeeID[i] = scanner.nextInt();

			System.out.print("Please enter employee name: ");
            		employeeName[i] = scanner.next();			


        	}
		employee.printEmpIdLess1000(employeeID, employeeName);
		employee.printEmpNameStartingWithJorS(employeeID, employeeName);

	}
}