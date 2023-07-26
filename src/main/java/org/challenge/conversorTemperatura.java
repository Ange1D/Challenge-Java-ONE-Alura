package org.challenge;

import javax.swing.*;
import java.util.Arrays;

public class conversorTemperatura {

    public double temperatura(){
        double temperatura =0.0;
        String cantidadIngresada = JOptionPane.showInputDialog("Ingresa la temperatura que desea convertir");
        try {
            temperatura = Double.parseDouble(cantidadIngresada);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor no es valido, debe ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return temperatura;
    }

    public void menuTemperatura(double temperatura) {

        String[] monedas = new String[] {"Selecciona...",
                "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine",
                "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
                "De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine",
                "De Rankine a Celsius", "De Rankine a Fahrenheit", "De Rankine a Kelvin"};

        String opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona la temperatura que deseas convertir","Menu Temperatura",
                JOptionPane.PLAIN_MESSAGE,null,monedas,
                monedas[0]).toString();

        int opcionIndex = Arrays.asList(monedas).indexOf(opcionSeleccionada);

        JOptionPane.showMessageDialog(null, new JLabel(covertirTemperatura(opcionIndex, temperatura), JLabel.CENTER));

        continuar();
    }

    public String covertirTemperatura(int opcion,double temperatura){

        switch(opcion){
            case 1:
                return temperatura+ " grados Celsius son " +(( temperatura * 1.8) + 32)+" grados Fahrenheit";
            case 2:
                return temperatura+ " grados Celsius son " +( temperatura + 273.15)+" grados Kelvin";
            case 3:
                return temperatura+ " grados Celsius son " +(( temperatura +273.15) * 9/5)+" grados Rankine";

            case 4:
                return temperatura+ " grados Fahrenheit son " +(( temperatura -32 ) / 1.8)+" grados Celsius";
            case 5:
                return temperatura+ " grados Fahrenheit son " +( (temperatura + 459.67)*5/9)+" grados Kelvin";
            case 6:
                return temperatura+ " grados Fahrenheit son " +( temperatura +459.67) +" grados Rankine";

            case 7:
                return temperatura+ " grados Kelvin son " +( temperatura -273.15)+" grados Celsius";
            case 8:
                return temperatura+ " grados Kelvin son " +( (temperatura * 9/5 )-459.67)+" grados Fahrenheit";
            case 9:
                return temperatura+ " grados Kelvin son " +( temperatura * 9/5) +" grados Rankine";

            case 10:
                return temperatura+ " grados Rankine son " +(( temperatura -491.67 ) * 5/9)+" grados Celsius";
            case 11:
                return temperatura+ " grados Rankine son " +( temperatura -459.67)+" grados Fahrenheit";
            case 12:
                return temperatura+ " grados Rankine son " +( temperatura * 5/9) +" grados Kelvin";

            default:
                return "opcion incorrecta";

        }

    }

    public void continuar(){

        String[] opciones = new String[3];
        opciones[0] = "Si";
        opciones[1] = "No";
        opciones[2] = "Cancelar";


        int res = JOptionPane.showOptionDialog(null, " ¿Desea continuar?", "Seleccione una opcion", 0, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
        System.out.println(res);

        switch (res) {
            case 0:
                new menu();
                break;
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, new JLabel("Programa Finalizado" , JLabel.CENTER));
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"No es una opcion valida ");
                throw new IllegalStateException("Unexpected value: " + res);

        }



    }

}
