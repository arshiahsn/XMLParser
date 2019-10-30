public class Car {
    private int topSpeed;
    private int price;
    private int emission;
    private String transmission;

    public Car(int topSpeed, int price, int emission, String transmission) {
        this.topSpeed = topSpeed;
        this.price = price;
        this.emission = emission;
        this.transmission = transmission;
    }
    public Car() {
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEmission() {
        return emission;
    }

    public void setEmission(int emission) {
        this.emission = emission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("=======================\n");
        str.append("Car\n");
        str.append(getTopSpeed()+"\n");
        str.append(getEmission()+"\n");
        str.append(getPrice()+"\n");
        str.append(getTransmission()+"\n");



        return str.toString();
    }
}
