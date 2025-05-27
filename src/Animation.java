
public class Animation extends MyFrame {
	public void run( ) {
		int y=100; 
		int x=30;
		
			while(y>=60) {
			//画面を消す
			clear();
			//(2)四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y-=5;
			
		sleep(0.1);
		}
		while (x<=170) {
			//画面を消す
			clear();
			//(2)四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep (0.1);
			
		
		
		}
	}

}
