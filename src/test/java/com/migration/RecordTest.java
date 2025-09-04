package com.migration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    @Test
    void testRecordGettersAndSetters() {
        Record record = new Record("Test Name", "Test Value", true);

        assertEquals("Test Name", record.name());
        assertEquals("Test Value", record.value());
        assertTrue(record.enabled());
    }
}
