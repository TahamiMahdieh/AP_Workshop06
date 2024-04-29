public class Eagle extends Bird implements Hunter{
    private String info;
    public Eagle(String name, int age, String info, int flightHeight) {
        this.name = name;
        this.age = age;
        this.info = info;
        this.flightHeight = flightHeight;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", high of fly : " + flightHeight + ", " + info);
    }
}
