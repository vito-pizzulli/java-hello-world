public class Challenge {
    public static void main(String[] args) {
        double firstValue = 20d;
        double secondValue = 80d;
        double valuesTotal = (firstValue + secondValue) * 100;
        double remainder = valuesTotal % 40d;
        boolean isNoRemainder = remainder == 0.00 ? true : false;
        System.out.println("remainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
