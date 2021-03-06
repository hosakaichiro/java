package map;

import java.util.ArrayList;

public class MapBox {
	
	Map map;
	int mapNum;
	
	MapBox(Map map){
		this.map = map;
		
		int [][] arr = null;
		arr = new int [][]{
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,6,6,6,6,6,5,6,6,6,6,6,6,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,5,5,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,5,5,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,6,1,1,1,1,1,1,5,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,5,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,5,5,5,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,5,5,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,5,3,3,3},
			{6,6,6,6,6,1,5,1,1,1,1,1,1,1,1,1,5,6,6,6},
			{5,5,5,5,5,1,1,5,1,1,1,1,1,1,1,1,5,5,5,5},
			{6,6,6,6,6,1,1,1,1,1,1,1,1,1,1,1,6,6,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,6,6,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,6,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,5,5,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,5,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,5,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,5,1,1,1,1,1,1,6,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,6,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,6,6,6,6,5,6,6,6,6,6,6,6,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3}};
		
			
			ArrayList<ArrayList<Integer>> low = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> col = new ArrayList<Integer>();
			
			//配列をクラス配列に変換
			low = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < arr.length; i++){
				col = new ArrayList<Integer>();
				for(int j = 0; j < arr[i].length; j++){
					col.add(arr[i][j]);
				}
				low.add(col);
			}
		
			this.map.low = low;
			this.map.Xadd = 0;
			this.map.Yadd = 0;
			
			this.map.x = 0;
			this.map.y = 0;
			
			this.map.cX = 10;
			this.map.cY = 10;
			this.map.repaint();
		
			this.mapNum = 1;
	}
	
	
	public void mapChage(){
		
		switch(mapNum){
		case 1:
			map2();
			this.mapNum = 2;
			break;
			
		case 2:
			map1();
			this.mapNum = 1;
			break;
		}
	}
	
	public void map1(){
		
		int [][] arr = null;
		arr = new int [][]{
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,6,6,6,6,6,5,6,6,6,6,6,6,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,5,5,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,5,5,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,6,1,1,1,1,1,1,5,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,5,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,5,5,5,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,5,5,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,5,3,3,3},
			{6,6,6,6,6,1,5,1,1,1,1,1,1,1,1,1,5,6,6,6},
			{5,5,5,5,5,1,1,5,1,1,1,1,1,1,1,1,5,5,5,5},
			{6,6,6,6,6,1,1,1,1,1,1,1,1,1,1,1,6,6,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,6,6,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,6,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,5,5,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,5,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,5,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,5,1,1,1,1,1,1,6,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,6,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3},
			{3,3,3,3,6,6,6,6,6,5,6,6,6,6,6,6,6,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3}};
		
			
			ArrayList<ArrayList<Integer>> low = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> col = new ArrayList<Integer>();
			
			//配列をクラス配列に変換
			low = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < arr.length; i++){
				col = new ArrayList<Integer>();
				for(int j = 0; j < arr[i].length; j++){
					col.add(arr[i][j]);
				}
				low.add(col);
			}
		
			this.map.low = low;
			this.map.Xadd = -1;
			this.map.Yadd = 25;
			
			this.map.x = 0;
			this.map.y = 128;
			
			this.map.cX = 9;
			this.map.cY = 39;
			this.map.repaint();
		
	}
	
	
	
	public void map2(){
		int [][] arr2 = null;
		arr2 = new int [][]{
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,6,6,6,6,6,6},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,6,6,6,6,5,6,6,6,6,6,6,6,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,1,1,5,5,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,1,1,5,5,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,6,5,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,6,6,5,6,6},
			{3,3,3,3,6,1,1,6,1,1,1,1,1,1,5,1,6,3,3,3,1,6,1,6,5,5,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,5,1,6,3,3,3,1,6,1,6,5,6,6,6},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3,1,6,1,6,5,6,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,6,5,6,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,6,5,6,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,5,5,5,1,1,6,3,3,3,1,6,1,6,5,6,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,5,5,1,1,6,3,3,3,1,6,1,6,5,6,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,6,5,6,1,6},
			{6,6,6,6,6,1,5,1,1,1,1,1,1,1,1,1,6,6,6,6,6,6,6,6,5,6,1,6},
			{5,5,5,5,5,1,1,5,1,1,1,1,1,1,1,1,5,5,5,5,5,5,5,5,5,6,1,6},
			{6,6,6,6,6,1,1,1,1,1,1,1,1,1,1,1,6,6,6,6,6,6,6,6,5,6,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,6,6,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,6,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3,1,6,1,1,5,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,5,5,1,1,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,5,1,1,1,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,1,5,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,1,5,1,1,1,1,1,1,6,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,6,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,6,1,1,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,1,1,1,1,1,1,1,1,1,1,1,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,6,6,6,6,6,5,6,6,6,6,6,6,6,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,1,1,1,1,1,6},
			{3,3,3,3,3,3,3,3,6,5,6,3,3,3,3,3,3,3,3,3,1,6,6,6,6,6,6,6}};
		
			ArrayList<ArrayList<Integer>> low = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> col = new ArrayList<Integer>();
			
			low = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < arr2.length; i++){
				col = new ArrayList<Integer>();
				for(int j = 0; j < arr2[i].length; j++){
					col.add(arr2[i][j]);
				}
				low.add(col);
			}
			
		this.map.low = low;
		this.map.Xadd = -1;
		this.map.Yadd = -5;
		
		this.map.x = 0;
		this.map.y = -160;
		
		this.map.cX = 9;
		this.map.cY = 0;
		this.map.repaint();
	}
	
}
