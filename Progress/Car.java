public class Car {
    String Model;
    boolean hasOwner;
    int Mileage;
    
    public Car(String CarModel, boolean CarOwner, int CarMileage) {
      System.out.println("Constructor turn");
      Model = CarModel;
      hasOwner = CarOwner;
      Mileage = CarMileage;
    }
    
    public static void main(String[] args) {
      System.out.println("Main startes");
      Car BMW = new Car("BMW x", false, 4000);
      Car Tesla = new Car("Telsa S", true, 12000);
      boolean isBMWnew = BMW.Mileage > Tesla.Mileage;
      int totalMileage = BMW.Mileage + Tesla.Mileage;
      System.out.println("Two cars I love are " + BMW.Model + " and a " + Tesla.Model);
      System.out.println("The statement that BMW is an older is: " + isBMWnew);
      System.out.println("The total age of the cars is: " + totalMileage);
      System.out.println("Main completes");
    }
  }
