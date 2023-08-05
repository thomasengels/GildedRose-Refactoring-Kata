package com.gildedrose;

public class ItemFactory {
    Item buildItem(String name, int sellIn, int quality){
        return new Item(name, sellIn, quality);
    }
}
