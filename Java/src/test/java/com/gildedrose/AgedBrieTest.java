package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {
   @Test
   void qualityIncreasesWhenSellInDecreases(){
       //given
       AgedBrie agedBrie = new AgedBrie("brie", 10, 10);
       assertEquals(10, agedBrie.sellIn);
       assertEquals(10, agedBrie.quality);

       //when
       agedBrie.updateQuality();

       //then
       assertEquals(9, agedBrie.sellIn);
       assertEquals(11, agedBrie.quality);
   }
}
