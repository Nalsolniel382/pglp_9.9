package fr.uvsq.exo9_9;

public class Triangle {
	 private Point p1;
	 private Point p2;
	 private Point p3;
	 private String id;

	 public Triangle(final Point k1, final Point k2,final Point k3, final String nom) {
	        p1 = k1;
	        p2 = k2;
	        p3 = k3;
	        id = nom;
	    }

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public Point getP3() {
		return p3;
	}

	public String getId() {
		return id;
	}
	 public void deplace(final Point k1,final Point k2,final Point k3) {
	       this.p1 = k1;
	       this.p1 = k2;
	       this.p1 = k3;
	    }
	 
	  public String toString() {
	        return "Triangle(centre=" +  p1.toString() + ")";
	    }
	 
}
