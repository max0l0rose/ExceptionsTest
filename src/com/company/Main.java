package com.company;

public class Main {


    static int exTest() {
        float c = 0;
        try {
            c = 0 / .0F;
            c = 0 / 0;
            c++;
            c++;
            c++;
            c++;
        }
        catch (ArithmeticException e)
        {
            return 10; // 10 will be returned
        }
        catch (RuntimeException e)
        {
            c = 11;
        }
        catch (Exception e)
        {
            c = 12;
        }
        catch (Throwable e)
        {
            c = 13;
        }
        finally
        {
            //try {
            throw new NullPointerException("qqq");
            //}
            //catch(Exception ex) {
            //    return 100;
            //}

            //return; // !!!!!!!! Ловить не надо! )))))))))))) Все работает
        }

        //return a;
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
            int c = 1 / 0;
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
    }
}
