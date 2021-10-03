package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter3;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }

}
