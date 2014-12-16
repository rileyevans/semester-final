import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

public class Sentry {
	 
	 public static void main(String[] args) {
		 Sentry riley = new Sentry(9, 3, Display.NORTH, Display.4);
       Sentry joey = new Sentry(4, 3, Display.NORTH, Display.INFINITY);
	 }
       while (riley.standingOnABeeper() && frontIsClear());
         riley.turnRight();
         
    }
    
       public void patrol() {
		   while(arg.joey.onABeeper && frontIsClear);
         joey.turnRight();
	}
}

}
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	