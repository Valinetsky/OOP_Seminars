package Model;

/**
 * Абстрактный класс логгера
 */
public abstract class LoggerModel {

	/** Имя логгера */
	protected String loggerName;

	/** Постфикс к имени файла логгера */
	protected static String filePostfix = "_complexCalc";

	/** Путь до файла логгера */
	protected String filePath;

	/**
	 * Геттер имени логгера
	 * 
	 * @return - имя логгера
	 */
	public String getLoggerName() {
		return loggerName;
	}

	/**
	 * Сеттер имени логгера
	 * 
	 * @param loggerName - имя логгера
	 */
	public void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}

	/**
	 * Геттер постфикса к имени файла логгера
	 * 
	 * @return - Постфикс к имени файла логгера
	 */
	public static String getfilePostfix() {
		return filePostfix;
	}

	/**
	 * Сеттер постфикса к имени файла логгера
	 * 
	 * @param filePostfix - Постфикс к имени файла логгера
	 */
	public static void setfilePostfix(String filePostfix) {
		LoggerModel.filePostfix = filePostfix;
	}

	/**
	 * Геттер пути до файла логгера
	 * 
	 * @return - путь до файла логгера
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Сеттер пути до файла логгера
	 * 
	 * @param filePath - путь до файла логгера
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}