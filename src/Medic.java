import java.util.Random;
import java.util.Scanner;

public class Medic extends Alarm {


    int medPeople;
    String spec;
    String[] travMatolog = {"Иванов", "Чебурахин", "Павлов"};
    String[] hiRurg = {"Петров", "Александров", "Чистяков"};
    String[] carDiolog = {"Черепанов", "Сидоров", "Бахрушин"};
    // Вывод в консоль
    public void print(String name) {
        choiceMedic();
        System.out.println("Пациент  " + name + " врач " + spec);
        System.out.println();
        System.out.println();
    }

    // Выбор напрвления специалиста
    public void specialist() {

        System.out.println("Если травматолог введите 1");
        System.out.println("Если хирург введите 2");
        System.out.println("Если кардиолого введите 3");
        System.out.print("Помощь какого специалиста нужна ?  ");

        Scanner scanner = new Scanner(System.in);
        medPeople = scanner.nextInt();


    }
    //выбор непосредственно врача,рандомно.
    public String choiceMedic() {
        specialist();
        int r;
        Random rand = new Random();
        r = rand.nextInt(3);
        switch (medPeople) {
            case 1:
                super.allSpecialist(travMatolog);
                spec = travMatolog[r];
                break;
            case 2:
                super.allSpecialist(hiRurg);
                spec = hiRurg[r];
                break;
            case 3:
                super.allSpecialist(carDiolog);
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
