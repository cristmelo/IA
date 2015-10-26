package Programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atributos {

	private int[] numbers;
	private List<Integer> initial_sequence; 
	
	public Atributos(){
		
		numbers = new int[9];
		initial_sequence = new ArrayList<Integer>();
	
		for(int i = 0 ; i < 8 ; i ++){
			initial_sequence.add((Integer)(i+1));
			numbers[i] = i + 1;
		}
		
		numbers[8] = 9;
		
		
	}
	
	public void reset_sequence(){
		
		Collections.shuffle(initial_sequence);
		
		for(int i = 0 ; i < 9 ; i ++){
			if(i != 4){
				if(i < 4){
					numbers[i] = initial_sequence.get(i);
				}else{
					numbers[i] = initial_sequence.get(i-1);
				}
			}else{
				numbers[i] = 9;
			}
		}
		
	}
	
	public int getNumbers(int i){
		return numbers[i];
	}
	
}
