package week2;

public class week2 {

	public static void main(String[] args) {
		// In Eclipse, create the following Boolean variables and choose what values they hold
		boolean isHotOutside =  false;
		boolean isWeekDay = false;
		boolean hasMoneyInPocket = true;
		// Create the following variables (not boolean type, choose the best data type for the variable):
		double costOfMilk = 1.99;
		double moneyInWallet = 12.99;
		int thirstLevel = 3;
		// Using the variables you created above and Boolean operators, create variables for the following scenarios
		boolean shouldBuyIcecream = hasMoneyInPocket && !isHotOutside;  
		boolean willGoSwimming = !isHotOutside && !isWeekDay;
		boolean isAGoodDay = !isHotOutside && hasMoneyInPocket && !isWeekDay;
		boolean willBuyMilk = !isHotOutside && thirstLevel >= 3 && moneyInWallet > costOfMilk * 2;
		
		System.out.println("shouldBuyIceCream = " + shouldBuyIcecream);
		System.out.println("willGoSwimming = " + willGoSwimming);
		System.out.println("isAGoodDay =  " + isAGoodDay);
		System.out.println("willBuyMilk = " + willBuyMilk);
	}

}

