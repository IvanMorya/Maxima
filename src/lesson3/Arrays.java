package lesson3;

public class Arrays {

    public static void main(String[] args) {
        // 2 способа объявления массива
        byte array[];
        short [] array2;

        // объявление массива и его инициализация (заполнение значениями)
        int [] array3 = {11, 23, 101};

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
