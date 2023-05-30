package View;

import java.util.Scanner;
import Model.ComplexNumber;

/**
 * Клаас вьюера с интерфейсом iCalculatorView
 */
public class DefaultCalculatorView implements iCalculatorView<ComplexNumber> {

	/** Переопределение метода из интерфейса iCalculatorView */
	@Override
	public void exitProgram() {
		System.out.println("Завершение работы программы");
	}

	/** Переопределение метода из интерфейса iCalculatorView */
	@Override
	public void showLabel() {
		System.out.println();
		System.out.println("КАЛЬКУЛЯТОР, РАБОТАЮЩИЙ С КОМПЛЕКСНЫМИ ЧИСЛАМИ");
		System.out.println();
		System.out.println("Последовательность шагов пользователя:");
		System.out.println();
		System.out.println("1. ВВЕДИТЕ ДЕЙСТВИТЕЛЬНУЮ ЧАСТЬ ПЕРВОГО ЧИСЛА");
		System.out.println("2. ВВЕДИТЕ МНИМУЮ ЧАСТЬ ПЕРВОГО ЧИСЛА");
		System.out.println();
		System.out.println("3. ВВЕДИТЕ ДЕЙСТВИТЕЛЬНУЮ ЧАСТЬ ВТОРОГО ЧИСЛА");
		System.out.println("4. ВВЕДИТЕ МНИМУЮ ЧАСТЬ ВТОРОГО ЧИСЛА");
		System.out.println();
		System.out.println("5. ВВЕДИТЕ АРИФМЕТИЧЕСКУЮ ОПЕРАЦИЮ: + - * /");
		System.out.println();
		System.out.println("6. РЕЗУЛЬТАТ БУДЕТ ВЫВЕДЕН В КОНСОЛЬ");
		System.out.println("   и ЗАПИСАН В ЛОГФАЙЛ");
		System.out.println("   (существующий или вновь созданный, при отсутствии файла)");
		System.out.println();
	}

	/** Переопределение метода из интерфейса iCalculatorView */
	@Override
	public boolean getInputAnswerToAQuestion(String question) {
		Scanner iScanner = new Scanner(System.in);
		System.out.printf("%s y/n: ", question);
		String answer = iScanner.nextLine();
		if (answer.equals("Y") || answer.equals("y"))
			return true;
		return false;
	}

	/**
	 * Метод ввода и проверки корректности
	 * введенной части комплексного числа
	 * 
	 * @return - double
	 */
	private double getInputNumber() {
		Scanner iScanner = new Scanner(System.in);
		boolean isCorrect = false;
		double number = -1;
		while (!isCorrect) {
			if (iScanner.hasNextInt()) {
				number = (double) iScanner.nextInt();
				isCorrect = true;
			} else if (iScanner.hasNextDouble()) {
				number = iScanner.nextDouble();
				isCorrect = true;
			} else {
				iScanner.next();
				System.out.println(
						"Не удалось распознать число (корректны числа со знаком и/или десятичным разделителем). Повторите ввод.");
			}
		}
		return number;
	}

	/**
	 * Переопределение метода из интерфейса iCalculatorView
	 * Ввод действительной и мнимой части числа
	 */
	@Override
	public ComplexNumber getInputTerm() {
		System.out.print("Введите действительную часть числа: ");
		double realNumber = getInputNumber();
		System.out.print("\nВведите мнимую часть числа: ");
		double imageNumber = getInputNumber();
		ComplexNumber result = new ComplexNumber(realNumber, imageNumber);
		System.out.println("Введено число: " + result);
		System.out.println();
		return result;
	}

	/**
	 * Переопределение метода из интерфейса iCalculatorView
	 * Ввод арифметической операции
	 */
	@Override
	public String getInputCommand() {
		Scanner iScanner = new Scanner(System.in);
		String operator = "";
		while (true) {
			System.out.print("Введите операцию (+ - * /): ");
			operator = iScanner.nextLine();
			if (operator.equals("+")) {
				return "PLUS";
			}
			if (operator.equals("-")) {
				return "MINUS";
			}
			if (operator.equals("*")) {
				return "MULTYPLY";
			}
			if (operator.equals("/")) {
				return "DIVIDE";
			}
			System.out.println("Не удалось распознать операцию.");
			System.out.println();
		}
	}
}
