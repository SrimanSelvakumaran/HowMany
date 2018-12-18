import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Sriman Selvakumaran
 *
 */
public class HowMany {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("How many times would you like to roll the die: ");
		int numb = input.nextInt();
		while (numb < 0) {
			System.out.print("Input is invalid. Please try another number: ");
			numb = input.nextInt();
		}
		int randomx, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		for (int i = 0; i < numb; i++) {
			randomx = rand.nextInt(6) + 1;
			switch(randomx) {
				case 1:
					n1++;
					break;
				case 2:
					n2++;
					break;
				case 3:
					n3++;
					break;
				case 4:
					n4++;
					break;
				case 5:
					n5++;
					break;
				case 6:
					n6++;
					break;
			}
		}
		System.out.print("1: " + n1 + "\n  2: " + n2 + "\n    3: " + n3 + "\n      4: " + n4 + "\n        5: " + n5 + "\n          6: " + n6);
		
	}

}
