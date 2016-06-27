package com.mim.scannerproject.component;

import com.sun.jersey.spi.resource.Singleton;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author mock
 */
@Component
public class BasicObjectMapper extends ObjectMapper {

    private static final Logger logger = LoggerFactory.getLogger(BasicObjectMapper.class);

    public BasicObjectMapper() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        logger.debug("BasicObjectMapper");

        configure(DeserializationConfig.Feature.USE_ANNOTATIONS, true);
        configure(SerializationConfig.Feature.USE_ANNOTATIONS, true);
        configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);
        configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
       // configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }


}