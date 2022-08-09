package com.gildedrose.updaters;

import com.gildedrose.Item;
import com.gildedrose.GildedRoseUpdater;

public class AgedBrieUpdater implements GildedRoseUpdater {

  @Override
  public void updateQuality(Item item) {
    if (isPassedExpirationDate(item)) {
      increaseQuality(item);
    }
    increaseQuality(item);
    decreaseSellin(item);
  }
}
