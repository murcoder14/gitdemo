package org.muralis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        Doable d1 = aThing -> System.out.println("Hello "+ aThing);
        d1.doIt1("Alan");
        d1.doIt1("Dolly");

        List<String> towns = new ArrayList<>(Arrays.asList("Cheshire","North Haven","Wallingford"));
        towns.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
