package Exercise3.tiles.snake;

public class Venomous extends Snake implements SnakeActions{
    public void Poison(){};

    @Override
    public void attackPlayer() {
        Poison();
    }
}
