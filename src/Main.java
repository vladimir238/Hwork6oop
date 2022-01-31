public class Main {
    public static void main(String[] args) {
        Alarm alarm= new Alarm("Плешков",24,"89934456789",2);
        alarm.print();
        if (alarm.getWho()==2){
            Medic pacient1=new Medic();
            pacient1.print();
            pacient1.specialist();

        }




    }
}
