
public class Receipt {
    private String name;
    private String store;
    private String date;
    private ReceiptType type;
    private float price;
    private int id;
    private static int counter = 0;

    public Receipt(String name, String store,  String date, ReceiptType type, float price) {
        this.name = name;
        this.store = store;
        this.date = date;
        this.type = type;
        this.price = price;
        id = counter;
        counter++;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getStore() {
        return store;
    }


    public void setStore(String store) {
        this.store = store;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public ReceiptType getType() {
        return type;
    }


    public void setType(ReceiptType type) {
        this.type = type;
    }


    public float getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }


    public int getId() {
        return id;
    }

}
