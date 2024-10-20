package com.algorithm.algorithm.examples;

public class Test1 {
    /*
    линейный жадный алгоритм из группы поисковых алгоритмов. Он прост в реализации и эффективен для задач,
    где нужно найти наибольшее или наименьшее значение при одном проходе через данные
     */

    public Integer getMaxValue(Integer[] array) {
        int maxVal = array[0];
        for (Integer array1 : array) {
            if (array1 > maxVal) {
                maxVal = array1;
            }
        }
        return maxVal;
    }
}
