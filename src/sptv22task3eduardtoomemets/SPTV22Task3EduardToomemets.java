package sptv22task3eduardtoomemets;

import java.util.Scanner;


public class SPTV22Task3EduardToomemets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.next();
        
        System.out.println("Введите вашу фамилию");
        String surName = scanner.next();
        
        System.out.println("Введите ваш личный код");
        String isikukood = scanner.next();
        
        System.out.println(isikukood);
        
        char firstDigit = isikukood.charAt(0);
        int thousand = Character.getNumericValue(firstDigit);
        
        if (thousand == 1 || thousand == 2) {
            thousand = 1800;
        } else if (thousand == 3 || thousand == 4) {
            thousand = 1900;
        } else if (thousand == 5 || thousand == 6) {
            thousand = 2000;
        } else if (thousand == 6 || thousand == 8) {
            thousand = 2100;
        }
        
        char secondDigit = isikukood.charAt(1);
        int tens = Character.getNumericValue(secondDigit) * 10;
        
        char thirdDigit = isikukood.charAt(2);
        int ones = Character.getNumericValue(thirdDigit);
        
        int dateOfBirth = thousand + tens + ones;
        
        System.out.println(dateOfBirth);
        
        char fourthDigit = isikukood.charAt(3);
        int firstMonth = Character.getNumericValue(fourthDigit);
        
        char fifthDigit = isikukood.charAt(4);
        int secondMonth = Character.getNumericValue(fifthDigit);
        
        String month = "" + firstMonth + secondMonth;
        
        if (month.equals("01")) {
            month = "января";
        } else if (month.equals("02")) {
            month = "февраля";
        } else if (month.equals("03")) {
            month = "марта";
        } else if (month.equals("04")) {
            month = "апреля";
        } else if (month.equals("05")) {
            month = "мая";
        } else if (month.equals("06")) {
            month = "июня";
        } else if (month.equals("07")) {
            month = "июля";
        } else if (month.equals("08")) {
            month = "августа";
        } else if (month.equals("09")) {
            month = "сентября";
        } else if (month.equals("10")) {
            month = "октября";
        } else if (month.equals("11")) {
            month = "ноября";
        } else if (month.equals("12")) {
            month = "декабря";
        }
        
        char sixthDigit = isikukood.charAt(5);
        int firstDay = Character.getNumericValue(sixthDigit);
        
        char seventhDigit = isikukood.charAt(6);
        int secondDay = Character.getNumericValue(seventhDigit);
        
        String day = "" + firstDay + secondDay;
        
        System.out.println(name + " " + surName + " родился " + day + " " + month + " " + dateOfBirth + " года");
    }
}