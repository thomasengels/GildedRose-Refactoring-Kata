package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemFactoryTest {
    @Test
    void whenNameContainsAgedBrieReturnAgedBrieInstance(){
        //given
        String name = "AgedBrie";
        //when
        Item item = new ItemFactory().buildItem(name, 10,10);

        //then
        assertEquals(AgedBrie.class, item.getClass());
    }

    @Test
    void whenNameContainsSuflurasReturnSulfurasInstance(){
        //given
        String name = "Sulfuras";
        //when
        Item item = new ItemFactory().buildItem(name, 10,10);

        //then
        assertEquals(Sulfuras.class, item.getClass());
    }

    @Test
    void whenNameContainsBackStagePassReturnBackstagePassInstance(){
        //given
        String name = "Backstagepass";
        //when
        Item item = new ItemFactory().buildItem(name, 10,10);

        //then
        assertEquals(BackStagePass.class, item.getClass());
    }

    @Test
    void whenNameContainsConjuredReturnConjuredInstance(){
        //given
        String name = "conjured";
        //when
        Item item = new ItemFactory().buildItem(name, 10,10);

        //then
        assertEquals(Conjured.class, item.getClass());
    }

    @Test
    void whenNameContainsAnythingReturnItemInstance(){
        //given
        String name = "cookie";
        //when
        Item item = new ItemFactory().buildItem(name, 10,10);

        //then
        assertEquals(Item.class, item.getClass());
    }
}
