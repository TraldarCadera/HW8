import Obstacles.Obstacle; //Пустышка
import Obstacles.Treadmill;
import Obstacles.Wall;
import Participants.Cat;
import Participants.Human;
import Participants.Robot;
import Participants.RunAndJump;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RunAndJump[] runAndJumps = {
                new Human("Олег"),
                new Cat("Барсик"),
                new Robot("Терминатор")
        };

        //Выводим информацию о участниках
        for (int i = 0; i < runAndJumps.length; i++) {
            System.out.println(runAndJumps[i]);
        }

        System.out.println("Задайте высоту стены:");
        // Не стал препятствия объединять в массив, почему то все ломается
        Wall wall = new Wall(sc.nextInt()); // Задаем высоту стены сканером
        System.out.println("Задайте длинну беговой дорожки:");
        Treadmill treadmill = new Treadmill(sc.nextInt()); // Задаем длинну беговой дорожки сканером


        for (int i = 0; i < runAndJumps.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (!runAndJumps[i].run(treadmill)) {
                    break;
                }
                if (!runAndJumps[i].jump(wall)) {
                    break;
                }
            }
        }
    }
}

