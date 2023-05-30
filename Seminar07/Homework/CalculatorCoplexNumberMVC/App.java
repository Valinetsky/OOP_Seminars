
import Controller.CalculatorController;
import Model.ComplexCalculatorModel;
import Model.ComplexNumber;
import Model.TextLogger;
import Model.iCalculatorModel;
import Model.iLogger;
import View.DefaultCalculatorView;
import View.iCalculatorView;

public class App {
	public static void main(String[] args) throws Exception {
		iCalculatorModel<ComplexNumber> model = new ComplexCalculatorModel();
		iCalculatorView<ComplexNumber> view = new DefaultCalculatorView();
		iLogger<ComplexNumber> logger = new TextLogger("Probe");
		CalculatorController<ComplexNumber> controller = new CalculatorController<ComplexNumber>(model, view, logger);
	}
}