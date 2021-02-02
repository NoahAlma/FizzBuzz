import java.util.*;
import java.util.concurrent.TimeUnit;

public class FizzBuzz {
	public static String FB(int number) {
		if (number % 3 == 0) {
			if (number % 5 == 0) {
				return "FizzBuzz";
			} else {
				return "Fizz";
			}
		} else if (number % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(number);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a number to count up to. ");
		int number = scanner.nextInt();
		int start = 1;
		while (start > 0) {
			if (start == number) {
				System.out.println(FB(number));
				break;
			}
			System.out.println(FB(start));
			start++;
			TimeUnit.MILLISECONDS.sleep(500);
		}
		scanner.close();
	}
}
