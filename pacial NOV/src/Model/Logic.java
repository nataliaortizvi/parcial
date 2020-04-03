package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	PApplet app;
	LinkedList<Item> items;
	
	AnoItem ano;
	NombreItem nom;
	TipoItem tipo;
	
	String[] txt, txtSplit;
	String nombres, anos,tipos;
	int rating;
	
	

	public Logic(PApplet app) {
		this.app = app;
		this.items = new LinkedList<Item>();
		this.ano = new AnoItem();
		this.nom = new NombreItem();
		this.tipo = new TipoItem();
		
		txt = app.loadStrings("lib/imports/netflix.txt");
		
		cargar();
		
	}
	
	private void cargar() {
		for(int i=0; i < txt.length; i++) {
			txtSplit = txt[i].split(",");
			
			rating = Integer.parseInt(txtSplit[2]);
			nombres = txtSplit[0];
			anos = txtSplit[1];
			tipos = txtSplit[3];
			
			items.add(new Item(nombres, anos, tipos, rating,app));
		}
	}
	
	
	public LinkedList<Item> getItems() {
		return items;
	}

	public void setItems(LinkedList<Item> items) {
		this.items = items;
	}
	
	public void sortList (char i) {
		switch(i) {
		case 'r':
			//ordena rating
			Collections.sort(items);
			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
			break;
		case 'n':
			//ordena nombre
			Collections.sort(items, nom);
			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
			break;
		case 'a':
			//ordena año
			Collections.sort(items, ano);
			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
			break;
		case 't':
			//ordena tipo
			Collections.sort(items, tipo );
			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
			break;
		
		}
			
		
	}
	
	public void imprimir() throws FileNotFoundException {
		
		//se actualiza el mimsmo documento de texto al undir cada tecla
		PrintWriter p = new PrintWriter(new File("lib/exports/txtNuevo.txt"));
		p.print(mensaje());
		p.close();
	}
	
	private String mensaje() {
		String m = "";
		
		for(int i=0; i<items.size(); i++) {
			Item pe = items.get(i);
			
			String mesage = pe.getNom().toUpperCase()+ "," + pe.getAno()+ "," + pe.getTipo()
			+ "," + pe.getRating();
			
			m += mesage + "\n";
		}
		
		return m;
	}
	

	
	
	
	//getter y setters
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public String[] getTxt() {
		return txt;
	}

	public void setTxt(String[] txt) {
		this.txt = txt;
	}

	public String[] getTxtSplit() {
		return txtSplit;
	}

	public void setTxtSplit(String[] txtSplit) {
		this.txtSplit = txtSplit;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public AnoItem getAno() {
		return ano;
	}

	public void setAno(AnoItem ano) {
		this.ano = ano;
	}

	public NombreItem getNom() {
		return nom;
	}

	public void setNom(NombreItem nom) {
		this.nom = nom;
	}

	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getAnos() {
		return anos;
	}

	public void setAnos(String anos) {
		this.anos = anos;
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	
}
