package Participants;

import Obstacles.Obstacle;

public class Robot implements RunAndJump{

    private String name;
    private int runDistant = 300;
    private int jumpHeight = 5;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Obstacle obstacle) {
        if (obstacle.getObstacle() <= jumpHeight) {
            System.out.printf("Робот %s успешно перепрыгнул препятствие\n", name);
            return true;
        } System.out.printf("Робот %s не смог перепрыгнуть препятствие\n", name);
        return false;
    }

    @Override
    public boolean run(Obstacle obstacle) {
        if (obstacle.getObstacle() <= runDistant) {
            System.out.printf("Робот %s успешно пробежал дистанцию.\n", name);
            return true;
        } System.out.printf("Робот %s не смог пробежать дистанцию\n", name);
        return false;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", runDistant=" + runDistant +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}
