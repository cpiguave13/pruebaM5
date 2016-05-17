package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MisegundaClaseU extends JFrame{

	JPanel panel;
	JButton boton;
	JList lista;
	JComboBox lista2;
	public MisegundaClaseU(){
		panel=new JPanel();
		
		panel.setLayout(new FlowLayout());//crear objeto sin ponerle nombre.
		boton=new JButton("ABRIR");//boton
		String [] datos={"Casado","Soltero","Divorciado"};//nombre de la lista
		lista=new JList(datos);//crear lista
		
		lista2=new JComboBox();//crear desplegable
		lista2.addItem("Casado");
		lista2.addItem("Soltero");
		lista2.addItem("Divorciado");
		panel.add(boton);//agregar el boton a al panel
		panel.add(lista);//agregar la lista al panel
		panel.add(lista2);//agregar el desplegable
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel,BorderLayout.CENTER);//le das posicion al panel
		this.setSize(500,500);//le das el tamaño
		this.setVisible(true);//hacerlos visible
	}
	
	public static void main(String[] args) {
		MisegundaClaseU ventana = new MisegundaClaseU();
		
	}
}
