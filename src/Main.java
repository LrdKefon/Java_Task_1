public class Main {

    public static void main(String[] args) {

        int cost = 15270; //стоимость билета
        int x = 20;       // 1 миля за каждые 20 рублей
        int bonus = cost / x;

        System.out.println("Your accrued bonus miles:" + bonus);
    }

}
