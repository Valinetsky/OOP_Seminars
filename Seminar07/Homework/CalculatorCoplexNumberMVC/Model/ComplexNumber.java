package Model;

/**
 * Класс определяющий комплексное число
 */
public class ComplexNumber {

	/** Действительная часть комплексного числа */
	private double a;
	/** Мнимая часть комплексного числа */
	private double b;

	/**
	 * Конструктор комплексного числа (два параметра)
	 * 
	 * @param a - Действительная часть
	 * @param b - Мнимая часть
	 */
	public ComplexNumber(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Конструктор комплексного числа (один параметр)
	 * 
	 * @param c - Действительная и мнимая части равны
	 */
	public ComplexNumber(double c) {
		this(c, c);
	}

	/**
	 * Геттер действительной части
	 * 
	 * @return - возвращает double действительной части
	 */
	public double getA() {
		return a;
	}

	/**
	 * Сеттер действительной части
	 * 
	 * @param a - Действительная часть
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Геттер мнимой части
	 * 
	 * @return возвращает double мнимой части
	 */
	public double getB() {
		return b;
	}

	/**
	 * Сеттер мнимой части
	 * 
	 * @param b - Мнимая часть
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * Метод обрезки чисел для вывода на экран
	 * Если число без десятичных знаков - оно переобразуется в тип int
	 * Потом преобразование в строку
	 * 
	 * @param x - double number - входной формат
	 * @return - строковый выходной формат, возможно укороченный,
	 *         без избыточных нулей после десятичного разделителя
	 */
	private String numberToString(double x) {
		if (x == (int) x) {
			return Integer.toString((int) x);
		}
		return Double.toString(x);
	}

	/**
	 * Переопределение метода toString():
	 * сборка единой конструкции из действительной и мнимой части
	 */
	@Override
	public String toString() {
		return String.format("(%s + %si)", this.numberToString(a), this.numberToString(b));
	}
}
