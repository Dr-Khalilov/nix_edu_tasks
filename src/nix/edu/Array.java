package nix.edu;

public class Array {
    public static void main(String[] args) {
//5. Создайте массив чисел и выведите этот массив на экран
        //1 - Variant
        byte[][] matrix = new byte[10][10];
        byte resSum = 0;
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += resSum++;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        //2 - Variant
        int[] someNumbers = {1, 2, 3, 4, 7, 15};
        for (int num : someNumbers) {
            System.out.print(num + "\t");
        }
    }
}
