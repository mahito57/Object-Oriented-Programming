package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ChangedPlayer {
    private final SimpleStringProperty name;
    private final SimpleStringProperty country;
    private final SimpleStringProperty club;
    private final SimpleStringProperty position;

    private final SimpleIntegerProperty age;
    private final SimpleIntegerProperty number;

    private final SimpleDoubleProperty height;
    private final SimpleDoubleProperty weeklySalary;

    public ChangedPlayer(Player player) {
        name = new SimpleStringProperty(player.getName());
        country = new SimpleStringProperty(player.getCountry());
        club = new SimpleStringProperty(player.getClub());
        position = new SimpleStringProperty(player.getPosition());
        age = new SimpleIntegerProperty(player.getAge());
        number = new SimpleIntegerProperty(player.getNumber());
        height = new SimpleDoubleProperty(player.getHeight());
        weeklySalary = new SimpleDoubleProperty(player.getWeekly_salary());
    }
    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getCountry() {
        return country.get();
    }

    public SimpleStringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getClub() {
        return club.get();
    }

    public SimpleStringProperty clubProperty() {
        return club;
    }

    public void setClub(String club) {
        this.club.set(club);
    }

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public int getAge() {
        return age.get();
    }

    public SimpleIntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public int getNumber() {
        return number.get();
    }

    public SimpleIntegerProperty numberProperty() {
        return number;
    }

    public void setNumber(int number) {
        this.number.set(number);
    }

    public double getHeight() {
        return height.get();
    }

    public SimpleDoubleProperty heightProperty() {
        return height;
    }

    public void setHeight(double height) {
        this.height.set(height);
    }

    public double getWeeklySalary() {
        return weeklySalary.get();
    }

    public SimpleDoubleProperty weeklySalaryProperty() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary.set(weeklySalary);
    }

    public void show(){
        System.out.println(name+","+country+","+age+","+height+","+club+","+position+","+number+","+weeklySalary);
    }
}
