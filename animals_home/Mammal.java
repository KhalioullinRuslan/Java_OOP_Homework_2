public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String feed (){
        return "Рыба";
    }

}
