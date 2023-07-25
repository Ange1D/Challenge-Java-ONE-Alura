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

        JOptionPane.showMessageDialog(null, new JLabel("Selecciono "+ monedas[opcionIndex], JLabel.CENTER));

        continuar();
    }

    public void continuar(){

        String[] opciones = new String[3];
        opciones[0] = "Si";
        opciones[1] = "No";
        opciones[2] = "Cancelar";


        int res = JOptionPane.showOptionDialog(null, "¿Desea continuar?!", "Seleccione una opcion", 0, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
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
