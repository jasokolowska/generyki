package com.sokolowska.newfeatures;

public record Point(double x, double y) {

    public String distance(Point p) {
        return String.valueOf(Math.sqrt(x * p.x + y * p.y));
    }
}
