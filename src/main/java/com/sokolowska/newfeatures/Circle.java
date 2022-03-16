package com.sokolowska.newfeatures;

public record Circle(Point center, double radius) implements Shape{

    public Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Negative radius is not allowed");
        }
    }

    @Override
    public String getArea() {
        return String.valueOf(Math.pow(radius, 2.0)*Math.PI);
    }
}
