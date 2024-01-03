public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quality;
    private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quality, int pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quality = (quality > 0) ? quality : 0;
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0;
    }
    public int getInvoiceAmount(){
        return quality * pricePerItem;
    }
    public static void main(String[] area){
        Invoice myInvoice = new Invoice("001", "Widget", 5, 10);
        System.out.println("Invoice Amount: $" + myInvoice.getInvoiceAmount());
    }
}