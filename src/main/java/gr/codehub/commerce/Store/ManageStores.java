package gr.codehub.commerce.Store;

import java.util.ArrayList;

public class ManageStores {


    public static void main(String[] args) {
        int x;
        ArrayList<Store> chainStore = new ArrayList<>();

     //   chainStore.add(new Store());
        chainStore.add(new BigStore("Dimitris"));
        chainStore.add(new SmallShop("Katerina"));

        for(Store store: chainStore)
            System.out.println(store.toString());

    }
}
