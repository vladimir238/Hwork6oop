import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Alarm pacient1 = new Alarm("Авилов", 35, "89265748967");
        Alarm pacient2 = new Alarm("Плешков", 24, "89934456789");
        Medic medic = new Medic();
        pacient1.print();
        medic.print();
        System.out.println("Пациент  "+ pacient1.name +" Врач " + medic.spec);




    }


}

