package org.example.functionalprograming;

import java.util.List;
import java.util.function.Predicate;

public class ProgramacionFuncional {
    public static void main(String[] args) {

        //Lista de portatiles
        List<Portatiles> portatiles = List.of(
            new Portatiles("HP", "Pavilion", 8, 512, 800.0),
            new Portatiles("Lenovo", "Thinkpad", 16, 1024, 1200.0),
            new Portatiles("Apple", "Macbook", 16, 512, 1500.0),
            new Portatiles("Asus", "Zenbook", 8, 256, 1000.0)
        );

        //Funcion pura que no tiene efectos secundarios
        Predicate<Portatiles> ramPredicate = portatil -> portatil.getRam() >= 16;

        //Funcion de orden superior
        List<Portatiles> mayor16 = filterPortatiles(portatiles, ramPredicate);

        assert mayor16 != null;
        mayor16.forEach(System.out::println);

        //Ejemplo de intentar modificar la lista
        try {
            mayor16.add(new Portatiles("Acer", "Aspire", 24, 256, 900.0));
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar la lista "+e.getMessage());
        }

    }

    //Funcion de orden superior
    private static List<Portatiles> filterPortatiles(List<Portatiles> portatiles, Predicate<Portatiles> ramPredicate) {
        return portatiles.stream()
                .filter(ramPredicate)
                .toList();
    }


}
