package lesson.checkwork;

public class Armstrong {

    public void arm() {
        int y = 0, x, tempNumber;

        int qurentNumber = 371;

        tempNumber = qurentNumber;

        while (qurentNumber > 0) {

            x = qurentNumber % 10;

            qurentNumber = qurentNumber / 10;

            y = y + (x * x * x);

        }

        if (tempNumber == y)

            System.out.println("This is Armstrong");

        else

            System.out.println("This isn't Armstrong");

    }
}

