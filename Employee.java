public class Employee {
    private String firstName;
    private String lastName;
    private String nickName;
    private String perk;
    private double salary;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPerk() {
        return perk;
    }

    public void setPerk(String perk) {
        this.perk = perk;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateTaxedSalary(double salary_){
        this.salary = salary_*0.9;
    }


}
