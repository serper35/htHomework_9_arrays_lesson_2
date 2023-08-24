import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int totalMoney = 0;

        for (int i = 0; i < arr.length; i++) {
            totalMoney += arr[i];
        }
        System.out.println("Задача №1\n" + "Сумма трат за месяц составила " + totalMoney + " рублей.");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("\nЗадача №2");
        //Первый способ
        int max = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Первый способ\n" + "Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
// Второй способ
        Arrays.sort(arr);
        System.out.println("Второй способ\n" + "Минимальная сумма трат за день составила " + arr[0] + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + arr[29] + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        double totalMoney = 0;
        for (int j : arr) {
            totalMoney += j;
        }
        double averageSpends = totalMoney / arr.length;
        System.out.println("\nЗадача №3\nСредняя сумма трат за месяц составила " + averageSpends + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char swap;
        System.out.println("\nЗадача №4");
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            swap = reverseFullName[reverseFullName.length - i -1];
            reverseFullName[reverseFullName.length - i -1]= reverseFullName[i];
            reverseFullName[i] = swap;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}