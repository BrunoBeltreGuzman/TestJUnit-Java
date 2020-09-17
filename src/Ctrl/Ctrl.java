/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Operaciones.Operaciones;
import Ventana.Ventana1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author BrunoDev
 */
public class Ctrl implements ActionListener {

    private double a = 0, b = 0;

    private Ventana1 ventana;
    private Operaciones operaciones;

    public Ctrl(Ventana1 ventana, Operaciones operaciones) {
        this.ventana = ventana;
        this.operaciones = operaciones;

        ventana.getBtnSumar().addActionListener(this);
        ventana.getBtnRestar().addActionListener(this);
        ventana.getBtnMurtiplicar().addActionListener(this);
        ventana.getBtnDividir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventana.getBtnSumar()) {
            setData(ventana);
            operaciones.sumar(a, b);
            ventana.getTesResultado().setText(a + " + " + b + " = " + operaciones.getAns());
        }

        if (e.getSource() == ventana.getBtnRestar()) {
            setData(ventana);
            operaciones.restar(a, b);
            ventana.getTesResultado().setText(a + " - " + b + " = " + operaciones.getAns());
        }

        if (e.getSource() == ventana.getBtnMurtiplicar()) {
            setData(ventana);
            operaciones.murtipicar(a, b);
            ventana.getTesResultado().setText(a + " x " + b + " = " + operaciones.getAns());
        }

        if (e.getSource() == ventana.getBtnDividir()) {
            setData(ventana);
            operaciones.dividir(a, b);
            ventana.getTesResultado().setText(a + " / " + b + " = " + operaciones.getAns());
        }

    }

    private void setData(Ventana1 ventana) {
        try {
            a = Double.valueOf(ventana.getTexNumero1().getText().trim());
            b = Double.valueOf(ventana.getTexNumero2().getText().trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
