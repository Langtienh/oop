public class TestStore {
  public static void main(String[] args) {
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

    // add to store
    Store store = new Store();
    store.addDigitalVideoDisc(dvd1);
    store.addDigitalVideoDisc(dvd2);
    store.addDigitalVideoDisc(dvd3);

    // remove from store
    store.removeDigitalVideoDisc(dvd1);

  }
}
