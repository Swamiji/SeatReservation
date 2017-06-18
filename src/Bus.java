import java.util.logging.Level;
import java.util.logging.Logger;


public class Bus {
	 private final boolean [] seats = new boolean[50];
	    private int nextSeat = 0;

	    public void bookSeat() throws Exception{
	        if(nextSeat<seats.length){
	        seats[nextSeat]=true;
	        nextSeat++;
	        System.out.print("Seat number " +nextSeat+ " booked");
	        }else{
	            System.out.println("The bus is full sorry");
	        }
	        }

	
}
