package com.sokolowska.newfeatures;

public sealed interface Shape permits Circle, Polygon {

    String getArea();

    default String getDiameter() {
//        return switch (this) {
//            case Circle c -> String.format("getDiameter() called for %s", this.toString());
//            case Section s -> String.format("getDiameter() called for %s", this.toString());
//            case Triangle t -> String.format("getDiameter() called for %s", this.toString());
//            default ->  String.format("Shape type not detected");
//        };
        return "";
    }
}
