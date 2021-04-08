package proiect2.payble;

import proiect2.bill.CurencyType;

public interface PayableType {

    double getValue();

    CurencyType getCurency();

    boolean isFake();
}
