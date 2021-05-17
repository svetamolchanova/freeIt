package by.molchanova.lesson9.guesswhat;
/*
0,1,2,4,5,7,8
 */
public class Ugadajka2_1 {
	public static void main(String[] args) {
        try {
            System.err.println(" 0");
            try {
                System.err.println(" 1");
                System.err.println(" 2");
            } catch (RuntimeException e) {
                System.err.println(" 3");
            } finally {                 
                System.err.println(" 4");
            }
            System.err.println(" 5");
        } catch (Exception e) {
            System.err.println(" 6");
        } finally {
            System.err.println(" 7");
        }
        System.err.println(" 8");
    }
}
