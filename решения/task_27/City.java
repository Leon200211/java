package task_27;

public class City {
    String city;
    String country;

    public City(String ci, String co)
    {
        this.city = ci;
        this.country = co;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String ci) {
        this.city = ci;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String co) {
        this.country = co;
    }
}