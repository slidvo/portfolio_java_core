package examples;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Log4jExample {
	
	static final Logger logger = LogManager.getLogger(Log4jExample.class.getName());
	
	public boolean doIt() {
		logger.traceEntry();
		logger.error("Did it again!");
		return logger.traceExit(false);
	}

}
