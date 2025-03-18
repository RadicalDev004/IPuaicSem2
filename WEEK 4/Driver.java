import java.util.*;

public class Driver {
    String name;
    String vehicleType;
    int seats;
    String location;

    int status;
    double price;
    String paymentStatus;
    double wallet;
    List<Double> ratings;

    public Driver(String name, String vehicleType, int seats, String location,List<Double> ratings) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.seats = seats;
        this.location = location;
        this.paymentStatus = "Not paid";
        this.wallet = 0;
        this.status = 0;
        this.price = 0;
        this.ratings=ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public void acceptPayment() {
        if (status == 1) {
            if (paymentStatus.equals("Not paid")) {
                this.wallet = this.wallet + this.price;
                this.paymentStatus = "Paid";
                System.out.println("Payment accepted. " + name + "'s wallet balance: " + wallet);
            } else if (paymentStatus.equals("Error")) {
                System.out.println("Error in payment.");
                status = 0;

            }
        } else {
            System.out.println("No ride in progress to accept payment.");
        }
    }

    public void acceptRide(int numberOfClients) {
        if (numberOfClients < seats) {
            status = 1;
            seats = seats - numberOfClients;
            System.out.println(name + " accepted the ride.");
        } else {
            System.out.println(name + " has no available seats.");
        }
    }
    public void cancelRide() {
        if (status == 1) {
            status = 0;
            seats++;
            System.out.println(name + "has canceled the ride");
        } else {
            System.out.println(name + "has no ride to cancel");
        }
    }
    public double averageRating()
    {
        double sum = 0;
        for(var rt : ratings)
        {
            sum += rt;
        }
        return sum / ratings.size();
    }
    public void addRating(double rt)
    {
        ratings.add(rt);
    }
}
