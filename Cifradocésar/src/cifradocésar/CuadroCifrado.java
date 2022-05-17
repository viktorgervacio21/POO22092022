/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocésar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//GERVACIO HERNÁNDEZ VIKTOR 
//PROGRAMACION ORIENTADA A OBJETOS 
//GRUPO: 2209
//FECHA 16/05/2022
/**
 *
 * @author Viktor
 */
//INICIO PROGRAMA

public class CuadroCifrado extends JFrame{
    //NOMBRANDO VARIABLES
    JTextField escrito;
    JTextField movimientos;
    JTextField fin;
    JButton tecla;
    
    
    //LETRAS PARA CIFRADO a-z
    String letras = "abcdefghijklmnñopqrstuvwxyz";
    public CuadroCifrado() throws HeadlessException {
        setTitle("Nuestro Cifrado César");
        
        
    //TAMAÑO DE CUADRO
        setSize(300, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        escrito = new JTextField(20);
        movimientos = new JTextField(5);
        
        
    //TEXTOS Y CUADROS PARA VENTANA Y FUNCIONES
        tecla = new JButton("Cifre su escrito deseado");
        //TAMAÑO DEL RESULTADO
        fin = new JTextField(20);
        escrito.setToolTipText("Introducir su escrito para cifrar");
        movimientos.setToolTipText("Letras a desplazar");
        this.getContentPane().add(escrito);
        this.getContentPane().add(movimientos);
        this.getContentPane().add(tecla);
        this.getContentPane().add(fin);
        this.validate();
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        this.tecla.addMouseListener(new MouseAdapter() {
            @Override
            
            
            // LLAMAR FUNCIONES
            public void mouseClicked(MouseEvent e) {
                String textoCifrado = "";
                String textoCifrar = escrito.getText();
                String despla = movimientos.getText();
                int num = Integer.parseInt(despla);
                char caracter;
                try {
                    
                    
                    //NUMEROS ENTEROS
                    textoCifrar = textoCifrar.toLowerCase();
                    for(int i = 0; i < textoCifrar.length(); i++){
                    caracter = textoCifrar.charAt(i);
                    int pos = letras.indexOf(caracter);
                    if(pos == -1){
                        textoCifrado += caracter;
                    }else{
                        textoCifrado += letras.charAt((pos + num )% letras.length());
                    }
                }
                   
                    //EXCEPCIONES
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            fin.setText(textoCifrado);
            }
            
        });
    }
    
}