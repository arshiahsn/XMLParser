public class Bike {
    private int speeds;
    private int price;
    private String suspension;

    public Bike(int speeds, int price, String suspension) {
        this.speeds = speeds;
        this.price = price;
        this.suspension = suspension;
    }

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public Bike() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("=======================\n");
        str.append("Bike\n");
        str.append(getSpeeds()+"\n");
        str.append(getSuspension()+"\n");
        str.append(getPrice()+"\n");


        return str.toString();
    }
}
