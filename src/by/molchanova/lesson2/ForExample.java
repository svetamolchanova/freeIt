package by.molchanova.lesson2;

public class ForExample {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; ++i) {
            System.out.println("i = " + i);
//            if (i == 3) {
//                //continue;
//                break;
//            }
            for (int j = 0; j < 5; j++) {
                System.out.println("***" + j);
                if (j == 3) {
                    continue;
                    //break;
                }
                System.out.println("j  = " + j + ", " + "i = " + i);
            }
        }
        
//        for (i = 10; i > 5; i--) {
//            String str = "Hello";
//            System.out.println(str + " *** " + i);
//            if (i == 8) {
//                continue;
//            }
//            System.out.println(str + " " + i);
//        }

    }
}

