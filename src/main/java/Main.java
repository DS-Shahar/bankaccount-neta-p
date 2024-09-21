class Main {
package lesson1;

public class Main {
	public static void main(String[] args) {
		  BankAccount acct1 = new BankAccount();
	        System.out.println(acct1);

	    }
	Rectangle neta = new Rectangle(5.5, 5.5);
    Rectangle shahar = new Rectangle(9.5, 5.5);

    System.out.println("Drawing the 'neta' rectangle:");
    neta.draw();
    System.out.println("Drawing the 'shahar' rectangle:");
    shahar.draw();

    System.out.println("Drawing the 'neta' rectangle after doubling:");
   

    double areaNeta = neta.calcArea();
    double areaShahar = shahar.calcArea();
   

}
}
}
