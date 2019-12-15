import java.util.ArrayList;

public class ArraylistEx {
	public static ArrayList<Integer> check(ArrayList<Integer> firstArrayList) {
		String number1 = "";
		String number2 = "";
		int i = 0;
		ArrayList<Integer> secondArrayList = new ArrayList<>();
		if (firstArrayList.size() == 0)
			return firstArrayList;
		else if (firstArrayList.size() % 2 == 1) {
			firstArrayList.remove(firstArrayList.size() - 1);
		}
		while (i < firstArrayList.size()) {
			number1 = Integer.toString(firstArrayList.get((i)));
			number2 = Integer.toString(firstArrayList.get((i + 1)));
			if (Integer.valueOf(number1) <= Integer.valueOf(number2)) {
				secondArrayList.add(Integer.valueOf(number1));
				secondArrayList.add(Integer.valueOf(number2));
			}
			i += 2;
		}
		firstArrayList = secondArrayList;
		return firstArrayList;
	}
}
