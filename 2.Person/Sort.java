import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
	static void sortBylastNameLength(ArrayList<Person> person) {
		System.out.println("Sort by lastname length:");
		person.sort(Comparator.comparing(Person::getlengthOfLastName));
		for (Person p : person) {
			System.out.println("Name:" + p.getFirstName() + "\t" + "LastName:" + p.getLastName() + "  \t"
					+ "LastNameLenght:" + p.getlengthOfLastName());
		}
	}

	static void sortByAge(ArrayList<Person> person) {
		System.out.println("Sort by age:");
		person.sort(Comparator.comparing(Person::getAge));
		for (Person p : person) {
			System.out.println(
					"Name:" + p.getFirstName() + "\t" + "LastName:" + p.getLastName() + "  \t" + "Age:" + p.getAge());
		}
	}

	static void customSort(ArrayList<Person> person) {
		System.out.println("filtered by (City:Tehran & zone<=5)");
		person.stream().filter(s -> s.getAddress().getCity().equalsIgnoreCase("tehran"))
				.filter(s -> s.getAddress().getZone() <= 5)
				.forEach(s -> System.out.println("Name:" + s.getFirstName() + "\t" + "LastName:" + s.getLastName()
						+ "  \t" + "Age:" + s.getAge() + "\n" + "Lives in " + s.getAddress().getCity() + " in zone "
						+ s.getAddress().getZone()));
	}
}