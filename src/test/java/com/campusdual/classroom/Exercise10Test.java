package com.campusdual.classroom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise10Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        this.outContent.reset();
        this.errContent.reset();
        System.setOut(new PrintStream(this.outContent));
        System.setErr(new PrintStream(this.errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(this.originalOut);
        System.setErr(this.originalErr);
    }


    @Test
    @DisplayName("Check ball color")
    void testGetBall() {
        String colorBall = Exercise10.getBall();
        List<String> colorList = new ArrayList<>(List.of("rojo", "azul", "verde"));
        assertTrue(colorList.contains(colorBall), "Ball color is not allowed");
    }

    @Test
    @DisplayName("Check if can obtain 2 blue balls")
    void testGet2BlueBalls() {
        Exercise10.main(new String[0]);
        String ballColor = "azul";
        int counter = 0;
        int index = outContent.toString().indexOf(ballColor);
        while (index != -1) {
            counter++;
            index = outContent.toString().indexOf(ballColor, index + 1);
        }
        assertEquals(2, counter);

    }
}