package genaricliberies;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * this class contains reusable java methods
 * @author SATURN
 * 
 */

public class JavaUtility {
	/**
	 * this method generates random number within the limit
	 * @param limit
	 * @return
	 */
	
	public int generateRandomnum(int limit) {
   Random random =new Random();
   int randomNum = random.nextInt(limit);
   return randomNum;
   /**
    * this method retuns  current time in specified format
    * @return
    */
}
 
	public String getcurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy_hh-mm_ss");
		String currentTime = sdf.format(date);
		return currentTime;
		
	}
}