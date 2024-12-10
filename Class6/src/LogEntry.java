enum LogLevel {

	INFO, DEBUG, ERROR

}

public class LogEntry {

	private LogLevel currentLogLevel;

	public LogEntry(LogLevel initialLogLevel) {

		this.currentLogLevel = initialLogLevel;

	}

	public void setLogLevel(LogLevel logLevel) {

		this.currentLogLevel = logLevel;

	}

	public LogLevel getCurrentLogLevel() {

		return this.currentLogLevel;

	}

	public boolean shouldLog(LogLevel logLevel) {

		return logLevel.ordinal() >= this.currentLogLevel.ordinal();

	}

	public void log(String message, LogLevel logLevel) {

		if (shouldLog(logLevel)) {

			System.out.println("[" + logLevel + "] " + message);

		}

	}

}
