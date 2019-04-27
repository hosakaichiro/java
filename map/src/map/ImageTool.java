//ファイルを読み込み、サイズ変更したイメージを返す

package map;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageTool {

	public static BufferedImage CuttingImage(File file,int x,int y, int w,int h) throws Exception{
		
		//ファイルを読み込みイメージに変換
		BufferedImage mainImage = ImageIO.read(file);
		
		//読み込んだイメージを指定の値で切り取り
		//新しいイメージを作成
		BufferedImage subImage = mainImage.getSubimage(x, y, w, h);
		
		return subImage;
	}
	
}
