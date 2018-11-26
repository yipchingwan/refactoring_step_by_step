package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    void should_Police_check_Driver_is_Adult(){
        assertTrue(new Police().checkDriver(new Driver(18)));
        assertFalse(new Police().checkDriver(new Driver(17)));
    }
}
