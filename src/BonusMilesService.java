public class BonusMilesService {
    public int calculate(int price) {
        int moneyForOneBonusMile = 20;
        int miles = price / moneyForOneBonusMile;
        return miles;
    }
}
