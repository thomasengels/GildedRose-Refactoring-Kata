package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackStagePassTest {
    @Test
    void whenSellInIsHigherThen10QualityIncreaseByOne(){
        //given
        BackStagePass pass = new BackStagePass("rammstein",11,10);
        assertEquals(11, pass.sellIn);
        assertEquals(10, pass.quality);

        //when
        pass.updateQuality();

        //then
        assertEquals(10, pass.sellIn);
        assertEquals(11, pass.quality);
    }
}
