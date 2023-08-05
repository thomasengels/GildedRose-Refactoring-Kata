package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {

    @Test
    void everyDayQualityDecreasesByOne() {
        int quality = 10;
        Item item = new Item("item", 10, quality);
        assertEquals(10, item.quality);
        item.updateQuality();
        assertEquals(9, item.quality);
        item.updateQuality();
        assertEquals(8, item.quality);
    }

    @Test
    void qualityCanNotBeNegative() {
        int quality = 0;
        Item item = new Item("item", 10, quality);
        assertEquals(0, item.quality);
        item.updateQuality();
        assertEquals(0, item.quality);
    }

    @Test
    void whenSellInIsNegativeQualityDecreasesTwiceAsFast(){
        int sellIn = 0;
        int quality = 10;
        Item item = new Item("item", sellIn, quality);
        assertEquals(0, item.sellIn);
        assertEquals(10, item.quality);
        item.updateQuality();
        assertEquals(-1, item.sellIn);
        assertEquals(8, item.quality);
        item.updateQuality();
        assertEquals(-2, item.sellIn);
        assertEquals(6, item.quality);
    }

    @Test
    void everyDaySellInDecreasesByOne() {
        int sellIn = 10;
        Item item = new Item("item", sellIn, 10);
        assertEquals(10, item.sellIn);
        item.updateQuality();
        assertEquals(9, item.sellIn);
        item.updateQuality();
        assertEquals(8, item.sellIn);
    }


    @Test
    void sellInCanBeNegative() {
        int sellIn = 0;
        Item item = new Item("item", sellIn, 10);
        assertEquals(0, item.sellIn);
        item.updateQuality();
        assertEquals(-1, item.sellIn);
    }
}
