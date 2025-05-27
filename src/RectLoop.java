
public class RectLoop extends MyFrame {
	public void run() {
		int x =30;
		int rbg =0;
		for (int i=0;i<9;i++) {
			
			rbg +=20;
			setColor(rbg,rbg,rbg);
		 fillRect(i,100,10,100);
			
			}
		
		x+=15;
		
	}

}
