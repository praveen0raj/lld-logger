package com.logger.service;

import com.logger.model.SinkType;

public abstract class SinkAppender {

    SinkType sinkType;

    String timeFormat;

    public abstract void write(String message);

}


