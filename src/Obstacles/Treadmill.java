package Obstacles;

public class Treadmill implements Obstacle{

    private int distant;

    public Treadmill(int distant) {
        this.distant = distant;
    }

    public int getDistant() {
        return distant;
    }
}
