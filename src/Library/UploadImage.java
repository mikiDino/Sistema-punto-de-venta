/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * PROCEDIMIENTO PARA CARGAR IMAGEN DESDE UNA PC
 * @author Miguel Choque Lupinta
 */
public class UploadImage extends javax.swing.JFrame{
    private File archivo;
    private JFileChooser abrirArchivo;
    private static String urlOrigen = null;
    private static byte [] imageByte = null;

    public static byte[] getImageByte() {
        return imageByte;
    }
    
    public void CargarImagen(JLabel label){
        abrirArchivo = new JFileChooser();
        abrirArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de Imagen", "jpg", "png", "gif")); 
        //especifica las extensiones que le mostraran
        int respuesta = abrirArchivo.showOpenDialog(this);
        if(respuesta == JFileChooser.APPROVE_OPTION){
            archivo = abrirArchivo.getSelectedFile(); //ponemos el archivo seleccionado al objeto archivo
            urlOrigen = archivo.getAbsolutePath(); // obtener la direccion del archivo seleccionado
            Image foto = getToolkit().getImage(urlOrigen);
            foto = foto.getScaledInstance(140, 140, 1);
            label.setIcon(new ImageIcon(foto));
            imageByte = new byte[(int) archivo.length()]; //guarar en unvector de tipo byte el archivo
        }
    }
}
