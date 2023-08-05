package com.gildedrose;

public class ItemFactory {
    Item buildItem(String name, int sellIn, int quality){
        if(name.toLowerCase().contains("conjured")){
            return new Conjured(name, sellIn, quality);
        }
        else if(name.toLowerCase().contains("Backstage passes".toLowerCase())){
            return new BackStagePass(name, sellIn, quality);
        }
        else if (name.toLowerCase().contains("agedbrie")){
            return new AgedBrie(name, sellIn, quality);
        }
        else if(name.toLowerCase().contains("sulfuras")){
            return new Sulfuras(name, sellIn);
        }
        return new Item(name, sellIn, quality);
    }
}
