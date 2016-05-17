package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Miprimeraventana {
	public static void main (String[] args){
		//VENTANAS
		JFrame ventana=new JFrame("Mi primera ventana");
		JButton boton=new JButton("Mi primer boton");
		JTextArea texto= new JTextArea("Escribe con ENTERS: ",8,20);
		JTextField cuadro= new JTextField("Escribe recto",20);
		
		Label etiqueta= new Label("Nom: ");//crea etiqueta que saldra ne la ventna
		Label etiqueta2=new Label("Cognoms: ");//crea etiqueta que saldra en la ventana
		etiqueta.setBackground(new Color(100,200,54));//darle color
		etiqueta2.setBackground(new Color(200,20,154));//darler color
		
		ventana.add(etiqueta,BorderLayout.NORTH);//darle posicion de las etiquetas
		ventana.add(etiqueta2,BorderLayout.SOUTH);//darle posicion de las etiquetas
		//boton
		ventana.add(boton, BorderLayout.CENTER);//haces un bton
		//cuadro de texto
		ventana.add(texto, BorderLayout.EAST);//texto con enters
		ventana.add(cuadro, BorderLayout.WEST);//texto en una sola linea
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa
		ventana.setSize(200, 250);//dar tamaño de la ventana
		ventana.setVisible(true);//para que el elemento sea visible
		//Hola cristian edited By Aitor
		
		
	}

}
