public class Main {

    public static void main(String[] args) {

        int cost = 18369; //стоимость билета
        int mile = 20;       // 1 миля за каждые 20 рублей
        int bonus = cost / mile;

        System.out.println("Your accrued bonus miles:" + bonus);
    }

}
