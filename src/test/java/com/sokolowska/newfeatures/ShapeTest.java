package com.sokolowska.newfeatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShapeTest {

    public Triangle triangle;

    @BeforeEach
    public void prepareData() {
        triangle = new Triangle(new Point(1.0, 1.0), new Point(3.0, 1.0), new Point(2.0, 3.0));
    }

    @Test
    public void shouldReturnTriangleArea() {
        String area = triangle.getArea();
        assertEquals(String.format("getArea() called for %s", triangle.toString()), area);
    }

    @Test
    public void shouldReturnTriangleDiameter() {
        String area = triangle.getDiameter();
        assertEquals(String.format("getArea() called for %s", triangle.toString()), area);
    }
}