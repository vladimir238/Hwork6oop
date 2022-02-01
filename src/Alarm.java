public class Alarm {
    public String name;
    private int age;
    private String phone;


    public Alarm(String name, int age, String phone) {
        this.name = name;
        this.age = setAge(age);
        this.phone = setPhone(phone);
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Alarm() {
        this("Неизвестен", 0, "000000000000");

    }

    public void print() {
        System.out.println("Имя " + name + "  Возраст " + age + "  Телефон " + phone);
    }

    public int setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            System.out.println("Возраст введен некорректно" + age);
            age = 0;
        }
        return age;

    }

    public String setPhone(String phone) {
        this.phone = phone;
        if (phone.length() > 12 || phone.length() < 11) {
            System.out.println("Телефон введен неправильно  " + phone);
            System.out.println("Телефон  " + phone);
            phone = "0000000000";
        }
        return phone;


    }
}
