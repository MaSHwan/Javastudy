package com.swingex;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {
	int korean, eng, math;
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);
		for(int cnt = 1; cnt < 11; cnt++) {
			g.drawString(cnt*10 + "", 25, 225-20*cnt);
			g.drawLine(50, 250-20 * cnt, 350, 250-20*cnt);
		}
		
		g.drawLine(50, 20, 50, 250);
		g.drawString("국어", 100, 270);
		g.drawString("영어", 200, 270);
		g.drawString("수학", 300, 270);
		
		g.setColor(Color.red);
		
		if(korean > 0)
			g.fillRect(110, 250 - korean*2, 10, korean*2);
		if(eng > 0)
			g.fillRect(210, 250 - eng*2, 10, eng*2);
		if(math > 0)
			g.fillRect(310, 250 - math*2, 10, math*2);
	}
	
	public void setScores(int korean, int eng, int math) {
		this.korean = korean;
		this.eng = eng;
		this.math = math;
	}
}
