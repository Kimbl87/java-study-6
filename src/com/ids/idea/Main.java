package com.ids.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int a = sc.nextInt();
//Работа с весами
        if (a == 1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - унция , 3 - фунт");
            int b = sc.nextInt();
            System.out.println("Введите колличество выбранных единиц");
            double x = sc.nextInt();
            double gram = 0, ounce = 0, lb = 0;
            switch (b) {
                case 1:
                    gram = x;
                    ounce = x * 0.035;
                    lb = x * 0.0022;
                    break;
                case 2:
                    gram = x * 28.35;
                    ounce = x;
                    lb = x * 0.0625;
                    break;
                case 3:
                    gram = x = 453.59 ;
                    ounce = x * 16;
                    lb = x;
                    break;
                default:
                    System.out.println("Введен некорректный индекс величены");
                    System.exit(0);
            }
            System.out.println("Результат:");
            System.out.println("грамм: " + gram);
            System.out.println("унция: " + ounce);
            System.out.println("фунт: " + lb);
        }
        //Работа с расстояниями
        else if (a == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int b = sc.nextInt();
            System.out.println("Введите колличество выбранных единиц");
            double x = sc.nextInt();
            double meters = 0, miles = 0, yards = 0, feet = 0;
            switch (b) {
                case 1:
                    meters = x;
                    miles = x * 0.0006;
                    yards = x * 1.094;
                    feet = x * 3.281;
                    break;
                case 2:
                    meters = x * 1609.344;
                    miles = x;
                    yards = x * 1760;
                    feet = x * 528;
                    break;
                case 3:
                    meters = x * 0.9144;
                    miles = x * 0.0006;
                    yards = x;
                    feet = x * 3;
                    break;
                case 4:
                    meters = x * 0.3048;
                    miles = x * 0.0002;
                    yards = x * 0.333;
                    feet = x;
                    break;
                default:
                    System.out.println("Введен некорректный индекс величены");
                    System.exit(0);
            }
            System.out.println("Результат:");
            System.out.println("Метры: " + meters);
            System.out.println("Мили: " + miles);
            System.out.println("Ярды: " + yards);
            System.out.println("Футы: " + feet);

        }
        else System.out.println("Некорректное значение типа величены");
        }
    }
