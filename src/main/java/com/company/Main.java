package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    static float exTest() throws IllegalArgumentException, IOException
    {
        if (true)
            throw new IllegalArgumentException("qqqq");

        float c = 0;
        try {
            c = 0 / .0F;
            //c = 0 / 0;
            c++;
            c++;
        }
//        catch (RuntimeException e)
//        {
//            c = 11;
//        }
        catch (ArithmeticException e)
        {
            //if (true)
            //    throw new NullPointerException("qqq");
            c = 111;

            //return 10; // 10 will be returned
        }
//        catch (Exception e)
//        {
//            c = 12;
//        }
        catch (Throwable e)
        {
            c = 13;
        }
        finally
        {
//            //try {
//            if (true)
//                throw new NullPointerException("qqq");
//            //}
//            //catch(Exception ex) {
//            //    return 100;
//            //}

            //return; // !!!!!!!! Ловить не надо! )))))))))))) Все работает
        }

        return c;
    }



//
//    public class Parent {
//        public void f() throws IOException, InterruptedException
//        {
//        }
//    }
//
//    class Child extends Parent {
//        @Override
//        public void f() throws Exception // error
//        {
//        }
//    }



    //    public static void f1() throws Exception
//    {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }



    public static String exTest2() {
        try {
            int c = (int)(1 / .0F);
            c = 1 / 0;
            return "SomeString";
        }
        catch(Exception ex) {
            return "Catch message";
        }
        finally {
            return "Finally message";
        }
    }



    public static void main(String[] args) {
        String s = exTest2();

        try {
            exTest();
        }
        catch (IOException e) {
            int a = 1;
        }

    }
}
