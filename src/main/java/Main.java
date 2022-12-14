import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Product p1 = new Product(1, "Football", 90.98);
    Product p2 = new Product(2, "Sneakers", 499.00);
    Food f1 = new Food(3, "Chocolate", 28.5, LocalDate.of(2022,12,24));
    Food f2 = new Food(4, "Milk", 16.95, LocalDate.now().plusDays(3));
    Food f3 = new Food(5, "Butter", 36.95, LocalDate.now().minusDays(1));

    //System.out.println(p1);
    //System.out.println(f1.toString());
    //System.out.println(f2.toString());

    ArrayList<Product> products = new ArrayList<>();
    products.add(p1);
    products.add(p2);
    products.add(f1);
    products.add(f2);
    products.add(f3);
    //System.out.println(f2.isExpired());
    //System.out.println(f3.isExpired());

    for (Product p: products) {
      System.out.println(p.toString()); //polymorfi

      if (p instanceof Food food) {
         System.out.println(food.isExpired());
      }
    }

  }
}