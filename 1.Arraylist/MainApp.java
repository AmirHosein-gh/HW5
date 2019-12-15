import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println("Enter your numbers:");
		System.out.println("(Type 'end' when you are finished)");
		while (true) {
			String input = scanner.nextLine();
			if (input.contains("end")) {
				break;
			}
			arrayList.add(Integer.valueOf(input));
			if (input == "end") {
				break;
			}
		}
		System.out.println(ArraylistEx.check(arrayList));
		scanner.close();
	}
}
