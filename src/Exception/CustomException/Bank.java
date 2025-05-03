package Exception.CustomException;

public class Bank {
    private String Currency;
    private Integer Amount;

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Bank(String currency, Integer Amnt) {
        this.Currency = currency;
        this.Amount = Amnt;
    }

    public Integer Add(Bank BankName) {

        if (!BankName.Currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("Currency Not matching");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            return BankName.Amount + this.Amount;
        }

}

