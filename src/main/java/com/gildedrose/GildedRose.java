package com.gildedrose;

import com.gildedrose.updaters.AgedBrieUpdater;
import com.gildedrose.updaters.BackstagePassesUpdater;
import com.gildedrose.updaters.NormalItemUpdater;
import com.gildedrose.updaters.SulfurasUpdater;

class GildedRose {

  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
        GildedRoseUpdater updater = categorizeItem(item);
        updater.updateQuality(item);
    }
  }

    private GildedRoseUpdater categorizeItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasUpdater();
        }
        else if (item.name.equals("Aged Brie")) {
            return new AgedBrieUpdater();
        }
        else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassesUpdater();
        }
        else {
            return new NormalItemUpdater();
        }
      
    }
}
