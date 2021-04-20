package by.molchanova.lesson9.reflection;

import java.lang.reflect.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        User user = new User();
        reflectionAnalyse(user);
    }

    public static void reflectionAnalyse(Object user) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //System.out.println(user.getClass().getName());
        Field[] fields = user.getClass().getDeclaredFields();
        //System.out.println(Arrays.toString(fields));
        //Field field = user.getClass().getField("id");
        Field field = user.getClass().getDeclaredField("name");
        //System.out.println(field);
        field.setAccessible(true);
        String name = (String) field.get(user);
        //System.out.println(name);
        field.set(user, "Tom");
        //System.out.println(user);
        //printData(user);
//
        Class clazz = Class.forName(User.class.getName());
        User user2 = (User) clazz.newInstance();
//
        Class[] params = {int.class, String.class};
        User user3 = (User) clazz.getConstructor(params).newInstance(3, "Anna");
        //System.out.println(user3);
//
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class param : paramTypes) {
                System.out.println(param.getName());
            }
            System.out.println("********************");
        }
    }

    public static void printData(Object myClass){
        try {
//            Method[] methods = myClass.getClass().getDeclaredMethods();
//            for (Method method : methods) {
//                System.out.println(method.getName());
//            }
//            //System.out.println(methods);
            Method method = myClass.getClass().getDeclaredMethod("returnUser");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
