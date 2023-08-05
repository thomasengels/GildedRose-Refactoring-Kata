package com.gildedrose;

public class Sulfuras extends Item{

    private static final int SULFURAS_QUALITY = 80;

    public Sulfuras(String name, int sellIn) {
        super(name, sellIn, SULFURAS_QUALITY);
    }

    @Override
    void updateQuality() {
        this.dayHasPassed();
    }
}
