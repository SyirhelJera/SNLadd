package Exercise3.tiles.snake;

public class Regular extends Snake implements SnakeActions {
    public void whip(){};

    @Override
    public void attackPlayer() {
        whip();
    }


}
