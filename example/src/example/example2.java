package example;
import java.math.*;
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		BigInteger bi1, bi2, bi3;

	      bi1 = new BigInteger("7");
	      bi2 = new BigInteger("20");

	      // multiply bi1 with bi2 and assign result to bi3
	      bi3 = bi1.multiply(bi2);

	      String str = bi1 + " * " + bi2 + " = " +bi3;

	      // print bi3 value
	      System.out.println("Multiplication result is " +str);

	}

}

