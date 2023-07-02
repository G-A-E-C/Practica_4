/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.util;

import javax.swing.JComboBox;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class Util {
     public static void cargarValoresCombo(JComboBox cbx, String combo) {
        cbx.removeAllItems();
        
        if(combo.equals("metodo")) {
            
            String[] metodos = {"QuickSort", "MergeSort"};
                    
            for(String metodo : metodos) {
                cbx.addItem(metodo);
            }
            
        } else {
            
            String[] tipos = {"Ascendente", "Descendente"};
                    
            for(String tipo : tipos) {
                cbx.addItem(tipo);
            }
            
        }
    }

}
