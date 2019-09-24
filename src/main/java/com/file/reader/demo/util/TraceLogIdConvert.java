package com.file.reader.demo.util;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.file.reader.demo.consts.Contant;

/**
 *
 */
public class TraceLogIdConvert extends ClassicConverter {

  @Override
  public String convert(ILoggingEvent event) {
    try {
      return event.getMDCPropertyMap().get(Contant.TRACE_LOG_ID);
    } catch (Exception e) {
      return "get mdc property error";
    }
  }
}