public class Main {
    public static void main(String[] args) {

        //Задание №1
        int clientOs = 0;//iOS=0 android=1
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание №2
        int clientOs1 = 1;//iOS=1  android=0
        int clientDeviceYear = 2015;

        if (clientOs1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для андроид по ссылке");
        } else if (clientOs1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для андроид по ссылке");
        }
        if (clientOs1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Задание №3
        int year = 1988;
        int beginning = 1584;
        if (year < beginning) {
            System.out.println("тогда ещё не учитывались високосные года");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год " + year + " високосный");
        } else {
            System.out.println("год " + year + " не високосный");
        }

        //Задание №4
        int deliveryDistance = 80;
        int day ;

        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
        }

        if (deliveryDistance < 20) {
            day = 1;
            System.out.println("потребуется " + day + " дней доставки");
        }

        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day = 2;
            System.out.println("потребуется  " + day + " дня доставки");
        }


        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day = 3;
            System.out.println("потребуется  " + day + " дня доставки");
        }


        // Задание №5
        int monthNumber = 17;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("это осенний месяц");
                break;
            default:
                System.out.println("введён некорректный номер");



        }
    }
}






