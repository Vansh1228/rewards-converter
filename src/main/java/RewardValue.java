public class RewardValue {
    double cash;
    int miles;

    RewardValue(double cash){
        this.cash = cash;
    }

    RewardValue(int miles){
        this.miles = miles;
    }

   public int getMilesValue(){
       return miles = (int)(0.0035*cash);
    }

    public double getCashValue(){
       return cash;
    }


}
