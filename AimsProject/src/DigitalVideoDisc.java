public class DigitalVideoDisc {
  private String title;
  private String category;
  private String director;
  private int length;
  private float cost;

  public void setCategory(String category) {
    this.category = category;
  }

  public DigitalVideoDisc() {
  }

  public DigitalVideoDisc(String title) {
    this.title = title;
  }

  public DigitalVideoDisc(String category, String title, float cost) {
    this.category = category;
    this.title = title;
    this.cost = cost;
  }

  public DigitalVideoDisc(String director, String category, String title, float cost) {
    this.director = director;
    this.category = category;
    this.title = title;
    this.cost = cost;
  }

  public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.length = length;
    this.cost = cost;
  }

  public float getCost() {
    return cost;
  }

  public String getCategory() {
    return category;
  }

  public String getDirector() {
    return director;
  }

  public int getLength() {
    return length;
  }

  public String getTitle() {
    return title;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // DVD - [Title] - [category] - [Director] - [Length]: [Price]
  @Override
  public String toString() {
    return "DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": "
        + this.cost;
  }

  public boolean isMatch(String title) {
    return this.title.equals(title);
  }

}
