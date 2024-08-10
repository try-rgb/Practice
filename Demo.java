class Laptop {
  private static String name; // static
  private int price;

  public String getName(){
    return name;
  }
  public int getPrice(){
    return price;
  }

  public void setName(String nam){
    name = nam;
  }
  public void setPrice(int pric){
    price = pric;
  }

}

public class Demo {
  public static void main (String args[]){ 
    Laptop object = new Laptop();

    object.setName("lap");
    object.setPrice(3053928);

    System.out.println( object.getName() );
    System.out.println( object.getPrice() );
  }
}

