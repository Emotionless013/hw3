public class Main {
    public static void main(String[] args) {
        //первая задача
        int clientOS = 0;
        if (clientOS >= 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //вторая задача
        int clientDeviceYear = 2012;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS >= 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //третья задача
        int year = 2100;
        if (((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " - это високосный год");
        } else {
            System.out.println(year + " - это НЕ високосный год");
        }
        //четвертая задача
        int deliveryDistance = 43;
        int deliveryDay = 1;
        if (deliveryDistance >= 20) {
            deliveryDay = deliveryDay + 1;
        }
        if (deliveryDistance >= 60) {
            deliveryDay = deliveryDay + 1;
        }
        System.out.println("Потребуется дней: " + deliveryDay);
        //пятая задача
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("на дворе зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("на дворе весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("на дворе лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("на дворе осень");
                break;
            default:
                System.out.println("Такого месяца не существует");}
                //шестая задача
                int age = 19;
                int salary = 58_000;
                if (age<23){
                    if (salary<50_000) {
                        double credit = salary*2;
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");}
                    if ((salary>=50_000)&&(salary<80_000)) {
                        double credit= salary*2*1.2;
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");}
                    if (salary>=80_000) {
                        double credit = salary*2*1.5;
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");}}
                else {
                    if (salary<50_000) {
                        double credit = salary*3;
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");}
                    if ((salary>=50_000)&&(salary<80_000)) {
                        double credit= salary*3*1.2;
                        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");}
                    if (salary>=80_000) {
                        double credit = salary*3*1.5;
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");}}
                //седьмая задача
                int vozrast = 25;
                int zarplata = 60_000;
                int wantedSum = 330_000;
                int srok = 12;
                double stavka = 10;
                if (vozrast<23) {
                    stavka = stavka +1;}
                else if (vozrast<30) {
                    stavka = stavka +0.7;}
                if (zarplata>80_000) {
                    stavka = stavka - 0.7;}
                double stavkaMesyac = stavka/100/12;
                double platezh = wantedSum*(stavkaMesyac + stavkaMesyac/(Math.pow(1+stavkaMesyac,srok)-1));
                double platezhMax = zarplata*0.5;
                if (platezhMax>platezh) {
        System.out.println("Максимальный платеж при ЗП " + zarplata + " равен " + platezhMax + " рублей. Платеж по кредиту " + platezh + " рублей. Одобрено.");}
                else {
                    System.out.println("Максимальный платеж при ЗП " + zarplata + " равен " + platezhMax + " рублей. Платеж по кредиту " + platezh + " рублей. Отказано.");}
                }
    }



