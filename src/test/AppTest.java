package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {


@Test
void testAddPositiveNumbers() {
App app = new App();
assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
}


@Test
void testAddWithNegative() {
App app = new App();
assertEquals(0, app.add(2, -2), "2 + (-2) should equal 0");
}
}
