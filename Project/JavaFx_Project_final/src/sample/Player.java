package sample;

 public class Player {
    private String name;
    private String country;
    private int age;
    private double height;
    private String club;
    private String position;
    private int number;
    private double weekly_salary;

    public Player(String name,String country,int age,double height,String club,String position,int number,double weekly_salary){
        this.name=name;
        this.country=country;
        this.age=age;
        this.height=height;
        this.club=club;
        this.position=position;
        this.number=number;
        this.weekly_salary=weekly_salary;
    }

     public Player() {

     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     public String getCountry() {
         return country;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public double getHeight() {
         return height;
     }

     public void setClub(String club) {
         this.club = club;
     }

     public String getClub() {
         return club;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public String getPosition() {
         return position;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public int getNumber() {
         return number;
     }

     public void setWeekly_salary(double weekly_salary) {
         this.weekly_salary = weekly_salary;
     }

     public double getWeekly_salary() {
         return weekly_salary;
     }

     public void show(){
         System.out.println(name+","+country+","+age+","+height+","+club+","+position+","+number+","+weekly_salary);
     }
 }
