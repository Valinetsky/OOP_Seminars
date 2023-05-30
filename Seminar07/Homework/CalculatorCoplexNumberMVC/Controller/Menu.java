package Controller;

/**
 * Класс перечисления меню
 */
public enum Menu {
	NONE(""),
	PLUS("+"),
	MINUS("-"),
	MULTYPLY("*"),
	DIVIDE("/"),
	EXIT("x");

	private String operator;

	/**
	 * Метод возврата символа оператора.
	 * Не используется в программе
	 * 
	 * @param operator
	 */
	Menu(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	@Override
	public String toString() {
		return operator;
	}
}

// Переусложненный блок. Отказался от применения

// public class Calculator {

// enum Operation {

// PLUS("+") {
// double apply(double x, double y) {
// return x + y;
// }
// },
// MINUS("-") {
// double apply(double x, double y) {
// return x - y;
// }
// },
// TIMES("*") {
// double apply(double x, double y) {
// return x * y;
// }
// },
// DIVIDE("/") {
// double apply(double x, double y) {
// return x / y;
// }
// };

// private final String symbol;

// Operation(String symbol) {
// this.symbol = symbol;
// }

// @Override
// public String toString() {
// return symbol;
// }

// abstract double apply(double x, double y);
// }

// public static void main(String[] args) {

// double x = 2.0;
// double y = 3.0;

// for (Operation op : Operation.values()) {
// System.out.print(x + " ");
// System.out.print(op.toString() + " ");
// System.out.print(y + " = ");
// System.out.println(op.apply(x, y));

// }
// }

// }
