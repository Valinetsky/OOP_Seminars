package Model;

public interface iCalculatorModel<T> {

	/** Сложение */
	T add(T a, T b);

	/** Вычитание */
	T subtract(T a, T b);

	/** Умножение */
	T multiply(T a, T b);

	/** Деление */
	T divide(T a, T b);
}