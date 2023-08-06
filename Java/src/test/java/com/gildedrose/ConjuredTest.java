package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredTest {

    @Test
    void everyDayQualityDecreasesByTwo() {
        //given
        int quality = 10;
        Conjured conjured = new Conjured("conjured", 10, quality);
        assertEquals(10, conjured.quality);

        //when
        conjured.updateQuality();

        //then
        assertEquals(8, conjured.quality);
        conjured.updateQuality();
        assertEquals(6, conjured.quality);
    }

    @Test
    void qualityCanNotBeNegative() {
        //given
        int quality = 0;
        Conjured conjured = new Conjured("conjured", 10, quality);
        assertEquals(0, conjured.quality);

        //when
        conjured.updateQuality();

        //then
        assertEquals(0, conjured.quality);
    }

    @Test
    void whenSellInIsNegativeQualityDecreasesTwiceAsFast(){
        //given
        int sellIn = 0;
        int quality = 10;
        Conjured conjured = new Conjured("conjured", sellIn, quality);
        assertEquals(0, conjured.sellIn);
        assertEquals(10, conjured.quality);

        //when
        conjured.updateQuality();

        //then
        assertEquals(-1, conjured.sellIn);
        assertEquals(6, conjured.quality);
        conjured.updateQuality();
        assertEquals(-2, conjured.sellIn);
        assertEquals(2, conjured.quality);
    }

    @Test
    void everyDaySellInDecreasesByOne() {
        //given
        int sellIn = 10;
        Conjured conjured = new Conjured("conjured", sellIn, 10);
        assertEquals(10, conjured.sellIn);

        //when
        conjured.updateQuality();

        //then
        assertEquals(9, conjured.sellIn);
        conjured.updateQuality();
        assertEquals(8, conjured.sellIn);
    }

    @Test
    void whenExpirationDateIsMetAndQualityWasLowerThen2ThenQualityIs0(){
        //given
        int sellIn = 0;
        Conjured conjured = new Conjured("conjured", sellIn, 1);

        //when
        conjured.updateQuality();

        //then
        assertEquals(0, conjured.quality);
    }


    @Test
    void sellInCanBeNegative() {
        //given
        int sellIn = 0;
        Conjured conjured = new Conjured("conjured", sellIn, 10);
        assertEquals(0, conjured.sellIn);

        //when
        conjured.updateQuality();

        //then
        assertEquals(-1, conjured.sellIn);
    }
}
