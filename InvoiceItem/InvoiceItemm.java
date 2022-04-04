package InvoiceItem;

public class InvoiceItemm {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItemm(){
        id = "Ca chua";
        desc = "20";
        qty = 5;
        unitPrice = 5000 ;
    }
    public InvoiceItemm(String I, String D, int Q, Double U){
        id = I;
        desc = D;
        qty = Q;
        unitPrice = U;
    }

    public  InvoiceItemm(String I){
        id = I;
        desc = "13";
        qty = 6;
        unitPrice = 2000;
    }

    public String getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public String getDesc() {
        return desc;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
}
