/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Library.Objects;
import java.awt.Color;
//import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Miguel
 */
public class ClientesVM {
    private String accion = "insert";
    private final ArrayList <JLabel> lbl;
    private final ArrayList<JTextField> field;
    
    public ClientesVM(Object[] listaObjects, ArrayList<JLabel> label, ArrayList<JTextField> textField) {
        lbl = label;
        field = textField;
    }
    
    public void RegistrarCliente(){
        if(field.get(0).getText().equals("")){
            lbl.get(0).setText("Ingrese el Nombre");
            lbl.get(0).setForeground(Color.RED);
            field.get(0).requestFocus();
        } else {
            if (field.get(1).getText().equals("")) {
                lbl.get(1).setText("Igrese el CI / NIT");
                lbl.get(1).setForeground(Color.RED);
                field.get(1).requestFocus();
            } else {
                if (field.get(2).getText().equals("")) {
                    lbl.get(2).setText("Igrese el Apellido");
                    lbl.get(2).setForeground(Color.RED);
                    field.get(2).requestFocus();
                } else {
                    if (field.get(3).getText().equals("")) {
                        lbl.get(3).setText("Igrese el Email");
                        lbl.get(3).setForeground(Color.RED);
                        field.get(3).requestFocus();
                    } else {
                        if (!Objects.events.isEmail(field.get(3).getText())) {
                            lbl.get(3).setText("Ingrese un emal valido");
                            lbl.get(3).setForeground(Color.RED);
                            field.get(3).requestFocus();
                        } else {
                            if (field.get(4).getText().equals("")) {
                                lbl.get(4).setText("Igrese el Telefono / Celular");
                                lbl.get(4).setForeground(Color.RED);
                                field.get(4).requestFocus();
                            }else {
                                if (field.get(5).getText().equals("Direccion")) {
                                    lbl.get(5).setText("Igrese el Email");
                                    lbl.get(5).setForeground(Color.RED);
                                    field.get(5).requestFocus();
                                }
                            }                          
                        }
                    }
                }
            }
        }
    }    
}