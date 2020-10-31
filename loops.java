package week2;

public class loops {

	public static void main(String[] args) {
		// 	Create a new class called Loops. In the main method of this class, create the following loops with any variables you feel are needed
		//	A while loop that prints all even numbers from 0 to 100
		System.out.println("Even numbers up to 100 are:");
		int num = 0;
		while(num <= 100) 
		{
			System.out.println(num);
			num = num + 2;
		}
		//	A while loop that prints every 3rd number going backwards from 100 
		//	until we reach 0
		System.out.println("Every 3rd number from 100 to 0  100 are:");
		int num2 = 100;
		while(num2 >= 0)
		{
			System.out.println(num2);
			num2 = num2 - 3;
		}
		//	A for loop that prints every other number from 1 to 100
		System.out.println("Every number from 1 to 100 are:");
		for (int num3 = 1; num3 <= 100; num3++) {
		     System.out.println(num3);
		}
		//	A for loop that prints every number from 0 to 100, but if the number 
		//	is divisible by 3, it prints “Hello” instead of the number, and if the
		//	number is divisible by 5, it prints “World” instead of the number, 
		//	and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		for (int num4 = 0; num4 <= 100; num4++) {
			if(num4 % 3 == 0 && num4 % 5 == 0) {
				System.out.println("HelloWorld");
			}
			else if(num4 % 5 == 0) {
				System.out.println("Hello");
			} 
			else if(num4 % 3 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(num4);
			}
		}
	}
	

}
