package mentoring2;

public class SwitchCase {

	
	public static void main(String[] args) {
		
		int menuNumber = 3;
		String foodName = null;
		
		switch (menuNumber){
			case 1:
				foodName ="Coffee";
			break;
			case 2:
				foodName = "pizza";
			break;
			case 3:
				foodName = "Chicken fry";
			break;
			case 4:
				foodName = "Fride rice";
			break;
		}
			System.out.println("Your food name is :" +foodName);
			
		
	
}
}