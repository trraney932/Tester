import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Toyota");
    cars.add("Jeep");
    cars.add("Dodge");
    cars.add("Ram");
    cars.add("GMC");
    cars.add("Mustang");
    cars.add("Nissan");
    cars.add("Honda");
    cars.add("Delta");
    cars.add("Trucks");
    cars.add("Delivery Trucks");
     for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}