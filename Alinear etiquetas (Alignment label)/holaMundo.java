/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Liz Neria
 */
public class holaMundo {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        ///EXCEPCIONES VERIFICADAS
        /*
        BufferedReader bf = new  BufferedReader(new FileReader("C:/Users/zdieg/OneDrive/Documentos/archivo/arc.txt"));
        String linea;
        while ((linea = bf.readLine()) != null){
            System.out.println(linea);
        }*/
        
        
        //ESCEPCIONES NO VERIFICADAS
        int a,b, resultado;
        a=10;
        b=0;
        resultado=a/b;
        System.out.println(resultado);
        
    }
}