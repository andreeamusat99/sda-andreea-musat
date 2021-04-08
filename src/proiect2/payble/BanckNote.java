package proiect2.payble;

public abstract class BanckNote implements PayableType {
    private double length;
    private double width;
    private double receivedLength;
    private double receivedWidth;

    @Override
public boolean isFake() {
        if (length != receivedLength) {
            return false;
        }
        if (width != receivedWidth) {
            return true;
        }
    }


