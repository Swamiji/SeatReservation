
public class Main {

    public static void main(String [] args) throws InterruptedException{
        Bus someCompany = new Bus();

        Passenger p1 = new Passenger(someCompany,"Name1");
        Passenger p2 = new Passenger(someCompany, "Name2");

        p1.start();
        p2.start();

    }

}
