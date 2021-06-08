/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Miguel
 */
public class FieldEvent {
    public void textKeyPress(KeyEvent evt){
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && 
                (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) { // backspace es la tecla eliminar
            evt.consume();// hace que rechaze todo menos la sentencia,
        } else {
            
        }
    }
    
    public void numberKeyPress(KeyEvent evt){
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else {
            
        }
    }
    
    public boolean isEmail(String correo){
        Pattern pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$"); // expresion regular para validar el correo
        Matcher mat = pat.matcher(correo); // matcher nos devolvera si correo es un Email
        return mat.find(); // find busca el resultado de true or false
    }
}
