package Ejercicio1;

import javax.swing.*;

public class Almacen {

public void amosarTipo(){
    String nome,tipo;
    int vendas;
    vendas = Integer.parseInt(JOptionPane.showInputDialog(null, " vendas anuais "));
    nome = JOptionPane.showInputDialog(null," nome de producto ");

   if (vendas <=100){
       JOptionPane.showMessageDialog(null,nome + " é un artigo de consumo catalogado como " + (tipo="Baixo"));
   }
   else if ( vendas >100 & vendas <=500){
       JOptionPane.showMessageDialog(null,nome + " é un artigo de consumo catalogado como " + (tipo="Medio"));
   }
   else if ( vendas >500 & vendas <=1000){
       JOptionPane.showMessageDialog(null,nome + " é un artigo de consumo catalogado como " + (tipo="Alto"));
   }
   else if ( vendas > 1000){
       JOptionPane.showMessageDialog(null,nome + " é un artigo de consumo catalogado como " + (tipo="Primeira necesidade"));
   }


}



}
