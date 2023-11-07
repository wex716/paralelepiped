import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rebro1;
        int rebro2;
        int rebro3;
        int resultVolume;
        int resultSquare;

        System.out.println("Программа позволяет узнать площадь поверхности и объем параллелепипида ");

        Scanner scanner = new Scanner(System.in);
        rebro1 = scanner.nextInt();
        rebro2 = scanner.nextInt();
        rebro3 = scanner.nextInt();

        resultVolume = (rebro1 * rebro2 * rebro3);
        System.out.println("Объем параллепипида " + resultVolume);
        resultSquare = 2 * ((rebro1 * rebro2) + (rebro1 * rebro3) + (rebro2 * rebro3));
        System.out.println("Площадь поверхности параллелепипида " + resultSquare);


    }
}