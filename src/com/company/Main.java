package com.company;

import Size.Size;
import Support.Support;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String inputX = "Введите количество байт: ";
        String error = "Допущена ошибка, повторите ввод: ";
        long x = Support.inputLong (scan, inputX, error);
        System.out.println ("Ответ: " +
                new Size(x).toString ());
    }
}
