package com.example.util;

public class StringUtilImpl implements StringUtil {

    private static final String REGEX_WHITESPACE = "\\s";
    private static final String EMPTY = "";

    @Override
    public boolean isBlank(String string) {
        return string == null ||
            string.replaceAll(REGEX_WHITESPACE, EMPTY)
                .isEmpty();
    }
}