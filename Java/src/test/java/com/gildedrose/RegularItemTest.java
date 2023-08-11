package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularItemTest {

    @Test
    void everyDayQualityDecreasesByOne() {
        //given
        RegularItem item = new RegularItem();

        //when
        int quality = item.updateQuality(10, 10);

        //then
        assertEquals(9, quality);
        quality = item.updateQuality(quality, 9);
        assertEquals(8, quality);
    }

    @Test
    void qualityCanNotBeNegative() {
        //given
        RegularItem item = new RegularItem();

        //when
        int quality = item.updateQuality(0, 1);

        //then
        assertEquals(0, quality);
    }

    @Test
    void whenSellInIsNegativeQualityDecreasesTwiceAsFast(){
        //given
        RegularItem item = new RegularItem();

        //when
        int quality = item.updateQuality(10,-1);

        //then
        assertEquals(8, quality);
        quality = item.updateQuality(quality, -2);
        assertEquals(6, quality);
    }


    @Test
    void whenItemIsFirstDayOfExpirationAndQualityWas1ThenQualityIs0(){
        //given
        RegularItem item = new RegularItem();

        //when
        int quality = item.updateQuality(1, -1);

        //then
        assertEquals(0, quality);
    }
}
