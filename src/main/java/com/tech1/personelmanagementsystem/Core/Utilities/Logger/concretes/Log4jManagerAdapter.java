package com.tech1.personelmanagementsystem.Core.Utilities.Logger.concretes;

import com.tech1.personelmanagementsystem.Core.Utilities.Logger.abstracts.LoggerService;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class Log4jManagerAdapter implements LoggerService {

    protected static final Logger logger = LogManager.getLogger(Log4jManagerAdapter.class);
    @Override
    public void logToSystemError(String message) {
        logger.error(message);
    }
    @Override
    public void logToSystemInfo(String message) {
        logger.info(message);
    }
    @Override
    public void logToSystemWarning(String message) {
        logger.info(message);

    }
}
