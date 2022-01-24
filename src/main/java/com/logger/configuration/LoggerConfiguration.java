package com.logger.configuration;

import java.util.List;

public class LoggerConfiguration {

    public static LoggerConfiguration config=new LoggerConfiguration();

    List<Logger> loggers;

    private LoggerConfiguration(){
        throw new RuntimeException("");
    }

    void addLogger(Logger Logger){
        loggers.add(Logger);
    }

    public List<Logger> getLoggers() {
        return loggers;
    }

    static LoggerConfiguration getInstance(){
        return config;
    }
}
