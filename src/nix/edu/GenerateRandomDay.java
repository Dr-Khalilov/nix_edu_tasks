package nix.edu;

public class GenerateRandomDay {
    //10.Напишите генератор случайных чисел (от 1 до 7), выведите день недели соответствующий числу
    static String getRandomDayOfWeek() {
        byte randomNumber = (byte) (Math.random() * (8 - 1) + 1);
        switch (randomNumber) {
            case 1:
                return "1 - Monday";
            case 2:
                return "2 - Tuesday";
            case 3:
                return "3 - Wednesday";
            case 4:
                return "4 - Thursday";
            case 5:
                return "5 - Friday";
            case 6:
                return "6 - Saturday";
            case 7:
                return "7 - Sunday";
            default:
                return
                        "Unknown";
        }
    }
}
