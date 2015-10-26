package Logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solver_BL {

	ArrayList<Node> nodes_visited;
	List<Node> next_visit_list;
	ArrayList<Node> next_visit;
	
	
	public Solver_BL(int[] numbers){
		nodes_visited = new ArrayList<Node>();
		next_visit = new ArrayList<Node>();
		
		Node parent = new Node(numbers);
		nodes_visited.add(parent);
		
		
		if(next_visit.size() != 0){
			parent = next_visit.get(0);
			next_visit.remove(0);
			nodes_visited.add(parent);
		}
		
		this.generate_children(parent);
		
		next_visit_list = next_visit;
		
		Collections.sort(next_visit_list);
		
		
	}
	
	protected int calculate_cost(int[] game){
		return 1;
	}
	
	protected boolean isFinished(Node node, int length){
		for(int i = 0 ; i < length ; i ++){
			if(node.get_number_at_index(i) != (i + 1)){
				return false;
			}
		}
		return true;
	}
	
	protected void generate_children(Node parent){
		Node child;
		
		if(parent.get_null_index() - 3 >= 0){
			child = new Node(parent.get_null_index(), parent.get_null_index() - 3, nodes_visited.size() - 1, parent.get_numbers());
			child.set_cost(this.calculate_cost(child.get_numbers()));
			next_visit.add(child);
		}
		
		if(parent.get_null_index() + 3 <= 8){
			child = new Node(parent.get_null_index(), parent.get_null_index() + 3, nodes_visited.size() - 1, parent.get_numbers());
			child.set_cost(this.calculate_cost(child.get_numbers()));
			next_visit.add(child);
		}
		
		if((parent.get_null_index()%3) - 1 < 0){
			child = new Node(parent.get_null_index(), parent.get_null_index() - 1, nodes_visited.size() - 1, parent.get_numbers());
			child.set_cost(this.calculate_cost(child.get_numbers()));
			next_visit.add(child);
		}
		
		if((parent.get_null_index()%3) + 1 > 2){
			child = new Node(parent.get_null_index(), parent.get_null_index() + 1, nodes_visited.size() - 1, parent.get_numbers());
			child.set_cost(this.calculate_cost(child.get_numbers()));
			next_visit.add(child);
		}
	}
	
}
