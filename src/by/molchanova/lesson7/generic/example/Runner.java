package by.molchanova.lesson7.generic.example;

public class Runner {

    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("new item");
        box.setItem(1);

        Object item = box.getItem();
        Integer itemInt = (Integer)item;

        BoxString boxString = new BoxString();

        BoxInteger integer = new BoxInteger();

        Shell<String> shell = new Shell<>();
        //shell.setItem(1); //компилятор не позволяет записать данное значение
        shell.setItem("new shell");
        System.out.println(shell.getItem());
        //Integer shellItem = (Integer)shell.getItem();
//
//        System.out.println("-------------");
//
        Shell<Integer> integerShell = new Shell<>();
        integerShell.setItem(1);
        //shell.setItem(1);
        System.out.println(integerShell.getItem());
    }
}
