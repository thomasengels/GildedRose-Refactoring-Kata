package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        UpdatableFactory factory = new UpdatableFactory();

        Item[] items = new Item[] {
                new Item(factory.buildUpdater("+5 Dexterity Vest"), 10, "+5 Dexterity Vest",20), //
                new Item(factory.buildUpdater("Aged Brie"), 2, "Aged Brie",0), //
                new Item(factory.buildUpdater("Elixir of the Mongoose"), 5, "Elixir of the Mongoose",7), //
                new Item(factory.buildUpdater("Sulfuras, Hand of Ragnaros"), 0, "Sulfuras, Hand of Ragnaros",80), //
                new Item(factory.buildUpdater("Sulfuras, Hand of Ragnaros"), -1,"Sulfuras, Hand of Ragnaros", 80),
                new Item(factory.buildUpdater("Backstage passes to a TAFKAL80ETC concert"), 15, "Backstage passes to a TAFKAL80ETC concert", 20),
                new Item(factory.buildUpdater("Backstage passes to a TAFKAL80ETC concert"), 10, "Backstage passes to a TAFKAL80ETC concert", 49),
                new Item(factory.buildUpdater("Backstage passes to a TAFKAL80ETC concert"), 5,"Backstage passes to a TAFKAL80ETC concert", 49),
                // this conjured item does not work properly yet
                new Item(factory.buildUpdater("Conjured Mana Cake"), 3, "Conjured Mana Cake",6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item regularItem : items) {
                System.out.println(regularItem);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
