import java.time.LocalDate;

public class Food extends Product{

  private LocalDate expirationDate;

  public Food(int id, String description, double price, LocalDate expirationDate) {
    super(id, description, price);
    this.expirationDate = expirationDate;
  }

 // @Override
  /*public String toString(){
   return super.toString() + " " + expirationDate;
    //return "Product: " +  getId() + " " + getDescription() + " " + getPrice() + " " + expirationDate;
  }*/
}
