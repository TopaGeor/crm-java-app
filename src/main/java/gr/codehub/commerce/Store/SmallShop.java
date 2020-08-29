package gr.codehub.commerce.Store;

public class SmallShop extends Store{
    private String owner;

    public SmallShop(String owner) {
        this.owner = owner;
    }

    public SmallShop(String title, String address, String owner) {
        super(title, address);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return super.toString()+"SmallShop{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
