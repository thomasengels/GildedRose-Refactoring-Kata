package com.gildedrose;

public class UpdatableFactory {
    Updatable buildUpdater(String name){
        if(name.toLowerCase().contains("conjured")){
            return new Conjured();
        }
        else if(name.toLowerCase().contains("Backstage passes".toLowerCase())){
            return new BackStagePass();
        }
        else if (name.toLowerCase().contains("agedbrie")){
            return new AgedBrie();
        }
        else if(name.toLowerCase().contains("sulfuras")){
            return new Sulfuras();
        }
        return new RegularItem();
    }
}
