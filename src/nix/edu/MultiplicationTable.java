package nix.edu;

public class MultiplicationTable {
    //8. Создайте программу, которая выведет на экран таблицу умножения
    static void createMultiplicationTable(int upperLimit) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= upperLimit; j++) {
                System.out.printf("%2d x %-1d = %-3d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
