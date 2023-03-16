/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Comparacao {public static void main (String []args){

        int num1, num2;

        num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));

        if(num1>num2){
            System.out.println(" O número 1° número " +num1+ " é maior que o segundo número " +num2);
        }else if (num2>num1){
              System.out.println(" O número 2° número " +num2+ " é maior que o 1° número " +num1);
        }else{
            System.out.println("O 1º número " +num1+ " e o 2° número " +num2+ " são iguais.");
        }
    }
}
