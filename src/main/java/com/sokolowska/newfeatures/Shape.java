package com.sokolowska.newfeatures;

public sealed interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter() {
        return switch (this) {
            case Circle c -> String.format("getDiameter() called for %s", c);
            case Section s -> String.format("getDiameter() called for %s", s);
            case Triangle t -> String.format("getDiameter() called for %s", t);
            default ->  String.format("Shape type not detected");
        };
    }
}
