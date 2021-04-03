package nix.edu;

public class FloydTriangle {
    //11.Создайте программу, которая будет выводить числа последовательно в виде треугольника (floyd triangle).
    // Число должно приходить в аргументах.
    static void getFloydTriangle(int number) {
        int drawingTriangle = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(drawingTriangle++ + " ");
            }
            System.out.println();
        }
    }
}
