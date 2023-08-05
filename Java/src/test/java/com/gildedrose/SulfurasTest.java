package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {
    @Test
    void qualityIsAlways80(){
        Sulfuras sulfuras = new Sulfuras("sulfuras", 10);
        assertEquals(80, sulfuras.quality);
        assertEquals(10, sulfuras.sellIn);
        sulfuras.updateQuality();
        assertEquals(80, sulfuras.quality);
        assertEquals(9, sulfuras.sellIn);
    }
}
