import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = new double[]{1.57, 7.654, 9.986};
        char[] thirdArray = new char[]{'a', 'b', 'c'};


    }


    public static void task2() {
        int[] firstArray = new int[0];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);

            if (i != firstArray.length - 1) {
                System.out.println(",");
            }
        }
        System.out.println();
        int[] secondArray = new int[0];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);

            if (i != secondArray.length - 1) {
                System.out.println(",");
            }
        }

        System.out.println();
        int[] thirdArray = new int[0];
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.println(thirdArray[i]);

            if (i != thirdArray.length - 1) {
                System.out.println(",");
            }
        }
    }


        public static void task3() {
            int[] firstArray = new int[0];
            for (int i = firstArray. length -1; i>=0; i--) {
                System.out.println(firstArray[i]);

                if (i != 0) {
                    System.out.println(",");
                }
            }
            System.out.println();
            int[] secondArray = new int[0];
            for (int i = secondArray. length -1; i>=0; i--) {
                System.out.println( secondArray [i]);

                if (i != 0) {
                    System.out.println(",");
                }
            }

            System.out.println();
            int[] thirdArray = new int[0];
            for (int i = thirdArray. length -1; i>=0; i--) {
                System.out.println(thirdArray[i]);

                if (i != 0) {
                    System.out.println(",");
                }
            }
            System.out.println();
    }



    public static void task4() {
        int[] arr = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr [i] ++;
            }
        }
        }
    }







