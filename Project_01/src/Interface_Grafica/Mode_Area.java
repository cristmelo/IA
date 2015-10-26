package Interface_Grafica;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Mode_Area extends JPanel{

	private ArrayList<JRadioButton> options_list; 
	private ButtonGroup options_group;
	
	public Mode_Area(){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		options_list = new ArrayList<JRadioButton>();
		options_group = new ButtonGroup();
		
		add_option("BFC");
		add_option("Heuristica 1");
		add_option("Heuristica 2");
	}
	
	public void add_option(String name){
		JRadioButton newBtn = new JRadioButton(name);
		options_group.add(newBtn);
		options_list.add(newBtn);
		this.add(newBtn);
	}
	
}
