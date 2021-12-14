package Ejercicio2;

import javax.swing.*;

public class Figuras {

    public void amosarFigura(){

        int figura;
        String nomeFigura;
        int lado, base, altura, radio;
        final double PI=3.14159;

        figura = Integer.parseInt(JOptionPane.showInputDialog(" Elixe a opción desexada"));
        lado = Integer.parseInt(JOptionPane.showInputDialog(" Introduce o lado"));
        base = Integer.parseInt(JOptionPane.showInputDialog(" Introduce a base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(" Introduce a altura "));
        radio = Integer.parseInt(JOptionPane.showInputDialog(" Introduce a radio"));

                switch (figura){
            case 1:
                nomeFigura="Cadrado";
                JOptionPane.showMessageDialog(null, " A opción elixida é : " + nomeFigura + "\n" + " superficie : " + lado*lado  );
                break;
            case 2:
                nomeFigura="Triangulo";
                JOptionPane.showMessageDialog(null, " A opción elixida é : " + nomeFigura + "\n" + " superficie : "+ ((base*altura)/2));

                break;

            case 3:
                nomeFigura="Circulo";
                JOptionPane.showMessageDialog(null, " A opción elixida é : " + nomeFigura + "\n" + " superficie : " + PI * (radio*radio) );
                break;

            default:
                nomeFigura="INVÁLIDO";
                JOptionPane.showMessageDialog(null, " A opción elixida é : " + nomeFigura );
                break;
        }
    }








}
