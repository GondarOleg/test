package com.company;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static BigInteger i = BigInteger.ONE;

    public static BigInteger fact(int x){
        //Функция вычисления факториала
        if (x>0){
            i = i.multiply(BigInteger.valueOf(x));
            fact(x-1);
        }
        return i;
    }

    public static void main(String[] args) {
        String IO = "Олег Николаевич";
        Calendar writingdate = new GregorianCalendar(2016,2,12);
        int x, i;
        BigInteger cicleFactorial = BigInteger.ONE;
        Scanner sc = new Scanner(System.in);
        System.out.println("IO: " + IO);
        System.out.println("Дата написания: " +writingdate.get(Calendar.DATE) + "-" +writingdate.get(Calendar.MONTH) +"-"+writingdate.get(Calendar.YEAR));
        System.out.println("Введи число:");
        x = sc.nextInt();
        //Вычисление в цикле
        if ( x>0){
            for (i=1; i<=x;i++){
                cicleFactorial = cicleFactorial.multiply(BigInteger.valueOf(i));
            }
        }
        System.out.println("Вычисление в цикле: " + cicleFactorial);
        //Вычисление с помощью рекурсивного вызова функции
        System.out.println("Вычисление с рекурсией: " + fact(x));
    }
}

