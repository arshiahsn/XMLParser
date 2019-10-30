public class Motorcyle {
    private int price;
    private int emission;
    private int topSpeed;

    public Motorcyle(int price, int emission, int topSpeed) {
        this.price = price;
        this.emission = emission;
        this.topSpeed = topSpeed;
    }

    public Motorcyle() {
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

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("=======================\n");
        str.append("Motorcyle\n");
        str.append(getTopSpeed()+"\n");
        str.append(getEmission()+"\n");
        str.append(getPrice()+"\n");



        return str.toString();
    }
}
