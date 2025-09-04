package com.migration;

/**
 * Represents the data structure for JSON generation, equivalent to the COBOL ws-record.
 */
public record Record (String name, String value, boolean enabled) {}
