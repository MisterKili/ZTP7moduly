package service;

public class HelloS implements HelloInterface{

    public void metoda(){
        System.out.println("Tu metoda z service.HelloS");
    }

    @Override
    public void metodaZInterfejsu() {
        System.out.println("Tu metoda z interfejsu");
    }
}
