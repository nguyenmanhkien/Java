package InvoiceItem;

public class Test_InvoiceItem {
    public static void main(String[] args){
        InvoiceItemm I1 = new InvoiceItemm();
        System.out.println("Id: " + I1.getId());
        System.out.println("Desc: " + I1.getDesc());
        System.out.println("Qty: " + I1.getQty());
        System.out.println("UnitPrice: " + I1.getUnitPrice());
        System.out.println("Total: "+ I1.getTotal());

        InvoiceItemm I2 = new InvoiceItemm("Tao");
        System.out.println("Id: " + I2.getId());
        System.out.println("Desc: " + I2.getDesc());
        System.out.println("Qty: " + I2.getQty());
        System.out.println("UnitPrice: " + I2.getUnitPrice());
        System.out.println("Total: "+ I2.getTotal());
    }
}
