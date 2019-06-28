package main;

import modules.hello.HelloModules;
import service.HelloS;

public class Main {

    public static void main(String[] args) {
        HelloModules.metoda();
//        nie jest udostępnione, więc nie widzi
//        HelloModules.metoda2();

        HelloS helloS = new HelloS();
        helloS.metoda();
        helloS.metodaZInterfejsu();
    }}
