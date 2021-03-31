package by.molchanova.lesson4;

public class Runner {

    public static void main(String[] args) {

        String string = new String("test");
        String str = "test";
        String str1 = "test";
//        System.out.println(string == str);
//        System.out.println(str == str1);
//        string.intern();
//        System.out.println(string == str);
//        string = string.intern();
//        System.out.println(string == str);
//        System.out.println(string);
//        String newStr = "abc" + "def";
//        newStr = newStr + "z";
//        System.out.println(newStr);

//        str = str.substring(2);
//        System.out.println(str);
//        char[] chars = {'a','b', 'c', 'b'};
//        String s = new String(chars);
        //System.out.println(s.contains("b c"));
//        int i = s.lastIndexOf("d");
//        String s1 = "Abcb";
//        System.out.println(s.equalsIgnoreCase(s1));
//        System.out.println(String.format("%s find index %f", s, i));
//        String str = "Hello, world,   Java ,  8";
//        String[] array = str.split("\\W");
//        for (String ar : array) {
//            System.out.println(ar);
//        }
//        str = str.replace(",", "!");
//        System.out.println(str);
        //System.out.println(str.indexOf("string"));

//        String str = new String("Test");
//        String str2 = "Test";
//        System.out.println(str == str2);
//
//        str = str.intern();
//        System.out.println(str == str2);

//        String string = "Hello";
//        string = string.concat(", Java");
//        System.out.println(string);
//        String str = String.join(", ", "Hello", "all" , "world");
//        System.out.println(str);
//
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append(", Java");
//        System.out.println(stringBuilder);
//        stringBuilder.insert(2, "T");
//        System.out.println(stringBuilder);
//        stringBuilder.delete(1,5);
//        System.out.println(stringBuilder);
//
        StringBuilder str4 = new StringBuilder(50);

        String str5 = "test";
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 1000000; i++) {
            str5 += " ";
        }
        System.out.println(System.currentTimeMillis());

        System.out.println("*******************");
        System.out.println(System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder("test");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(" ");
        }
        System.out.println(System.currentTimeMillis());

        System.out.println("*******************");
        System.out.println(System.currentTimeMillis());
        StringBuffer stringBuffer = new StringBuffer("test");
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append(" ");
        }
        System.out.println(System.currentTimeMillis());
//
//        String str10 = "  Найти в   строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.";
//        str10 = str10.trim();
//        String[] array = str10.split(" +");
//        System.out.println(array.length);
    }
}
