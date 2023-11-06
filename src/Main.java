import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        taskPart1();


    }

    public static void taskPart1() {
        // "Задание 1"

        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = new double[]{1.57, 7.654, 9.986};
        char[] thirdArray = new char[]{'a', 'b', 'c'};

        System.out.println("Задание 2");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);

            if (i != firstArray.length - 1) {
                System.out.print(",");
            }

    }
        System.out.println();


        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);

            if (i != secondArray.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);

            if (i != thirdArray.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("Задание 3");

            for (int i = firstArray. length -1; i>=0; i--) {
                System.out.println(firstArray[i]);

                if (i != 0) {
                    System.out.print(",");
                }
            }
        System.out.println();

            for (int i = secondArray. length -1; i>=0; i--) {
                System.out.println( secondArray [i]);

                if (i != 0) {
                    System.out.print(",");
                }
            }

        System.out.println();

            for (int i = thirdArray. length -1; i>=0; i--) {
                System.out.println(thirdArray[i]);

                if (i != 0) {
                    System.out.println(",");
                }
            }
            System.out.println("Задание 4");

        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] % 2 != 0) {
                thirdArray [i] ++;
                System.out.print(Arrays.toString(thirdArray));
            }
        }
        }
    }







