package Participants;

import Obstacles.Obstacle; //Пустышка
import Obstacles.Treadmill;
import Obstacles.Wall;

public interface RunAndJump {

    boolean jump(Wall wall);

    boolean run(Treadmill treadmill);


}
