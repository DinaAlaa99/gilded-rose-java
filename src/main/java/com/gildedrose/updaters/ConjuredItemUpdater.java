package com.gildedrose.updaters;

import com.gildedrose.GildedRoseUpdater;
import com.gildedrose.Item;

public class ConjuredItemUpdater implements GildedRoseUpdater {

    @Override
    public void updateQuality(Item item) {
       
        NormalItemUpdater updater = new NormalItemUpdater();
        updater.updateQuality(item);
        
        if (isPassedExpirationDate(item)) {
            decreaseQuality(item);
        }
        
        decreaseQuality(item);
    }
    
}
