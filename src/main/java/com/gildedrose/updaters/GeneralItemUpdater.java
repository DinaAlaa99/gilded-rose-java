package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseUpdater;

public class GeneralItemUpdater implements GildedRoseUpdater {

  @Override
  public void updateQuality(Item item) {
    decreaseQuality(item);
    if (isPassedExpirationDate(item)) {
      decreaseQuality(item);
    }
    decreaseSellin(item);
  }
}
