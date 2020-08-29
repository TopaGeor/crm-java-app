package gr.codehub.commerce.Store;


import java.util.Objects;

public abstract class Store {
    private String title;
    private String address;

    public Store() {
    }

    public Store(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Store{" +
                "title='" + title + "'" +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(title, store.title) &&
                Objects.equals(address, store.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, address);
    }

    public void doWork(){

    }


//    public static void main(String[] args) {
//
//        int []a = new int [10];
//        System.out.println(a);
//
//
//        Store a1 = new Store ("A", "Athinas 32");
//        Store a2 = new Store ("A", "Athinas 32");
//
//        System.out.println(a1);
//        System.out.println(a2);
//
//        if (a1.hashCode() == a2.hashCode()) System.out.println("The stores have same hashcode");
//        else
//            System.out.println("The stores DO NOT have same hashcode");
//
//
//
//        if (a1 == a2) System.out.println("The stores are equal");
//        else
//            System.out.println("The stores NOT are equal");
//
//        if (a1.equals(a2)) System.out.println("The stores are equivalent");
//        else
//            System.out.println("The stores NOT are equivalent");
//    }

}
