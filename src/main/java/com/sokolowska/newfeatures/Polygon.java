package com.sokolowska.newfeatures;

import lombok.Data;

@Data
abstract sealed class Polygon implements Shape permits Triangle, Section{

    public int vertexQuantity;

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this.toString());
    }
}
