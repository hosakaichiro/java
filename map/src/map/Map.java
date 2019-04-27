package map;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Map extends JPanel implements KeyListener{
	BufferedImage bi;
	BufferedImage bi2;
	BufferedImage bi3;
	BufferedImage bi4;
	BufferedImage bi5;
	BufferedImage bi6;
	File file;
	File file2;
	File file3;
	File file4;
	File file5;
	File file6;
	
	
	int x;
	int y;
	int x1 = 50;
	int y1 = 50;
	int Yadd = 0;
	int Xadd = 0;
	ArrayList<ArrayList<Integer>> low;
	ArrayList<Integer> col;
	//マップの情報が入ったクラス
	MapBox mapBox;
	
	//操作しているキャラクターの情報が入ったクラス
	MainCharacter maincharacter;
	
	int [][] arr;
	JLabel label;
	
	//キャラクターの配列上の座標
	int cX = 10;
	int cY = 10;
	
	//初期フレームのスコープ範囲
	int defaultFrameXMin = 5;
	int defaultFrameXMax = 15;
	int defaultFrameYMin = 5;
	int defaultFrameYMax = 15;
	
	
	Map(){
		setLayout(null);
		setPreferredSize(new Dimension(325,325));
		setBackground(Color.CYAN);
		
		label = new JLabel();
		label.setBounds(0,0,100,120);
		this.add(label);
		
			
		file = new File("C:\\java_pre\\app\\キャラチップ\\pipo-map001\\pipo-map001\\640x480\\pipo-map001_at-tuti.png");
		file2 = new File("C:\\java_pre\\app\\キャラチップ\\キャラチップ\\pipo-charachip001.png");
		file3 = new File("C:\\java_pre\\app\\キャラチップ\\pipo-map001\\pipo-map001\\640x480\\pipo-map001_at-umi.png");
		file4 = new File("C:\\java_pre\\app\\キャラチップ\\海合成キャラ.png");
		file5 = new File("C:\\java_pre\\app\\キャラチップ\\pipo-map001\\pipo-map001\\640x480\\pipo-map001_at-sabaku.png");
		file6 = new File("C:\\java_pre\\app\\キャラチップ\\草原の木.png");
	
		
		try {
			bi =  ImageTool.CuttingImage(file,0,0,32,32);
			bi2 = ImageTool.CuttingImage(file2,0,0,32,32);
			bi3 = ImageTool.CuttingImage(file3,0,128,32,32);
			bi4 = ImageTool.CuttingImage(file4,0,0,32,32);
			bi5 = ImageTool.CuttingImage(file5,0,128,32,32);
			bi6 = ImageTool.CuttingImage(file6,0,0,32,32);
			
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
			
	
		
		mapBox = new MapBox(this);
		
		
		maincharacter = new MainCharacter();
		
		
		this.addKeyListener(this);
		
		
	
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		requestFocusInWindow();
		//第1,2,3,4引数はフレームのどの位置にどのぐらいの大きさで画像を表示するか
		//第5,6,7,8引数は読み込む画像をどのくらいの大きさで表示するか
		
		//System.out.println(bi.getHeight() + "," + bi.getWidth());
		
		int w = bi.getWidth();
		int h = bi.getHeight();
		
		//defaultFrameXMinなどは配列の初期スコープの範囲
		
		for(int i = defaultFrameXMin + Yadd,countY = 0; i < defaultFrameXMax + Yadd; i++){
			for(int j = defaultFrameYMin + Xadd,countX = 0 ; j < defaultFrameYMax + Xadd; j++){
				if(low.get(i).get(j) == 1){
				
					g.drawImage(bi, w * countX, h * countY , this);
				
				}else if(low.get(i).get(j) == 2){
					
					g.drawImage(bi2, w * countX, h * countY , this);
					
				}else if(low.get(i).get(j) == 3){
					g.drawImage(bi3, w * countX, h * countY , this);
					
				}else if(low.get(i).get(j) == 4){
					g.drawImage(bi4, w * countX, h * countY , this);
					
				}else if(low.get(i).get(j) == 5){
					g.drawImage(bi5, w * countX, h * countY , this);
					
				}else if(low.get(i).get(j) == 6){
					g.drawImage(bi6, w * countX, h * countY , this);
					
				}
				countX++;
			}
			
			countY++;
		}
		
		g.drawImage(bi2, (w * 5) + x, (h * 5) + y, this);
		
		//キャラクターの座標とマップチップの種類
		label.setText("<html>"
					+ "X座標:" + cX + "<br>"
					+ "Y座標:" + cY + "<br>"
					+ "MC" + low.get(cY).get(cX) + "<br>"
					+ "FX座標:" + Xadd + "<br>"
					+ "FY座標:" + Yadd + "<br>"
					+"F隅X座標" + x + "<br>"
					+"F隅Y座標" + y );
		
		System.out.println(low.get(0).size());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_DOWN:
			try {
				bi2 = ImageTool.CuttingImage(file2,0,0,32,32);
			} catch (Exception e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			
			
			cY += 1;
			
			//マップの隅（配列エラーになるから最優先）
			if(cY == low.size()){
				if(cY == 40 & cX == 9 ){
					cY -= 1;
					
					mapBox.mapChage();
					break;
				}else{
					cY -= 1;
					break;
	
				}
				
			}
			
			//木
			if(low.get(cY).get(cX) == 6){
				cY -= 1;
				break;
				
			}	
			if(y < 0){
				y += 32;
				repaint();
			
			}else if((Yadd + 5) != low.size()- 10){
				Yadd += 1;
				repaint();
			}else{
				y += 32;
				repaint();
				
			}
			
			break;
			
		case KeyEvent.VK_UP:
			
			try {
				bi2 = ImageTool.CuttingImage(file2,0,96,32,32);
			} catch (Exception e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			
			cY -= 1;
			
			//マップ隅
			if(cY == -1){
				if(cY == -1 & cX == 9){
					cY += 1;
					mapBox.mapChage();
					break;
				}else{
					cY += 1;
					break;
				}
			}
			
			
			//木
			if(low.get(cY).get(cX) == 6){
				cY += 1;
				break;
				
			}
			
			if(y > 0 ){
				y -= 32;
				repaint();
				
			}else if((Yadd + 5) != 0){
			
				Yadd -= 1;
				repaint();
			}else{
				y -= 32;
				repaint();
				
			}
			
			break;
			
		case KeyEvent.VK_RIGHT:
			
			try {
				bi2 = ImageTool.CuttingImage(file2,0,64,32,32);
			} catch (Exception e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			
			
			cX += 1;
			
			//マップ隅（配列の最大値までしか進めない）
			if(cX == low.get(0).size()){
				cX -= 1;
				break;
			}
			
			//木
			if(low.get(cY).get(cX) == 6){
				cX -= 1;
				break;
				
			}
			
			
			
			if(x < 0){
				x += 32;
				repaint();
				
				//-10はスコープの範囲
			}else if((Xadd + 5) != low.get(0).size() -10) {
				
				Xadd += 1;
				repaint();
			}else{
				x += 32;
				repaint();
				
			}
			
			break;
		
		case KeyEvent.VK_LEFT:
			
			try {
				bi2 = ImageTool.CuttingImage(file2,0,32,32,32);
			} catch (Exception e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			
			cX -= 1;
			
			//マップ隅
			if(cX == -1){
				cX += 1;
				break;
			}
			
			//木
			if(low.get(cY).get(cX) == 6){
				cX += 1;
				break;
				
			}
			
			if(x > 0){
				x -= 32;
				repaint();
				
			}else if((Xadd + 5) != 0){
				Xadd -= 1;
				repaint();
			}else{
				x -= 32;
				repaint();
				
			}
			
			break;
		}
		
		System.out.println(low.get(cY).get(cX));
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
