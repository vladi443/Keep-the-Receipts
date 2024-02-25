import java.util.ArrayList;

public class ReceiptManager {
    private ArrayList<Receipt> receipts;
    private String profile;
    
    public ReceiptManager(String profile) {
        this.profile = profile;
    }
    
    public ReceiptManager() {
        this.profile = "guest";
    }
    
    public void createReceipt (String name, String store,  String date, ReceiptType type, float price) {
        Receipt receipt = new Receipt(name, store, date, type, price);
        
        this.addReceipt(receipt);
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    private void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }
}
