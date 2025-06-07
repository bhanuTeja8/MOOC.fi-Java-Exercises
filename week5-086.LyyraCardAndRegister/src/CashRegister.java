
public class CashRegister {
    private final double priceEconomical=2.50;
    private final double priceGourmet=4.00;
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister=1000;
        this.economicalSold=0;
        this.gourmetSold=0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=priceEconomical){
            this.cashInRegister+=priceEconomical;
            this.economicalSold++;
            return cashGiven-priceEconomical;
        }
        else
            return cashGiven;
     }

    public double payGourmet(double cashGiven) {
        if(cashGiven>=priceGourmet){
            this.cashInRegister+=priceGourmet;
            this.gourmetSold++;
            return cashGiven-priceGourmet;
        }
        else
            return cashGiven;
       }

    public boolean payEconomical(LyyraCard card){
        if(card.balance()>=priceEconomical){
            card.pay(priceEconomical);
            economicalSold++;
            return true;
        }
        else
            return false;
    }

    public boolean payGourmet(LyyraCard card){
        if(priceGourmet<=card.balance()){
            card.pay(priceGourmet);
            gourmetSold++;
            return true;
        }
        else
            return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum>0){
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
    }

    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}