import java.util.logging.Level;
import java.util.logging.Logger;


public class Passenger extends Thread {
	 Bus bus;
	    String passengerName;

	    public Passenger(Bus bus, String passengerName){
	        this.bus=bus;
	        this.passengerName=passengerName;
	    }

	    public void run(){
	        synchronized(bus){
	            try {
	                bus.bookSeat();
	                Thread.sleep(500);
	            } catch (Exception ex) {
	                Logger.getLogger(Passenger.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            System.out.println("by " + passengerName);

	        }
	    }

	    public String getPassengerName() {
	        return passengerName;
	    }

	    public void setPassengerName(String passengerName) {
	        this.passengerName = passengerName;
	    }
}
