package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseUpdater;

public class BackstagePassesUpdater implements GildedRoseUpdater {

  @Override
  public void updateQuality(Item item) {
    if (isPassedExpirationDate(item)) {
      setQualityToZero(item);
    } else {
      increaseQuality(item);
      if (item.sellIn <= 10) {
        increaseQuality(item);
      }
      if (item.sellIn <= 5) {
        increaseQuality(item);
      }
    }
    decreaseSellin(item);
  }
}
