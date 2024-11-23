public class Cart {
  public static final int MAX_NUMBERS_ORDERED = 20;
  private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
  private int qtyOrdered = 0;

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered < MAX_NUMBERS_ORDERED) {
      itemsOrdered[qtyOrdered] = disc;
      qtyOrdered++;
      System.out.println("The disc has been added.");
    } else {
      System.out.println("The cart is almost full.");
    }
  }

  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered > 0) {
      for (int i = 0; i < qtyOrdered; i++) {
        if (itemsOrdered[i] == disc) {
          for (int j = i; j < qtyOrdered - 1; j++) {
            itemsOrdered[j] = itemsOrdered[j + 1];
          }
          qtyOrdered--;
          System.out.println("The disc has been removed.");
          return;
        }
      }
      System.out.println("The disc is not in the cart.");
    } else {
      System.out.println("The cart is empty.");
    }
  }

  public float totalCost() {
    float total = 0;
    for (int i = 0; i < this.qtyOrdered; i++) {
      total += this.itemsOrdered[i].getCost();
    }
    return total;
  }

  // ***********************CART***********************
  // Ordered Items:
  // 1. DVD - [Title] - [category] - [Director] - [Length]: [Price] $
  // 2. DVD - [Title] - ...
  // Total cost: [total cost]
  // ***************************************************
  public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < this.qtyOrdered; i++) {
      System.out.println(i + 1 + ". DVD - " + this.itemsOrdered[i].toString());
    }
    System.out.println("Total cost: " + totalCost());
    System.out.println("***************************************************");
  }

  public void search(String title) {
    for (int i = 0; i < qtyOrdered; i++) {
      if (this.itemsOrdered[i].isMatch(title)) {
        System.out.println("The disc is in the cart.");
        return;
      }
    }
    System.out.println("The disc is not in the cart.");
  }
}
