package com.yoprogramo.myfirstproyect;

public class MyFirstProyect {
    public static void main(String[] args) {
        Vehiculo vehi = new Vehiculo(13232, 2, "Super", "1123");
        Auto auto2 = new Auto(1, "ZZZ000", 4, "Azul", true, 343534, 8,
                "Renault", "13");
        Camion cami = new Camion(5, true, 2324545, 9, "Mercedes", "2");
        Moto mot = new Moto(900, 3413, 2, "Yamaha", "111");
        
        Vehiculo vector[] = new Vehiculo[4];
        vector[0] = vehi;
        vector[1] = mot;
        vector[2] = auto2;
        vector[3] = cami;
        
        for (Vehiculo vec : vector) {
            System.out.println("La marca del Vehiculo es: " + vec.getMarca());
        }
        //System.out.println(auto2.toString());
        /*auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(30);
        auto2.apagar();*/
        /* System.out.println("El valor del ID es " + auto2.getId());
        auto2.setId(3500);
        System.out.println("El valor del ID es " + auto2.getId()); */
        /*System.out.println("El ID es: " + auto1.getId());
        System.out.println("La cantidad de puertas es: " + auto1.getCant_puertas());
        auto1.setId(4000);
        auto1.setCant_puertas(8);
        System.out.println("El nueva ID es: " + auto1.getId());
        System.out.println("La nueva cantidad de puertas es: " + auto1.getCant_puertas());*/
    } 
}
