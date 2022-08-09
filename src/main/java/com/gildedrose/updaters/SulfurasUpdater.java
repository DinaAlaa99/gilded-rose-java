package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseUpdater;

public class SulfurasUpdater implements GildedRoseUpdater{

    @Override
    public void updateQuality(Item item) {
        // "Sulfuras", being a legendary item, never has to be sold or decreases in Quality     
    }
    
}
