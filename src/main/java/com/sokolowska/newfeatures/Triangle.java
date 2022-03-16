package com.sokolowska.newfeatures;

import lombok.Value;

@Value
public class Triangle extends Polygon{

    public final Point p1;
    public final Point p2;
    public final Point p3;
}
