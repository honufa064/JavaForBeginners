
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
			  //5-2
				   while(y <= 200) {
				    //①画面を消す
			 	clear();
					//②四角形を表示する
			   setColor(0,128,0);
				   fillRect(x,y,10,100);
				   x += 5;
				   y += 5;
				   sleep(0.1);
				  }
			     while(x >= 30) {
				//①画面を消す
				    clear();
					//②四角形を表示する
				 	setColor(0,128,0);
			 	fillRect(x,y,10,100);
				 	x -= 5;
				 	sleep(0.1);
				 }
			      while(y >= 100) {
					//①画面を消す
				 	clear();
					//②四角形を表示する
				 	setColor(0,128,0);
				 	fillRect(x,y,10,100);
				 	x += 5;
				    y -= 5;
			 	sleep(0.1);
				 }
			    while(x >= 30) {
					//①画面を消す
				 	clear();
					//②四角形を表示する
				 	setColor(0,128,0);
				    fillRect(x,y,10,100);
				 	x -= 5;
				 	sleep(0.1);
			     }
				
			 	
				for (int i = 0; i < 3; i++) {
			   // → 右へ進む
			    for (; x <= 300; x += 5) {
		        clear();
		       setColor(0, 128, 0);
		        fillRect(x, y, 10, 100);
			        sleep(0.1);
			    }
	 
			    //← 左へ戻る
		    for (; x >= 30; x -= 5) {
		        clear();
		        setColor(0, 128, 0);
		        fillRect(x, y, 10, 100);
		        sleep(0.1);
			    
			}
	 
		   }
		
		
		}
	}

}
