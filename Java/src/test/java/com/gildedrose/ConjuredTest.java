package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredTest {

    @Test
    void everyDayQualityDecreasesByTwo() {
        //given
        Conjured conjured = new Conjured();

        //when
        int quality = conjured.updateQuality(10, 3);

        //then
        assertEquals(8, quality);
        quality = conjured.updateQuality(quality, 2);
        assertEquals(6, quality);
    }

    @Test
    void qualityCanNotBeNegative() {
        //given
        Conjured conjured = new Conjured();

        //when
        int quality = conjured.updateQuality(0, 1);

        //then
        assertEquals(0, quality);
    }

    @Test
    void whenSellInIsNegativeQualityDecreasesTwiceAsFast(){
        //given
        Conjured conjured = new Conjured();

        //when
        int quality = conjured.updateQuality(10, -1);

        //then
        assertEquals(6, quality);
        quality = conjured.updateQuality(quality, -2);
        assertEquals(2, quality);
    }

    @Test
    void whenExpirationDateIsMetAndQualityWasLowerThen2ThenQualityIs0(){
        //given
        Conjured conjured = new Conjured();

        //when
        int quality = conjured.updateQuality(1, 0);

        //then
        assertEquals(0, quality);
    }
}
