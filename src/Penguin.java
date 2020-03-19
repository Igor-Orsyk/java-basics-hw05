public class Penguin extends NonFlyingBird{

    public void checkWings(){
        System.out.println("Very small wings");
    }

    @Override
    public String toString(){
        return "Penguin";}
}
