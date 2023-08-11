package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {
    @Test
    void qualityIsAlways80(){
        //given
        Sulfuras sulfuras = new Sulfuras();

        //when
        int quality = sulfuras.updateQuality(80, 10);

        //then
        assertEquals(80, quality);
    }
}
