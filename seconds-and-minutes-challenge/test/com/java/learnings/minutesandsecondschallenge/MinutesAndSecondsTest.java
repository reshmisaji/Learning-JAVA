package com.java.learnings.minutesandsecondschallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesAndSecondsTest {

    @Test
    void shouldReturnInvalidValueMessage() {
        int minutes = -5;
        int seconds = 6;

        String actualOutput = MinutesAndSeconds.getDurationString(minutes,seconds);

        assertEquals("Invalid value",actualOutput);
    }

    @Test
    void shouldGiveTheMinutesAndSeconds() {
        int minutes = 9;
        int seconds = 9;

        String actualOutput = MinutesAndSeconds.getDurationString(minutes,seconds);

        assertEquals("0h 9m 9s",actualOutput);
    }
}