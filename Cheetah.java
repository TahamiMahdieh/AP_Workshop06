public class Cheetah extends Mammal implements Hunter{
    private String info;
    public Cheetah(String name, int age, String info, int maxRunningSpeed) {
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

    @Override
    public void hunt(Prey prey) {
        System.out.println(this.name + " hunted " + prey.getName());
    }
}
