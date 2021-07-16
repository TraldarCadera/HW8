package Participants;

import Obstacles.Obstacle;
import Obstacles.Treadmill;
import Obstacles.Wall;

public class Cat implements RunAndJump {

    private String name;
    private int runDistant = 200;
    private int jumpHeight = 3;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() < jumpHeight) {
            System.out.printf("Кот %s успешно перепрыгнул препятствие\n", name);
            return true;
        } System.out.printf("Кот %s не смог перепрыгнуть препятствие\n", name);
        return false;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getDistant() < runDistant) {
            System.out.printf("Кот %s успешно пробежал дистанцию.\n", name);
            return true;
        } System.out.printf("Кот %s не смог пробежать дистанцию\n", name);
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runDistant=" + runDistant +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}
