package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ItemTest {
    @Test
    void whenUpdatingItemThenSellIsIsDecreased(){
        //when
        Updatable updater = Mockito.mock(Updatable.class);
        Item item = new Item(updater, 10, "item", 10);

        //when
        item.update();

        //then
        Assertions.assertEquals(9, item.getSellIn());
        Mockito.verify(updater, Mockito.times(1)).updateQuality(10, 9);
    }
}
