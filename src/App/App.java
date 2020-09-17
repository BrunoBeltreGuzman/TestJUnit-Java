/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Ctrl.Ctrl;
import Operaciones.Operaciones;
import Ventana.Ventana1;

/**
 *
 * @author BrunoDev
 */
public class App {

    private static void iniciar() {
        Ventana1 ventana = new Ventana1();
        Operaciones operaciones = new Operaciones();
        new Ctrl(ventana, operaciones);
        ventana.setVisible(true);
    }


    public static void main(String[] args) {
        iniciar();
    }

}
