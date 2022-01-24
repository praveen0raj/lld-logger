package com.logger.service.impl;

import com.logger.service.SinkAppender;

public class DatabaseSinkAppenderImpl extends SinkAppender {

    String host;
    String username;
    String password;
    String port;
    String dbname;
    String tableName;

    @Override
    public void write(String message) {
    }

}
