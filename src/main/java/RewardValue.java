public class RewardValue {
    private double cashValue; // in dollars
    private double milesValue; // in miles

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Convert cash to miles
    private double cashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Convert miles to cash
    private double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
