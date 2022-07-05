package lesson02.homework;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int x, int j) {
        System.out.printf("Неверный размер массива. Требуется 4х4, фактически %dx%d", x,j);
    }
}
