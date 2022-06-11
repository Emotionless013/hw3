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
                System.out.println("Такого месяца не существует");
        }
    }
}


