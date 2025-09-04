package com.migration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonGenerateExampleTest {
    @Test
    void testMain() {
        assertDoesNotThrow(() -> JsonGenerateExample.main(new String[] {}));
    }
}
