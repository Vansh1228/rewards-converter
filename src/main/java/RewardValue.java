public class RewardValue {
    double cash;
    int miles;
      public static final double exchangeRate = 0.0035;

    RewardValue(double cash){

        this.cash = cash;
    }

    RewardValue(int miles){

        this.miles = miles;
    }


    int convertCashValueToMiles(double cashVal){
        miles = (int)(cashVal/exchangeRate);
        return miles;
    }

    double convertMilesValueToCash(int miles){
        cash = miles*exchangeRate;
    return cash;
    }

   public int getMilesValue(){
//        return miles;
      return convertCashValueToMiles(cash);

    }

    public double getCashValue(){
//        return cash;
        return convertMilesValueToCash(miles);
    }


}
