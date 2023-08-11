package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularItemFactoryTest {
    @Test
    void whenNameContainsAgedBrieReturnAgedBrieInstance(){
        //given
        String name = "AgedBrie";
        //when
        Updatable item = new UpdatableFactory().buildUpdater(name);

        //then
        assertEquals(AgedBrie.class, item.getClass());
    }

    @Test
    void whenNameContainsSuflurasReturnSulfurasInstance(){
        //given
        String name = "Sulfuras";
        //when
        Updatable item = new UpdatableFactory().buildUpdater(name);

        //then
        assertEquals(Sulfuras.class, item.getClass());
    }

    @Test
    void whenNameContainsBackStagePassReturnBackstagePassInstance(){
        //given
        String name = "Backstage passes";
        //when
        Updatable item = new UpdatableFactory().buildUpdater(name);

        //then
        assertEquals(BackStagePass.class, item.getClass());
    }

    @Test
    void whenNameContainsConjuredReturnConjuredInstance(){
        //given
        String name = "conjured";
        //when
        Updatable item = new UpdatableFactory().buildUpdater(name);

        //then
        assertEquals(Conjured.class, item.getClass());
    }

    @Test
    void whenNameContainsAnythingReturnItemInstance(){
        //given
        String name = "cookie";
        //when
        Updatable item = new UpdatableFactory().buildUpdater(name);

        //then
        assertEquals(RegularItem.class, item.getClass());
    }
}
