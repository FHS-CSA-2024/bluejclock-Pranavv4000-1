package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay clocktest1 = new ClockDisplay (3,32);
        String clocktest1Output = clocktest1.getTime();
        System.out.println(clocktest1Output); 
        clocktest1.timeTick();
        clocktest1Output = clocktest1.getTime(); 
        System.out.println(clocktest1Output); 
        
        ClockDisplay clocktest2 = new ClockDisplay (3,9);
        String clocktest2Output = clocktest2.getTime();
        System.out.println(clocktest2Output); 
        clocktest2.timeTick();
        clocktest1Output = clocktest2.getTime(); 
        System.out.println(clocktest1Output); 
        
        ClockDisplay clocktest3 = new ClockDisplay (1,59);
        String clocktest3Output = clocktest3.getTime();
        System.out.println(clocktest1Output); 
        clocktest3.timeTick();
        clocktest3Output = clocktest3.getTime(); 
        System.out.println(clocktest1Output); 
        
        ClockDisplay clocktest4 = new ClockDisplay (9, 59);
        String clocktest4Output=clocktest4.getTime();
        System.out.println(clocktest4Output); 
        clocktest4.timeTick();
        clocktest4Output=clocktest4.getTime(); 
        System.out.println(clocktest4Output); 
        
        ClockDisplay clocktest5 = new ClockDisplay (23,59);
        String clocktest5Output = clocktest5.getTime();
        System.out.println(clocktest5Output); 
        clocktest5.timeTick();
        clocktest5Output = clocktest1.getTime(); 
        System.out.println(clocktest1Output); 
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test1 = new ClockDisplaySeconds(); 
        String test1output = clocktest1.getTime(); 
        System.out.println(test1output); 
        
        ClockDisplaySeconds test2 = new ClockDisplaySeconds (2,45,26); 
        String test2output = clocktest2.getTime(); 
        System.out.println(test2output); 
        
        ClockDisplaySeconds test3 = new ClockDisplaySeconds (5,1,8); 
        String test3output = clocktest3.getTime(); 
        System.out.println(test3output); 
        
        ClockDisplaySeconds test4 = new ClockDisplaySeconds (3,32,59); 
        String test4output = clocktest4.getTime(); 
        System.out.println(test4output); 
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
