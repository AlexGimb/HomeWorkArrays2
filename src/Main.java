public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int [] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int [] rand = new int [30];
        for (int i = 0; i < rand.length; i++) {
            rand [i] = random.nextInt(100_000) + 100_000;
        }
        return rand;
    }
    public static void task1 (){
        System.out.println("Задание 1");
        int[] rand = generateRandomArray();
        int sum = 0;
        for (int element : rand){
            sum += element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n",sum);
    }
    public static void task2 () {
        System.out.println("Задание 2");
        int [] rand = generateRandomArray();
        int max = rand[0];
        int min = rand[0];
        for (final int current : rand) {
            if (current > max ){
                max = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей\n", max);
        for (final int current : rand){
            if (current < min){
                min = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей\n", min);
    }
    public static void task3 (){
        System.out.println("Задание 3");
        int[] rand = generateRandomArray();
        int sum = 0;
        for (int element : rand) {
            sum += element;
        }
        sum = sum / 30;
        System.out.printf("Средняя сумма трат за месяц составила %d рублей\n",sum);
    }
    public static void task4 (){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}