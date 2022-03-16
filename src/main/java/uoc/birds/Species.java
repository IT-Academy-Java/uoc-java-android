package uoc.birds;

import java.util.Date;

public class Species {

  private String name;
  private int quantity;
  private String data;

  public Species() {
  }

  public Species(String name, int quantity, String data) {
    this.name = name;
    this.quantity = quantity;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Species{" +
            "name='" + name + '\'' +
            ", quantity=" + quantity +
            ", data='" + data + '\'' +
            '}';
  }
}
