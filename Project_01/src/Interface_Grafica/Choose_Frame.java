package Interface_Grafica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Choose_Frame extends JFrame{

	Grid_Area grid_text;
	JButton ok_BTN;
	
	public Choose_Frame(int width, int height, int[] numbers, JButton[] buttons){
		grid_text = new Grid_Area(width, height);
		ok_BTN = new JButton("OK");
		
		ok_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fill_vector_of_numbers(width, height, numbers);
				for(int i = 0 ; i < height * width ; i ++){
					System.out.println(numbers[i]);
					if(numbers[i] != 9){
						buttons[i].setText(Integer.toString(numbers[i]));
					}else{
						buttons[i].setText("");
					}
				}
				closeFrame();
			}
		});
		
		this.setLayout(new BorderLayout());
		this.add(grid_text, BorderLayout.CENTER);
		this.add(ok_BTN, BorderLayout.SOUTH);
		
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	
	private void closeFrame(){
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}
	
	private void fill_vector_of_numbers(int width, int height, int[] numbers){
		for(int i = 0 ; i < width * height ; i ++){
			try{
				numbers[i] = Integer.parseInt(grid_text.get_text_at_index(i));
				//System.out.println(numbers[i]);
			}catch(NumberFormatException e){
				numbers[i] = -1;
			}
		}
	}
	
}
