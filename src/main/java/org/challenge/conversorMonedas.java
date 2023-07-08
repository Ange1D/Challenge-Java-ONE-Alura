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

        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cantidad;
    }


}
