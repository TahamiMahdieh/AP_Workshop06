public class Giraffe extends Mammal implements Prey{
    private String info ;
    public Giraffe(String name, int age, String info, int maxRunningSpeed) {
        this.name = name;
        this.age = age;
        this.info = info;
        this.maxRunningSpeed = maxRunningSpeed;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public void show (){
        System.out.println("name: " + name + ", age: " + age + ", speed : " + maxRunningSpeed + ", " + info);
    }
}
