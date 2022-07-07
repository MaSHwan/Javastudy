package com.swingex;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class HorseMain extends JFrame implements Runnable {

	private Canvas can;
	private Image buffer;
	private Image[] horse;
	private boolean bRepeat = true;

	public HorseMain() {
		initHorse();
		this.add(can = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(buffer, 0, 0, this);
			}
			public void update(Graphics g) {
				paint(g);
			}
		});
		
		
		can.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch(code) {
				case KeyEvent.VK_SPACE:
					bRepeat = !bRepeat;
					if(bRepeat)
						makeThread();
					break;
				}
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		pack();
		setBounds(300, 100, 400, 400);
		setVisible(true);
		makeThread();
	}

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < horse.length; i++) {
				if (!bRepeat)
					return;

				try {
					Thread.sleep(50);
				} catch (InterruptedException ie) {

				}
				bufferPaint(i);
			}
		}
	}

	public void makeThread() {
		new Thread(this).start();
	}

	public void initHorse() {
		horse = new Image[11];

		for (int i = 0; i < horse.length; i++) {
			horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("C:\\Users\\USER\\Downloads\\images/black%02d.png", i + 1));
		}
	}

	public void bufferPaint(int n) {
		buffer = createImage(can.getWidth(), can.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		buffer_g.drawImage(horse[n], 50, 50, this);
		can.repaint();
	}

	public static void main(String[] args) {
		new HorseMain();
	}
}
