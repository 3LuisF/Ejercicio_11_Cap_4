
package ejercicio_11_cap_4;

import javax.swing.JOptionPane;


public class Ejercicio_11_Cap_4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        double N1,N2,N3;
        
        //entrada datos
        JOptionPane.showMessageDialog(null, "A continuacion Ingrese 3 numeros a comparar");
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero "));
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero "));
        N3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero "));
        
        //condiocionar y salida
        
        if (N1>N2 && N1>N3){
            JOptionPane.showMessageDialog(null,"EL VALOR MAYOR ENTRE: "+N1+"  "+N2+"  "+N3+" Es: "+N1);            
        }        
        else if (N2>N1 && N2>N3){
            JOptionPane.showMessageDialog(null,"EL VALOR MAYOR ENTRE: "+N1+"  "+N2+"   "+N3+" Es: "+N2);            
        }
        else if (N3>N1 && N3>N2) {
            JOptionPane.showMessageDialog(null,"EL VALOR MAYOR ENTRE: "+N1+"  "+N2+"  "+N3+" Es: "+N3);            
        }
        else {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales ");            
        }
        
    }
    
}
