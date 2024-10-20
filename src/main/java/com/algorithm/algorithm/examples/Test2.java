package com.algorithm.algorithm.examples;

public class Test2 {
    /*
Описание: Напиши функцию, которая принимает массив целых чисел и возвращает
второй по величине элемент в этом массиве. Если второго максимального элемента
нет (например, если все элементы одинаковые), то функция должна вернуть null.

Пример:

Ввод: [3, 5, 1, 9, 7]

Вывод: 7

Ввод: [9, 9, 9]

Вывод: null
     */

    public Integer getSecondMaxValue(Integer[] array) {
        if (array == null || array.length < 2) {
            return null;
        }

        int firstMax = array[0];
        Integer secondMax = null;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] < firstMax && (secondMax == null || array[i] > secondMax)) {
                secondMax = array[i];  
            }
        }

        return secondMax;
    }

}
