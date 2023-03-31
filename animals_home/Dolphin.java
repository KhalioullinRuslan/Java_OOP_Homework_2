public class Dolphin extends Mammal implements Floating{
    public Dolphin(String name, int speed) {
        super(name);
    }
 
    @Override
    public String speak() {
        return "КИКИКИ";
    }

    @Override
    public int swimmingspeed() {
        return 80;
    }
}