package lesson02;

public class MainClass {

    public static int justMethod () {
        int a = 0;
        return 10 / a;
    }

    public static void justArrayMethod () {
        int a = 10;
        int b = 10 / 0;
        int c[] = {1,2,3};
        System.out.println(c[42] + b);
    }

    public static void newArrayMethod () {
        try {
            justArrayMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds! " + e);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero! " + e);
        }
        System.out.println("Program is completed!");
    }

    public static void throwTest() {
        try {
            throw new ArrayIndexOutOfBoundsException("NPE Test");
        }
//         catch (NullPointerException e ) {
//            System.out.println("Catch Block");
//        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Got the index out of bounds exception");
        }
    }

    public static void secondaryMethod() throws IndexOutOfBoundsException {
        int[] a = {1, 2, 3};
        a[43] = 2;
    }

    public static void firstMethod() {
        try { secondaryMethod();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of Bounds" + e);
        } finally {
            System.out.println("The code is successfully completed");
        }
    }


    public static void main(String[] args) {
        firstMethod();
    }
}
