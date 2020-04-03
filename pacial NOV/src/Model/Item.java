package Model;

import processing.core.PApplet;

public class Item implements Comparable<Item>{
	private int px, py, rating;
	private String nom, ano, tipo;
	private PApplet app;
	
	public Item (String nom, String ano, String tipo, int rating, PApplet app) {
		this.app = app;
		this.px = 200;
		
		this.nom = nom;
		this.ano = ano;
		this.tipo = tipo;
		this.rating = rating;
	}
	
	public void pintar(int py, PApplet app) {
		app.fill(250);
		
		app.text(this.nom,px,py);
		app.text(this.ano,px+100,py);
		app.text(this.rating,px+150,py);
		app.text(this.tipo,px+200,py);
		
		app.fill(355,0,0);
		app.textSize(35);
		app.text("NETFLIX", 15,45);
		
		app.fill(250);
		app.textSize(12);
		app.text("Organizar por Rating: oprimir tecla r", 250,20);
		app.text("Organizar por Nombre: oprimir tecla n", 250, 35);
		app.text("Organizar por Tipo: oprimir tecla t", 250,50);
		app.text("Organizar por Año: oprimir tecla a", 250,65);
		
	}
	
	public int compareTo(Item o) {
		return this.rating - o.getRating();
	}
	
	
	
	
//getters y setters
	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	
	

}
