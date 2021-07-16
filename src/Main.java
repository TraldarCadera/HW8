import Obstacles.Obstacle; //Пустышка
import Obstacles.Treadmill;
import Obstacles.Wall;
import Participants.Cat;
import Participants.Human;
import Participants.Robot;
import Participants.RunAndJump;


public class Main {
    public static void main(String[] args) {

        RunAndJump[] runAndJumps = {
                new Human("Олег"),
                new Cat("Барсик"),
                new Robot("Терминатор")
        };


        Obstacle[] obstacles = {
                new Wall(3),
                new Treadmill(150)
        };


        for (int i = 0; i < runAndJumps.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (!runAndJumps[i].run(obstacles[1])) {
                    break;
                }
                if (!runAndJumps[i].jump(obstacles[0])) {
                    break;
                }
            }
        }
    }
}


