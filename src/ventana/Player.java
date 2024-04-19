package ventana;

public class Player {

	int x;
	int y;
	int w;
	int h;
	String color;
	
	public Player() {
		
	}
	
	public Player(int x,int y,int w,int h,String color ) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.color=color;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean seTocan(Player t) {
		if( x + w >= t.getX() && x <= t.getX() + t.getW()&& y + h >= t.getY()) {
			
			if(x+w> t.getX()&& x < t.getX()) {
				x = t.getX() - w;
			}else if(x<t.getX() + t.getW()&& x > t.getX()) {
				x = t.getX() + t.getW();
			}
			
			
			return true;
		}
		
		
		
		return false;
	}

}
