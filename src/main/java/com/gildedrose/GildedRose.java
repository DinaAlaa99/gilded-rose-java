package com.gildedrose;

class GildedRose {

  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      if (item.name.equals("Aged Brie")) {
        updateAgedBrie(item);
      } else if (
        item.name.equals("Backstage passes to a TAFKAL80ETC concert")
      ) {
        updateBackstagePass(item);
      } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {} else {
        updateGeneralItem(item);
      }
    }
  }

  private void increaseQuality(Item item) {
    if (item.quality < 50) {
      item.quality++;
    }
  }

  private void decreaseQuality(Item item) {
    if (item.quality > 0) {
      item.quality--;
    }
  }

  private void decreaseSellin(Item item) {
    item.sellIn--;
  }

  private void updateAgedBrie(Item item) {
    if (item.sellIn <= 0) {
      increaseQuality(item);
    }
    increaseQuality(item);
    decreaseSellin(item);
  }

  private void updateBackstagePass(Item item) {
    if (item.sellIn <= 0) {
      item.quality = 0;
    } else {
      increaseQuality(item);
      if (item.sellIn < 11) {
        increaseQuality(item);
      }
      if (item.sellIn < 6) {
        increaseQuality(item);
      }
    }
    decreaseSellin(item);
  }

  private void updateGeneralItem(Item item) {
    decreaseQuality(item);
    if (item.sellIn <= 0) {
      decreaseQuality(item);
    }
    decreaseSellin(item);
  }
}
