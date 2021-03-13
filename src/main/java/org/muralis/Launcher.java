package org.muralis;

public class Launcher {

    public static void main(String[] args) {
        Doable d1 = (aThing -> System.out.println("Hello "+ aThing));
        d1.doIt1("Alan");
        d1.doIt1("Dolly");
    }
}
