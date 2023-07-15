package org.challenge;

import javax.swing.*;
import java.util.Arrays;

public class conversorMonedas {

    public double cantidad(){
        double cantidad =0.0;
        String cantidadIngresada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que desea convertir");
        try {
            cantidad = Double.parseDouble(cantidadIngresada);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor no es valido, debe ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cantidad;
    }

    public void menuMonedas(double cantidad) {
        String[] monedas = new String[] {"Selecciona...", "De peso a Dolar", "De peso a Euro", "De peso a Libra", "De peso a Yen", "De peso a Won Coreano"
                , "De Dolar a peso", "De Euro a peso", "De Libra a peso", "De Yen a peso", "De Won Coreano a peso"};

        String opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona la moneda que deseas convertir","Menu Monedas",
                JOptionPane.PLAIN_MESSAGE,null,monedas,
                monedas[0]).toString();

        double[] valoresMonedas = new double[] {0.0, 0.059,0.053, 0.046, 8.27, 75.99, 17.06, 18.78, 21.96, 0.12,  0.013};

        String[] nombreMonedas = new String[] {"", " Dolares", " Euros", " Libras", " Yenes", " Wones Coreanos", " Pesos", " Pesos", " Pesos", " Pesos", " Pesos"};

        int opcionIndex = Arrays.asList(monedas).indexOf(opcionSeleccionada);

        JOptionPane.showMessageDialog(null, new JLabel("Tienes "+ cantidad*valoresMonedas[opcionIndex] + nombreMonedas[opcionIndex] , JLabel.CENTER));

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
                System.exit(0);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + res);

        }



    }


}
