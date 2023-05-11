package com.tech1.personelmanagementsystem.Core.Utilities.Logger.abstracts;

public interface LoggerService {
    void logToSystemError(String message);
    void logToSystemInfo(String message);
    void logToSystemWarning(String message);
}
