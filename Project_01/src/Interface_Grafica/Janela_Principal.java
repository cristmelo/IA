package Interface_Grafica;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;

import Logica.Node;
import Programa.Atributos;

public class Janela_Principal extends JFrame{
	
	private Mode_Area mode_panel;
	private Grid_Area game_area;
	private Buttons_Area buttons_area;
	private int[] numbers;
	
	public Janela_Principal(String name, Atributos atributos){		
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		numbers = new int[9];
		
		game_area = new Grid_Area(3, 3, atributos);
		buttons_area = new Buttons_Area(3,3, game_area.getButtons(), numbers);
		mode_panel = new Mode_Area();
		
		c.add(game_area, BorderLayout.CENTER);
		c.add(mode_panel, BorderLayout.EAST);
		c.add(buttons_area, BorderLayout.SOUTH);

		this.setSize(472, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	private void start_event(){
		System.out.println("START IS WORKING");
	}
	
}
