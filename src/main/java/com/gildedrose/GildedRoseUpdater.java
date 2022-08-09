package com.gildedrose;

public interface GildedRoseUpdater {
  
  int MINIMUM_QUALITY = 0;
  int MAXIMUM_QUALITY = 50;
  
  public void updateQuality(Item item);

  default void increaseQuality(Item item) {
    if (item.quality < MAXIMUM_QUALITY) {
      item.quality++;
    }
  }

  default void decreaseQuality(Item item) {
    if (item.quality > MINIMUM_QUALITY) {
      item.quality--;
    }
  }

  default void decreaseSellin(Item item) {
    item.sellIn--;
  }

  default boolean isPassedExpirationDate(Item item) {
    return item.sellIn <= 0;
  }

  default void setQualityToZero(Item item) {
    item.quality = 0;
  }
}
