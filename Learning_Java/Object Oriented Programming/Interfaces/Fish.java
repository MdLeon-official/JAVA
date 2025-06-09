public class Fish implements Prey, Predator{
    @Override
    public void flee() {
        System.out.println("The small fishes are swimming away.");
    }

    @Override
    public void hunt() {
        System.out.println("Big fishes are hunting.");
    }
}
