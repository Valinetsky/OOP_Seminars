package View;

public interface iCalculatorView<T> {

	/** Уведомление при старте работы программы */
	void showLabel();

	/** Уведомление при окончании работы программы */
	void exitProgram();

	/** Ввод арифметической операции */
	String getInputCommand();

	/** Ввод числа */
	T getInputTerm();

	/** Получение ответа на запрос программы */
	boolean getInputAnswerToAQuestion(String question);
}