package fr.uvsq.exo9_9;

public class Point {
	private int x;
	private int y;
	
	
	  public Point(final int X, final int Y) {
	        this.x = X;
	        this.y = Y;
	    }
     public Point () {
    	 this.x = 0;
	     this.y = 0;
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
	public void deplace(final int x,final int y) {
	       this.x=x;
	       this.y=y;
	    }
	public String Aff() {
        return "(" + x + "," + y + ")";
    }
}
