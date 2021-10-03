package com.book.JPRGerbertShildt.example.patterns.structural.adapter.adapter3;

public class Adapter {

    public static void main(String[] args) {
        // способ через наследование  VectorAdapterFromRaster
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        // способ через композицию  VectorAdapterFromRaster2
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2(new RasterGraphics());
        g2.drawLine();
        g2.drawSquare();

    }

}
