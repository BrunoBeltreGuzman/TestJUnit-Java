/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author BrunoDev
 */
public class Operaciones {

    private double ans;

    public double sumar(double a, double b) {
        ans = a + b;
        return ans;
    }

    public double restar(double a, double b) {
        ans = a - b;
        return ans;
    }

    public double murtipicar(double a, double b) {
        ans = a * b;
        return ans;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Systaxis error", "", WARNING_MESSAGE);
            return 0;
        } else {
//            ans = a / b;
            return ans;
        }

    }

    public double dividirException(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Systaxis error");
        }
        ans = a / b;
        return ans;
    }

    public double getAns() {
        return ans;
    }

    public void removeAns() {
        ans = 0;
    }
}
