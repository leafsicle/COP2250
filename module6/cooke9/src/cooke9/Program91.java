//Matthew Cooke
//2073995

package cooke9;
public class Program91 {

	public static void main(String[] args) {

		Gift mostExpensive=new Gift("", "", 0,0);;
		//accumulate the total amount spent.
		double total=0;
		// array to hold the 6 object that will be used
		Gift giftArray[] = new Gift[6];
		giftArray[0] = new Gift("Penny", "Dolls", 89.99, 2);
		giftArray[1] = new Gift("Kenny","Toys", 29.99,4);
		giftArray[2] = new Gift("Benny", "Games", 29.99, 6);
		giftArray[3] = new Gift("Jenny", "Knives", 69.99, 3);
		giftArray[4] = new Gift("Denny","Watches",34.99,5);
		giftArray[5] = new Gift("Lenny","Tablets",399.99,1);
		
		//use a foreach loop to process the array as follows:
		for (Gift gift : giftArray) {
			//print the values of the attributes in each Gift element using the toString method.
			System.out.println(gift.toString());
			//print how much was spent on each person
			gift.giftsVal();
			if ((gift.getPrice()*gift.getQty())>(mostExpensive.getPrice()*mostExpensive.getQty())) {
				mostExpensive=gift;
			}
			//accumulate the total amount spent.
			total+=(gift.getPrice()*gift.getQty());
		}
		//report also how many people you gifted.
		System.out.printf("\nOn %d people I spent $%5.2f",giftArray.length,total);
		//identify the recipient of the most expensive Gift and the amount spent for same.
		System.out.printf("\nI spent the most on %s, $%5.2f",mostExpensive.getRecipient(),(mostExpensive.getPrice()*mostExpensive.getQty()));
	}

}
