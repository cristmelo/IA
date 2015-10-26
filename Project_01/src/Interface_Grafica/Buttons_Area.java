package Interface_Grafica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons_Area extends JPanel implements ActionListener{

	JButton start_BTN;
	JButton shuffle_BTN;
	JButton show_BTN;
	JButton choose_grid_BTN;
	JLabel status;
	
	public Buttons_Area(int width, int height, JButton[] buttons, int[] numbers) {
		//this.setLayout(new FlowLayout());
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
				
		start_BTN = new JButton("START");
		this.add(start_BTN);

		shuffle_BTN = new JButton("SHUFFLE");
		this.add(shuffle_BTN);
		
		choose_grid_BTN = new JButton("CHOOSE");
		this.add(choose_grid_BTN);
		
		show_BTN = new JButton("SHOW");
		this.add(show_BTN);
		
		this.add_LABEL(status, "WAITING TO START");
		
		start_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start");
			}
		});
		
		shuffle_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		show_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		choose_grid_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose_Frame choose = new Choose_Frame(width, height, numbers, buttons);
				//for(int i = 0 ; i < width * height ; i ++){
				//	System.out.println(numbers[i]);
				//	buttons[i].setText(Integer.toString(numbers[i]));
				//}
			}
		});
		
		
	}
	
	private void add_BTN(JButton button, String name){
		button = new JButton(name);
		this.add(button);
	}
	
	private void add_LABEL(JLabel label, String name){
		label = new JLabel(name);
		this.add(label);
	}
	
	public void set_label_text(JLabel label, String text){
		label.setText(text);
	}
	
	public JLabel get_status_label(){
		return status;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
	
}
