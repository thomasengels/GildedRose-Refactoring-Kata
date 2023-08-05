package com.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {

    String name;

    int sellIn;

    int quality;

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
