package com.logger.service.impl;

import com.logger.configuration.Logger;
import com.logger.configuration.LoggerConfiguration;
import com.logger.model.LogLevel;
import com.logger.service.LoggerService;

import java.util.List;

public class LoggerServiceImpl implements LoggerService {

    LoggerConfiguration configuration;

    @Override
    public void log(String message, LogLevel level) {
        List<Logger> loggers = configuration.getLoggers();
        for(Logger logger:loggers){
            logger.writeAppender(message,level);
        }

    }
}
