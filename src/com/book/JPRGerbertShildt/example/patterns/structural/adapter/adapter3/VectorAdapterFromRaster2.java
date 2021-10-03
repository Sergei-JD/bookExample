package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter3;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {

    RasterGraphics raster = null; //new RasterGraphics();

    public VectorAdapterFromRaster2(RasterGraphics raster) {
        this.raster = raster;
    }

    @Override
    public void drawLine() {
        raster.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        raster.drawRasterSquare();
    }

}
