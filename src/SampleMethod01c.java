public class SampleMethod01c {
    public static void main(String[] args) {
        int price1 = 1200;
        int total1 = calcTaxedPrice(price1);
        showTaxedPrice(total1);

        int price2 = 1000;
        int total2 = calcTaxedPrice(price2);
        showTaxedPrice(total2);
    }

    private static void showTaxedPrice(int total) {
        System.out.println("税込価格 : " + total + "円");
    }

    // 税込価格を計算するメソッド
    private static int calcTaxedPrice(int price) {
        int total = (int) (price + price * 0.1);
        return total;
    }
}
