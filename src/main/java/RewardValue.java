public class RewardValue {
    private final double cashValue; // dollars
//    private double milesValue; // miles
    public static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
//        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
//        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Convert cash to miles
    private static int cashToMiles(double cashValue) {
        return (int)(cashValue / MILES_TO_CASH_RATE);  // This should convert dollars to miles
    }

    // Convert miles to cash
    private static double milesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE; // This should convert miles to dollars
    }

    public double getCashValue() {
        return cashValue;
    }

//    public double getMilesValue() {
    public int getMilesValue() {
        return cashToMiles(this.cashValue);
    }
}

