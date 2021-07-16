package Participants;

import Obstacles.Obstacle;

public class Human implements RunAndJump {

    private String name;
    private int runDistant = 150;
    private int jumpHeight = 2;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Obstacle obstacle) {
        if (obstacle.getObstacle() < jumpHeight) {
            System.out.printf("Человек %s успешно перепрыгнул препятствие\n", name);
            return true;
        }
        System.out.printf("Человек %s не смог перепрыгнуть препятствие\n", name);
        return false;
    }

    @Override
    public boolean run(Obstacle obstacle) {
        if (obstacle.getObstacle() < runDistant) {
            System.out.printf("Человек %s успешно пробежал дистанцию.\n", name);
            return true;
        }
        System.out.printf("Человек %s не смог пробежать дистанцию\n", name);
        return false;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", runDistant=" + runDistant +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}


