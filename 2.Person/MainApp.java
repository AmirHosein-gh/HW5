
import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		ArrayList<Person> personArrayList = new ArrayList<>();

		Person p1 = new Person();
		Address a1 = new Address("amiri", "amini", 2, "tehran", "1387823456");
		p1.setFirstName("amir");
		p1.setLastName("amiri");
		p1.setAge(27);
		p1.setAddress(a1);
		personArrayList.add(p1);

		Person p2 = new Person();
		Address a2 = new Address("mohammadi", "javid", 8, "tehran", "1387885432");
		p2.setFirstName("arman");
		p2.setLastName("asadzade");
		p2.setAge(65);
		p2.setAddress(a2);
		personArrayList.add(p2);

		Person p3 = new Person();
		Address a3 = new Address("javadi", "hoseini", 3, "shiraz", "1234567890");
		p3.setFirstName("mohammad");
		p3.setLastName("mohammadi");
		p3.setAge(19);
		p3.setAddress(a3);
		personArrayList.add(p3);

		Sort.sortByAge(personArrayList);
		System.out.println("========================================================");
		Sort.sortBylastNameLength(personArrayList);
		System.out.println("========================================================");
		Sort.customSort(personArrayList);
	}
}