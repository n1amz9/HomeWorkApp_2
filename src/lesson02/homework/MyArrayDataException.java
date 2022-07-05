package lesson02.homework;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException (int x, int j) {
        System.out.printf("Неверный формат числа в ячейке %d %d", x, j);
    }
}
