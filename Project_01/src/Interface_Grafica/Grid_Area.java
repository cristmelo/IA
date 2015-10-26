package Interface_Grafica;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Programa.Atributos;

public class Grid_Area extends JPanel{

	private JButton[] button;
	private JTextField[] texts;
	
	public Grid_Area(int width, int height, Atributos atributos){
		this.setLayout(new GridLayout(width, height));
		button = new JButton[width*height];
		
		for(int i = 0 ; i < width*height ; i ++){
				int index = (int)((width*height-1)/2);
			if(i != index){
				if(i > index){
					button[i] = new JButton(Integer.toString(atributos.getNumbers(i-1)));
				}else{
					button[i] = new JButton(Integer.toString(atributos.getNumbers(i)));
				}
			}else{
				button[i] = new JButton();
			}
			button[i].setEnabled(false);
			this.add(button[i]);
		}
		
	}
	
	public Grid_Area(int width, int height){
		this.setLayout(new GridLayout(width, height));
		texts = new JTextField[width*height];
		
		for(int i = 0 ; i < width*height ; i ++){
			texts[i] = new JTextField();
			this.add(texts[i]);
		}
	}
	
	public String get_text_at_index(int index){
		return this.texts[index].getText();
	}
	
	public void setButtonText(String text, int button_index){
		this.button[button_index].setText(text);
	}
	
	public JButton[] getButtons(){
		return button;
	}
	
}
