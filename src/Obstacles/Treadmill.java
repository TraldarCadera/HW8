package Obstacles;

public class Treadmill implements Obstacle{

    private int distant;

    public Treadmill(int distant) {
        this.distant = distant;
    }

    public int getDistant() {
        return distant;
    }

    @Override
    public int getObstacle() {
        return distant;
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "distant=" + distant +
                '}';
    }
}
