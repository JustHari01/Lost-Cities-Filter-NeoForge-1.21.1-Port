package com.lostcities.logfilter;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.filter.AbstractFilter;

final class LogMessageFilter {
    private static final List<String> FILTERED_MESSAGES = List.of(
            "LostCities: Got empty or null city chunk data",
            "Error generating chunk",
            "java.lang.RuntimeException: Could not find entry",
            "java.lang.NullPointerException",
            "Signature is missing from Property textures"
    );

    private LogMessageFilter() {
    }

    static void install() {
        org.apache.logging.log4j.core.LoggerContext context =
                (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        Logger rootLogger = context.getRootLogger();

        rootLogger.addFilter(new AbstractFilter() {
            @Override
            public Result filter(LogEvent event) {
                if (event == null || event.getMessage() == null) {
                    return Result.NEUTRAL;
                }

                String formattedMessage = event.getMessage().getFormattedMessage();
                if (formattedMessage == null) {
                    return Result.NEUTRAL;
                }

                return FILTERED_MESSAGES.stream().anyMatch(formattedMessage::contains)
                        ? Result.DENY
                        : Result.NEUTRAL;
            }
        });
    }
}
