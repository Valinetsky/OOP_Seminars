package Model;

public class ComplexCalculatorModel implements iCalculatorModel<ComplexNumber> {

	/**
	 * Переопределение метода интерфейса iCalculatorModel
	 * Сложение
	 * (a + bi) + (c + di) = (a + c) + (b + d)i
	 */
	@Override
	public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		double resultA = (a.getA() + b.getA());
		double resultB = (a.getB() + b.getB());
		return new ComplexNumber(resultA, resultB);
	}

	/**
	 * Переопределение метода интерфейса iCalculatorModel
	 * Вычитание
	 * (a + bi) - (c + di) = (a - c) + (b - d)i
	 */
	@Override
	public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
		double resultA = (a.getA() - b.getA());
		double resultB = (a.getB() - b.getB());
		return new ComplexNumber(resultA, resultB);
	}

	/**
	 * Переопределение метода интерфейса iCalculatorModel
	 * Умножение
	 * (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
	 */
	@Override
	public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
		double resultA = (a.getA() * b.getA()) - (a.getB() * b.getB());
		double resultB = (a.getA() * b.getB()) + (a.getB() * b.getA());
		return new ComplexNumber(resultA, resultB);
	}

	/**
	 * Переопределение метода интерфейса iCalculatorModel
	 * Деление
	 * a + bi   (a + bi)(c - di)    ac + bd     bc - ad
	 * ------ = ---------------- = --------- + --------- i
	 * c + di   (c + di)(c - di)   c*c + d*d   c*c + d*d
	 */
	@Override
	public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
		double denominator = Math.pow(b.getA(), 2) + Math.pow(b.getB(), 2);
		double resultA = (a.getA() * b.getA() + a.getB() * b.getB()) / denominator;
		double resultB = (a.getB() * b.getA() - a.getA() * b.getB()) / denominator;
		return new ComplexNumber(resultA, resultB);
	}
}