package proiect2.bill;

public class Bill {
    private final String serialNumber;
    private final double amount;
    private final CurencyType currency;
//cu final nu le mai poate modifica nimeni
    public Bill(String serialNumber, double amount, CurencyType currency) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.currency = currency;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getAmount() {
        return amount;
    }

    public CurencyType getCurrency() {
        return currency;
    }
}
