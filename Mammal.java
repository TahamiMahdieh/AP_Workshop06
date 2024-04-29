public abstract class Mammal extends Animal {
    protected int maxRunningSpeed;

    public Mammal(String name, int age, String info, int maxRunningSpeed) {
        super();
    }

    public int getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(int maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }
}
