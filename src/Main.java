//import java.util.Scanner;

public class Main {
    1111111

//    1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
//    2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
//    пока не будет дана команда на выход из цикла
//    3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
//    арифметическое значение
//    4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
//  5**) Создать метод, который будет применять строку и выводить из нее только гласные буквы

    public static void main(String[] args) {
        //TASK 1
//        int[] arr = new int[10]; // Создаем массив
//        for (int i = 0; i < arr.length; i++) {      // Присваиваем значения элементам массива
//            arr[i] = i;                      // Присваиваем каждому элементу значение счетчика
//            System.out.print(arr[i] + " ");
//
//        }
//        System.out.println();
//        double[] newArr = new double[20];
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[i] = i;
//            System.out.print(newArr[i]);
//        }


        // TASK 2
//        Scanner scanner = new Scanner(System.in);
//        char x;
//        char e;
//        for (;;){
//            System.out.println("Введите первое число: ");
//            int num1 = scanner.nextInt();
//            System.out.println("Введите второе число: ");
//            int num2 = scanner.nextInt();
//            System.out.println("Выберите операцию: " +
//                    "\n a - сложить " +
//                    "\n b - вычесть");
//            x = scanner.next().charAt(0);
//
//            if(x == 'a'){
//                int sum = num1 + num2;
//                System.out.println("Результат сложения: " + sum);
//            }else{
//                int dif = num1 - num2;
//                System.out.println("Результат вычетания: " + dif);
//            }
//            System.out.println("Хотите продолжить? " +
//                    "\n Нажмите: " + "c" +
//                    "\n Завершить: " + "e");
//            e = scanner.next().charAt(0);
//            if (e == 'e'){
//                break;
//            }
//
//        }
// task 3 -- START
//        public static void kratn_trem(int[] argum) {
//            int[] arr = new int[13];
//            for (int i = 0; i < argum.length; i++) {
//                if (argum[i] % 3 == 0 && argum[i] != 0) {
//                    arr[i] += argum[i];
//                    System.out.println(arr[i]);
//                }
//            }
//            sredn(Arrays.toString(arr));
//        }
//
//        public static void sredn(String str) {
//            String[] strArray = null;
//            for (int i = 0; i < str.length(); i++) {
//
//                str = str.replace("0,", "");
//                str = str.replace("0", "");
//                str = str.replace(" ", "");
//                str = str.replace("[", "");
//                str = str.replace("]", "");
//                strArray = str.split(",");
//            }
//            double sredn = 0;
//            for (int i = 0; i < strArray.length; i++) {
//                sredn += Integer.parseInt(strArray[i]);
//            }
//            sredn = sredn / strArray.length;
//            System.out.println(sredn);
//        }
//        // task3 -- END
//
//        // task 4 -- START
//        public static void reverseArr(int[] arg) {
//            for (int i = arg.length - 1; i >= 0; i--) {
//                if (i % 2 != 0) {
//                    System.out.println("key: " + i + " ------ value: " + arg[i]);
//                }
//            }
//        }

    }

}