import java.rmi.*;
import java.util.*;

public class RMIClient {
	public static void main(String args[]) throws Exception {
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		x = sc.nextInt();
		System.out.println("Enter num2 : ");
		y = sc.nextInt();

		Multiplication mul = (Multiplication)Naming.lookup("rmi://localhost:1099/MultiplicationServer");

		result = mul.multiply(x, y);

		System.out.println("Multiplication result : " + result);

	}
}