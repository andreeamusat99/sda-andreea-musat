package proiect2.bill;

public enum CurencyType {
    EUR0("Euro"),
    RON("Lei"),
    USD("Dolar");

    private String prettyName;

    CurencyType(String prettyName){
        this.prettyName = prettyName;
    }
    @Override
    public String toString(){
        return prettyName;
    }
}
