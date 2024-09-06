//Body Mass Index 
package Numbers;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter weight(kg):");
        double weight = obj.nextDouble();
        System.out.print("Enter height(m):");
        double height = obj.nextDouble();
        System.out.print("BMI is "+(weight/(height*height)));
	}

}
