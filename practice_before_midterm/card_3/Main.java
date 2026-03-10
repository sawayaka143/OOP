package practice_before_midterm.card_3;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Vehicle car = new Vehicle(2021, "ABC123", 20000);
    Electronics laptop = new Electronics("Dell", "XYZ789", 1200);

    ArrayList<Asset> assets = new ArrayList<>();
    assets.add(car);
    assets.add(laptop);

    for (Asset asset : assets) {
      System.out.println("Serial Number: " + asset.serialNumber);
      System.out.println("Value: " + asset.value);

      if (asset instanceof Taxable) {
        Taxable taxableAsset = (Taxable) asset;
        System.out.println("Tax: " + taxableAsset.calculateTax());
      }

      System.out.println();
    }
  }
}
