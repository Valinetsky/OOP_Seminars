package Model;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Controller.Menu;

/**
 * Класс логгера с интерфейсом iLogger
 */
public class TextLogger extends LoggerModel implements iLogger<ComplexNumber> {

	private Logger logger;

	/**
	 * Конструктор логгера, проверяющий существование файла логгера,
	 * и создающий его, при отсутствии
	 * 
	 * @param loggerName - имя логгера
	 */
	public TextLogger(String loggerName) {
		super.loggerName = loggerName;
		String localPath = "C:/Users/Roman/Desktop/GB/OOP/OOP_Seminars/Seminar07/Homework/CalculatorCoplexNumberMVC/";
		super.filePath = localPath
				.concat("loggers" + File.separator
						+ super.getLoggerName() + super.getfilePostfix() + ".txt");

		System.out.printf("filepath %s\n", filePath);

		this.checkFile();
		this.initLogger();
	}

	/** Переопределение метода из интерфейса iLogger */
	@Override
	public void checkFile() {
		try {
			File file = new File(super.getFilePath());
			if (file.createNewFile()) {
				System.out.printf("%s > Создание файла логгера\n", super.getLoggerName());
			} else {
				System.out.printf("%s > Найден файл логгера, новые записи будут добавлены в него \n",
						super.getLoggerName());
			}
		} catch (Exception e) {
			System.out.printf("%s > Ошибка при работе с файлом логгера\n", super.getLoggerName());
			e.printStackTrace();
		}
	}

	/** Переопределение метода из интерфейса iLogger */
	@Override
	public void createFileHandler() {
		FileHandler fh;
		try {
			fh = new FileHandler(super.getFilePath(), true);
			this.logger.addHandler(fh);
			this.logger.setUseParentHandlers(false);
			SimpleFormatter sFormat = new SimpleFormatter();
			fh.setFormatter(sFormat);
		} catch (Exception e) {
			System.out.println("Ошибка обработчика файла логгера");
			e.printStackTrace();
		}
	}

	/** Переопределение метода из интерфейса iLogger */
	@Override
	public void initLogger() {
		this.logger = Logger.getLogger(super.loggerName);
		this.createFileHandler();
	}

	/** Переопределение метода из интерфейса iLogger */
	@Override
	public void writeLog(ComplexNumber firtsTerm, ComplexNumber secondTerm, ComplexNumber result, Menu menu) {
		this.logger.info(String.format("%s %s %s = %s", firtsTerm, menu, secondTerm, result));
	}
}
