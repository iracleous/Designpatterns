package gr.codehub.designpatterns.factory;

public class Customer extends Person{
    private String storeLocation;

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }
}
