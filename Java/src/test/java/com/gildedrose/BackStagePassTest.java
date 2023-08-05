package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackStagePassTest {
    @Test
    void whenSellInIsHigherThen10QualityIncreaseByOne(){
        //given
        BackStagePass pass = new BackStagePass("rammstein",12,10);
        assertEquals(12, pass.sellIn);
        assertEquals(10, pass.quality);

        //when
        pass.updateQuality();

        //then
        assertEquals(11, pass.sellIn);
        assertEquals(11, pass.quality);
    }

    @Test
    void whenSellInIsHigherThen5QualityIncreasesByFactor2(){
        //given
        BackStagePass pass = new BackStagePass("rammstein",11,10);
        assertEquals(11, pass.sellIn);
        assertEquals(10, pass.quality);

        //when
        pass.updateQuality();

        //then
        assertEquals(10, pass.sellIn);
        assertEquals(20, pass.quality);

        pass.updateQuality();
        assertEquals(9, pass.sellIn);
        assertEquals(40, pass.quality);
    }

    @Test
    void whenSellInIsLowerThen6And0OrHigherQualityIncreasesByFactor3(){
        //given
        BackStagePass pass = new BackStagePass("rammstein",6,10);
        assertEquals(6, pass.sellIn);
        assertEquals(10, pass.quality);

        //when
        pass.updateQuality();

        //then
        assertEquals(5, pass.sellIn);
        assertEquals(30, pass.quality);

        pass.updateQuality();
        assertEquals(4, pass.sellIn);
        assertEquals(90, pass.quality);
    }
}
