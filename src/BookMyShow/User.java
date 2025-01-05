package BookMyShow;

public class User {

    Integer userId;

    String userName;

    City city;

    public User(Integer userId, String userName, City city) {
        this.userId = userId;
        this.userName = userName;
        this.city = city;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
