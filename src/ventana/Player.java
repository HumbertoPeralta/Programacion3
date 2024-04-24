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
		if(x + w >= t.getX() && x <= t.getX() + t.getW() && y + h >= t.getY() && y <= t.getY() + t.getH()) {
			
			if(x+w> t.getX()&& x < t.getX()) {
				x = t.getX() - w;
			}else if(x<t.getX() + t.getW()&& x > t.getX()) {
				x = t.getX() + t.getW();
			}
			if (y + h > t.getY() && y < t.getY()) {
	            y = t.getY() - h; 
	        }else if (y < t.getY() + t.getH() && y > t.getY()) {
	            y = t.getY() + t.getH(); 
	        }
			
			return true;
		}
		
		return false;
		
	}
	
	public boolean extremos(Player i,Player d) {
		if(x + w >= i.getX() && x <= i.getX() + i.getW() && y + h >= i.getY() && y <= i.getY() + i.getH()) {
			x=d.getX()-30;
			return true;
		}else if(x + w >= d.getX() && x <= d.getX() + d.getW() && y + h >= d.getY() && y <= d.getY() + d.getH()) {
			x=i.getX()+30;
			return true;
		}
		
		return false;
	}

}
