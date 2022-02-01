import java.util.Random;
import java.util.Scanner;

public class Medic extends Alarm {


    int medPeople;
    String spec;
    String[] travMatolog = {"Иванов", "Чебурахин", "Павлов"};
    String[] hiRurg = {"Петров", "Александров", "Чистяков"};
    String[] carDiolog = {"Черепанов", "Сидоров", "Бахрушин"};

    public void print() {
        choiceMedic();
        System.out.println("Заявка будет передана врачу " + spec);
    }

    public void specialist() {

        System.out.println("Если травматолог введите 1");
        System.out.println("Если хирург введите 2");
        System.out.println("Если кардиолого введите 3");
        System.out.print("Помощь какого специалиста нужна ?  ");

        Scanner scanner = new Scanner(System.in);
        medPeople = scanner.nextInt();


    }

    public String choiceMedic() {
        specialist();
        int r;
        Random rand = new Random();
        r = rand.nextInt(3);
        switch (medPeople) {
            case 1:
                spec = travMatolog[r];
                break;
            case 2:
                spec = hiRurg[r];
                break;
            case 3:
                spec = carDiolog[r];
                break;
            default:
                System.out.println("Ошибка ввода");
                spec = "Козлов";
                break;
        }
        return spec;
    }


}
