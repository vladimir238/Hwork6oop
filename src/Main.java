/* Содать программу подбора лечащего врача для пациента.Создать конструктор в суперклассе,принимающий имя,номер телефона
возраст пациента.В субклассе выбрать направление специалиста,а также выбрать (рандомно) непосредственно лечащего врача.
Вывести фамилии всех врачей данной специализации,имя пациента и лечащего врача
 */
public class Main {
    public static void main(String[] args) {
        Alarm pacient1 = new Alarm("Авилов", 35, "89265748967");
        Alarm pacient =new Alarm("Чердаков",45,"+79458972345");
        Medic medic = new Medic();
        pacient1.print();
        medic.print(pacient1.name);
        pacient.print();
        medic.print(pacient.name);

    }


}

