public class SampleMethod01a {
    public static void main(String[] args) {
        int price1 = 1200;
        int total1 = (int) (price1 + price1 * 0.1);
        System.out.println("税込価格 : " + total1 + "円");
        int price2 = 1000;
        int total2 = (int) (price2 + price2 * 0.1);
        System.out.println("税込価格 : " + total2 + "円");
    }
}