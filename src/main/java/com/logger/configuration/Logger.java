package com.logger.configuration;

import com.logger.model.LogLevel;
import com.logger.service.SinkAppender;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    String name;

    LogLevel logLevel;

    List<SinkAppender> appenders=new ArrayList<>();

    void addSinkAppender(SinkAppender appender){
        appenders.add(appender);
    }

    public void writeAppender(String message, LogLevel level){
        if(level.ordinal()<logLevel.ordinal()){
            for(SinkAppender appender: appenders){
                appender.write(message);
            }
        }
    }

}
