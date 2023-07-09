package org.challenge;

import javax.swing.*;
import java.util.regex.Pattern;
import java.util.regex.*;

public class conversorMonedas {

    public double cantidad(){
        double cantidad =0.0;
        String cantidadIngresada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que desea convertir");
        try {
            cantidad = Double.parseDouble(cantidadIngresada);
            new conversorMonedas().menuMonedas();
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cantidad;
    }

    public void menuMonedas() {
        String[] monedas = new String[] {"Selecciona...", "De peso a Dolar", "De peso a Euro", "De peso a Libra", "De peso a Yen", "De peso a Won Coreano"
                , "De Dolar a peso", "De Euro a peso", "De Libra a peso", "De Yen a peso", "De Won Coreano a peso"};

        String opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona la moneda que deseas convertir","Menu Monedas",
                JOptionPane.PLAIN_MESSAGE,null,monedas,
                monedas[0]).toString();
    }


}
