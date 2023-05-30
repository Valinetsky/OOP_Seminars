package Controller;

import Model.iCalculatorModel;
import View.iCalculatorView;
import Model.iLogger;

public class CalculatorController<T> {

	iCalculatorModel<T> model;
	iCalculatorView<T> view;
	iLogger<T> logger;

	/**
	 * @param model
	 * @param view
	 * @param logger
	 */
	public CalculatorController(iCalculatorModel<T> model, iCalculatorView<T> view, iLogger<T> logger) {
		this.model = model;
		this.view = view;
		this.logger = logger;
		this.run();
	}

	/**
	 * Метод основного цикла программы
	 */
	private void run() {
		Menu menu = Menu.NONE;
		boolean flag = true;

		while (flag) {
			view.showLabel();

			String question = "Начинаем работу?";
			if (!view.getInputAnswerToAQuestion(question)) {
				flag = false;
				view.exitProgram();
				break;
			}

			T firstTerm = view.getInputTerm();
			T secondTerm = view.getInputTerm();
			T result = (T) null;

			String probe = view.getInputCommand();
			menu = Menu.valueOf(probe.toUpperCase());

			switch (menu) {
				case PLUS:
					result = model.add(firstTerm, secondTerm);
					break;
				case MINUS:
					result = model.subtract(firstTerm, secondTerm);
					break;
				case MULTYPLY:
					result = model.multiply(firstTerm, secondTerm);
					break;
				case DIVIDE:
					result = model.divide(firstTerm, secondTerm);
					break;
				case EXIT:
				default:
					flag = false;
					view.exitProgram();
					break;
			}
			System.out.println("Результат: " + result);
			System.out.println();
			logger.writeLog(firstTerm, secondTerm, result, menu);
		}
	}
}