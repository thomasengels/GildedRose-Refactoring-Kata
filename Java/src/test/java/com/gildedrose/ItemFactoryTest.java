package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemFactoryTest {
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
