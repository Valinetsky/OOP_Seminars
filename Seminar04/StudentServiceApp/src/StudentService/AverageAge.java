package StudentService;

import java.util.List;

import StudentDomen.User;

public class AverageAge<T extends User> {
	/**
	 * Подсчет среднего возраста людей в группе
	 * 
	 * @param <T>  - обобщенный класс людей - производный от User
	 * @param list - массив людей в группе
	 */
	public static <T extends User> void getAverageAge(List<T> list) {
		double sum = 0;
		for (T person : list) {
			sum = sum + person.getAge();
		}
		sum = sum / list.size();
		System.out.printf("Average Age: %f\n", sum);
	}
}