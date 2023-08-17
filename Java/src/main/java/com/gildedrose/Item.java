package com.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {
    private Updatable updater;

    private int sellIn;
    private String name;
    private int quality;


    public void update(){
        this.sellIn -= 1;
        this.quality = this.updater.updateQuality(this.quality, this.sellIn);
    }
}
