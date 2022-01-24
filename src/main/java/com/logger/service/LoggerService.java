package com.logger.service;

import com.logger.model.LogLevel;

public interface LoggerService {

    void log(String message, LogLevel level);
}
