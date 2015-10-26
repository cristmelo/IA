package Logica;

import java.util.ArrayList;

import Programa.Atributos;

public class Node implements Comparable<Node>{

	private int father_index; //Indice do pai no vetor que guarda os nos que ja foram expandidos;
	private int[] game; //Vetor que guarda a sequencia de numeros do jogo;
	private int index_null; //Indice do 0 no vetor de numeros no vetor atual(filho).
	private int cost;
	
	public Node(){
		
	}
		
	public Node(int[] numbers){
		cost = -1;
		this.father_index = -1;
		this.game = new int[numbers.length];
		
		for(int i = 0 ; i < this.game.length ; i ++){
			this.game[i] = numbers[i];
			if(numbers[i] == 9)
				index_null = i;
		}
	}
	
	public Node(int swap_zero, int movement, int father_index, int[] numbers){
		game = new int[numbers.length];
		this.father_index = father_index;
		
		int auxiliar = -1;
		for(int i = 0 ; i < numbers.length ; i ++){
			if(i != swap_zero && i != movement){
				
			}else{
				if(auxiliar == -1){
					auxiliar = game[i];
					if(i == swap_zero){
						game[i] = game[movement];
					}else{
						game[i] = game[swap_zero];
					}
				}else{
					game[i] = auxiliar;
				}
			}
		}
		
		index_null = movement;
	}

	public int[] get_numbers(){
		return game;
	}
	
	public int get_cost(){
		return cost;
	}
	
	public void set_cost(int i){
		cost = i;
	}
	
	public int get_null_index(){
		return index_null;
	}
	
	public int get_number_at_index(int index){ 
		return game[index];
	}
	
	public int compareTo(Node o) {
		if(this.cost == o.get_cost()){
			return 0;
		}
		if(this.cost < o.get_cost()){
			return -1;
		}else{
			return 1;
		}
	}
	
}
