package gr.codehub.commerce.Store;

public class BigStore extends Store{

    private String manager;

    public BigStore(String manager) {
        this.manager = manager;
    }

    public BigStore(String title, String address, String manager) {
        super(title, address);
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return super.toString()+"BigStore{" +
                "manager='" + manager + '\'' +
                '}';
    }
}
