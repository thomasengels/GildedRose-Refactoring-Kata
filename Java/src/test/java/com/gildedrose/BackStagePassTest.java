package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackStagePassTest {
    @Test
    void whenSellInIsHigherThen10QualityIncreaseByOne(){
        //given
        BackStagePass pass = new BackStagePass();

        //when
        int quality = pass.updateQuality(10, 11);

        //then
        assertEquals(11, quality);
    }

    @Test
    void whenSellInIsHigherThen5QualityIncreasesByFactor2(){
        //given
        BackStagePass pass = new BackStagePass();

        //when
        int quality = pass.updateQuality(10, 10);

        //then
        assertEquals(20, quality);

        quality = pass.updateQuality(quality, 9);
        assertEquals(40, quality);
    }

    @Test
    void whenSellInIsBetween0And6QualityIncreasesByFactor3(){
        //given
        BackStagePass pass = new BackStagePass();

        //when
        int quality = pass.updateQuality(10, 5);

        //then
        assertEquals(30, quality);

        quality = pass.updateQuality(quality, 4);
        assertEquals(90, quality);
    }

    @Test
    void whenSellInIsNegativeQualityIs0(){
        //given
        BackStagePass pass = new BackStagePass();

        //when
        int quality = pass.updateQuality(10, -1);

        //then
        assertEquals(0, quality);
    }

    @Test
    void qualityCanNeverBeNegative(){
        //given
        BackStagePass pass = new BackStagePass();

        //when
        int quality = pass.updateQuality(10, -1);

        //then
        assertEquals(0, quality);
    }
}
