import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       // Driver driver=new Driver("Alexandra","Skoda",4,"Dorobant");
        List<Double> ratings=new ArrayList<>();
        ratings.add(5.00);
        ratings.add(4.66);
        ratings.add(4.33);
        Driver driver=new Driver("Bianca","Audi",4,"Dorohoi",ratings);



        driver.acceptRide(2);
        driver.setPrice(20.57);
        driver.acceptPayment();
        driver.averageRating();
    }
}