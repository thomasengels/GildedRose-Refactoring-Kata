package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {
   @Test
   void qualityIncreasesWhenSellInDecreases(){
       //given
       AgedBrie agedBrie = new AgedBrie();

       //when
       int quality = agedBrie.updateQuality(10, 9);

       //then
       assertEquals(11, quality);
   }
}
