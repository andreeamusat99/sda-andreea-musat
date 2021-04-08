package proiect2.bill;

import proiect2.payble.PayableType;

public class Payment {
    private  double amountCollected; //ii fac doar getter sa nu fie modificabil din exterior
    private Bill bill;
    private PayableType[] payableCollected;
    private int currentPosition = 0; //initializam cu 0 ( un int are val 0) pt ca este ft reprezentatatiz; defaultul e 0;
    public Payment(double amountCollected, Bill bill) {
        this.amountCollected = amountCollected;
        this.bill = bill;
        this.payableCollected = new PayableType[20];


    }

    public double getAmountCollected() {
        return amountCollected;
    }
    public boolean isBillPaid(){
        if(amountCollected == bill.getAmount()){
            return true;
        }
        return false;
    }
    public void addPayable (PayableType payable){
        if (payable.isFake()){
            System.out.println("Invalid payable!");
        } else {
            amountCollected += payable.getValue();
        }
    }
}
