
public class MyMain 
{
	public static void main(String[] args) 
	{
		MyRectangle rectangle = new MyRectangle();
		rectangle.xUp = 0;
		rectangle.yUp = 2;
		rectangle.xDown = 5;
		rectangle.yDown = 0;
		int w = rectangle.getW();
		int h = rectangle.getH();
		int ar = rectangle.area();
		System.out.println(w);
		System.out.println(h);
		System.out.println(ar);
		String s = rectangle.name();
		System.out.println(s);
	}

}
