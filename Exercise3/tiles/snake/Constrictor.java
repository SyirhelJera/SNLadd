package Exercise3.tiles.snake;

public class Constrictor extends Snake implements SnakeActions{
    public void Coil(){};

    @Override
    public void attackPlayer() {
        Coil();
    }
}
