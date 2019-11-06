package firstPackage;

public class AbstractClassExample {
	
	
	public static void main(String[] args) {
	Iphone7 obj = new Iphone7();
		

		
	}
	
	public static void show(Phone obj) {
		obj.call();
		obj.camera();
		obj.musicPlayer();

		 
	}
	

}

abstract class Phone{
	
	public void call() {
		System.out.println("Calling..");
	}
	
	abstract void camera();
	abstract void musicPlayer();
	 
	
}


class Samsung extends Phone{

 @Override
public void call() {
	 System.out.println("Calling from Samsung");
 }
 
 
	@Override
	void camera() {
		System.out.println("Camera from Samsung");
		
	}

	@Override
	void musicPlayer() {
		// TODO Auto-generated method stub
		
	}	 
	
	
}


abstract class Iphone extends Phone{
 

 @Override
public void call() {
	 System.out.println("Calling from Iphone");
 }

@Override
void camera() {
	System.out.println("Camera from Iphone");
	
}

@Override
void musicPlayer() {
	System.out.println("MusicPlayer from Iphone");
	
}

abstract void message();
 
}


class Iphone7 extends Phone{

	@Override
	void musicPlayer() {
		System.out.println("MusicPlayer from Iphone7");
		
	}


	 
	  void message() {
		// TODO Auto-generated method stub
		System.out.println("Message from Iphone7..");
		
	}


	@Override
	void camera() {
		// TODO Auto-generated method stub
		
	}
	
}
