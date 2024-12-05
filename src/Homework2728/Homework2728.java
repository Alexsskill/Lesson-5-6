package Homework2728;

import java.util.Arrays;

public class Homework2728 {
    public static void main(String[] args) {

        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * 3 + j;
            }
        }

        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        {
            //Считаем сумму элементов в каждой строке
            for (int i = 0; i < array.length; i++) {
                int sum1 = 0;
                for (int j = 0; j < array[i].length; j++) {
                    sum1 += array[i][j];
                }
                System.out.println("Сумма строки " + (i + 1) + ": " + sum1);
            }

            //Считаем сумму элементов в каждом столбце
            for (int j = 0; j < array[0].length; j++) {
                int sum2 = 0;
                for (int i = 0; i < array.length; i++) {
                    sum2 += array[i][j];
                }
                System.out.println("Сумма столбца " + (j + 1) + ": " + sum2);
            }
        }


        // Исходный массив
        int[] originalArray = {1, 2, 3, 4, 5};

        // Выводим исходный массив
        System.out.println("Исходный массив:" + Arrays.toString(originalArray));

        // Вызов метода, работающего с копией массива
        modifyArrayCopy(originalArray);

        // Проверяем, что исходный массив не изменился S
        System.out.println("Исходный массив после работы с копией:" + Arrays.toString(originalArray));

        // Вызов метода, работающего с исходным массивом
        modifyOriginalArray(originalArray);

        // Проверяем, что исходный массив изменился
        System.out.println("Исходный массив после работы с оригиналом:" + Arrays.toString(originalArray));
    }

    /**
     * Метод, который создает копию массива и изменяет значения в копии
     * @param array Массив типа int
     */
    public static void modifyArrayCopy(int[] array) {
        // Создаем полную копию массива
        int[] arrayCopy = array.clone();

        // Изменяем значения в копии (например, увеличиваем каждое значение на 10)
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] += 10;
        }

        // Выводим измененный массив копии
        System.out.println("Измененный массив копии:" + Arrays.toString(arrayCopy));
    }

    /**
     * Метод, который изменяет значения в исходном массиве
     * @param array Массив типа int
     */
    public static void modifyOriginalArray(int[] array) {
        // Увеличиваем каждое значение в исходном массиве на 5
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
        }
    }

    /**
     * Метод для вывода массива на экран
     * @param array Массив типа int
     */
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
