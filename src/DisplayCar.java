
public class DisplayCar extends MyFrame {
	public void run() {
		car car1 = new car(10,40,1,0);
		car car2 = new car(30,100,2,0);
		car car3 =new  car(50,160,3,0);
		car car4 =new  car(70,220,4,0);
		car car5 =new  car(90,300,5,0);
		for (int i = 0; i < 30; i++){
			clear();
			car1.draw(this);
			car2.draw(this);
			car3.draw(this);
			car4.draw(this);
			car5.draw(this);
			car1.move();
			car2.move();
			car3.move();
			car4.move();
			car5.move();
			
			sleep(0.1); 
			
		}
		
	}

}
