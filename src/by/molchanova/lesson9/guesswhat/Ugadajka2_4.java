package by.molchanova.lesson9.guesswhat;

@SuppressWarnings("unused")
public class Ugadajka2_4 {
    public static void main(String[] args) {
        try {
            System.err.println(" 0");
            try {
                System.err.println(" 1");
                if (true) {
                    throw new Error();
                }
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
