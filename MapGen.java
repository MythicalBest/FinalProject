import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

/**
 * 
 Camden Calandrino
 *
 */
@SuppressWarnings({ "serial", "unused" })
public class MapGen extends JFrame {

	public MapGen(int posx, int posy){
		super("Maze");
		setResizable(false);
		setEnabled(false);
		
		int numRows = 0;
		int numCols = 0;
		String s = "A";
		MyCanvas myCanvas = null; 
		Scanner choice = new Scanner(System.in);
		try{
		Scanner sc = new Scanner( new File("map1"));
		numRows = sc.nextInt();
		numCols = sc.nextInt();
		myCanvas = new MyCanvas(13, 8);
		
		while(sc.hasNext()) {
			
		for(int x = 0; x < numRows; x++) {
			for(int y = 0; y < numCols; y++) {		
				s = sc.next();	
				if(s.equals("A")) {
				myCanvas.addPicture(x, y, "grass.jpg");	
				}
				if(s.equals("B")) {
				myCanvas.addPicture(x, y, "download.jpeg");
				}
				myCanvas.addPicture(posx, posy, "PokemonTrainer.png");	
			}

		}
		
		}
		
		}
		catch(FileNotFoundException E)
		{
		System.out.println("File isn't there.");	
		}

		this.setSize(450, 700);

		if (myCanvas != null){
			getContentPane().add(myCanvas);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	

 
}

@SuppressWarnings("serial")
class MyCanvas extends JPanel{
	private BufferedImage[][] imgs;
	private int rows;
	private int cols;
	private final int tileSize = 64;
	public MyCanvas(int rows, int cols){
		super();
		this.rows = rows;
		this.cols = cols;
		imgs = new BufferedImage[rows][cols];
	}
	public void addPicture(int x, int y, String filename){
				try {
					imgs[x][y] = ImageIO.read(new File(filename));
				} catch (IOException e) {
					System.err.println("Unable to read the file: " + filename);
				}
	}
	public void paint(Graphics g){
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				g.drawImage(imgs[i][j], j*tileSize, i*tileSize, null);
			}
		}
	}
}