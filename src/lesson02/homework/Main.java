package lesson02.homework;

import java.util.Random;

public class Main {

    public static String[][] array = new String[4][4];
    public static String[][] badArray = new String[4][4];

    public static void arrayException(String[][] x) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (x.length != 4 || x[1].length != 4) {
            throw new MyArraySizeException(x.length, x[1].length);
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                try {
                    sum += Integer.parseInt(x[i][j]);}
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.printf("Сумма элементов массива равна %d %n", sum);
    }


    public static void checkArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        for (int i = 0; i < array.length; i++) {    // верный массив
            for (int j = 0; j < array[1].length; j++) {
                array[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }

        for (int i = 0; i < badArray.length; i++) {     // неверный массив (SizeException)
            for (int j = 0; j < badArray[1].length; j++) {
                if (i == 1 && j == 1 ) {
                    badArray[i][j] = "Hi";
                } else {
                    badArray[i][j] = String.valueOf((int) (Math.random() * 10));
                }

            }
        }

        try {
           checkArray(array);
           arrayException(array);
           checkArray(badArray);
           arrayException(badArray);
       } catch (MyArraySizeException | MyArrayDataException e) {
           System.out.println("");
       } finally {
            System.out.printf("%n Код выполнен");
        }
            }
        }
