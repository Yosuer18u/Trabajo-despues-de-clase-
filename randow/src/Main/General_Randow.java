package Main;

import java.util.Random;

public class General_Randow {

	public void general(int upperbound) {
		
		Random rand= new Random();
		
		int int_random = rand.nextInt(upperbound);
		
		double double_random = rand.nextDouble();
		
		float float_random = rand.nextFloat();
		
		System.out.println("Random interger value from 0 to " + (upperbound-1) + " : " + int_random);
		System.out.println("Random float value between 0.0 and 1.0 " + float_random);
		System.out.println("Random double value between 0.0 and 1.0 " + double_random);
	}

}
