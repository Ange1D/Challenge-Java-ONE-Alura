package org.challenge;

import javax.swing.*;

public class menu {

    public menu(){
        String[] opciones = new String[] {"Selecciona...", "Conversor de Moneda", "Conversor de Temperatura"};

        String opcionSeleccionada = JOptionPane.showInputDialog(null,"Selecciona una opcion de conversion","Menu",
                JOptionPane.PLAIN_MESSAGE,null,opciones,
                opciones[0]).toString();


        switch (opcionSeleccionada){
            case "Conversor de Moneda": new conversorMonedas().menuMonedas(new conversorMonedas().cantidad());
            case "Conversor de Temperatura": new conversorTemperatura().menuTemperatura(new conversorTemperatura().temperatura());
            default: JOptionPane.showMessageDialog(null,"No es una opcion valida ");

        }
    }


}
