package map;

import java.util.ArrayList;
import java.util.TimerTask;

class Task extends TimerTask{

	ArrayList<ArrayList<Integer>> low;
	Map map;
	int count;
	int Imagestart = 5;
	int lastcount;
	int flg = 0;
	
	
	

	public Task(ArrayList<ArrayList<Integer>> low, Map map) {
		this.low = low;
		this.map = map;
	}

	@Override
	public void run() {
		
		if(flg == 0){
		
			if(count % 2 == 0){
				
				low.get(0).set(Imagestart + (count -1) , 3);
				
				low.get(0).set(Imagestart + count , 4);
				map.repaint();
			}else{
				low.get(0).set(Imagestart + (count -1) , 3);
				low.get(0).set(Imagestart + count , 4);
				map.repaint();
			}
		}
		count++;
		

		if(count == 10){
			flg = 1;
		}
	
	}

	
}
