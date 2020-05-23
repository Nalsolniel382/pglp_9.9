package fr.uvsq.exo9_9;

public class Carre {
	
	private Point p;
	private int taille;
	private String id;

	public Carre(final Point p, final int t, final String nom) {
        this.p = p;
        taille = t;
        id = nom;
    }
	public void deplace(final Point k) {
	       p = k;
	    }
	
	
	public void setP(Point p) {
		this.p = p;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Point getP() {
		return p;
	}
	
	
	 public String aff() {
	        return "Carre " + p.toString() + " " + taille;
	    }
}
