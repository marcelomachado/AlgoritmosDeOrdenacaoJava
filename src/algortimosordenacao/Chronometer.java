public class Chronometer {
	private static long startValue;  
 	private static long stopValue;  
 	private static long timeDiff;  
  
 	public static void start() {  
  		startValue = System.nanoTime();  
  		stopValue = 0;  
  		timeDiff = 0;  
 	}  
  
  	public static void stop() {  
  		stopValue = System.nanoTime();  
  		timeDiff = stopValue - startValue;  
 	}  
    
 	public static long elapsedTime() {  
  		return timeDiff;  
 	}  
}
