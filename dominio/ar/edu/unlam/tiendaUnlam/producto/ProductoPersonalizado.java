package ar.edu.unlam.tiendaUnlam.producto;

import java.util.ArrayList;

import ar.edu.unlam.tiendaUnlam.enums.Caracteristica;
import ar.edu.unlam.tiendaUnlam.interfaces.Personalizado;

public class ProductoPersonalizado extends Producto implements Personalizado{

	private ArrayList<Caracteristica> caracteristica;

	public ProductoPersonalizado(Integer codigo, String nombre, Double precio, String descripcion, Integer cantidad, ArrayList<Caracteristica> caracteristica) {
		super(codigo, nombre, precio, descripcion, cantidad);
		this.caracteristica=new ArrayList<Caracteristica>();
		
	}

	public ArrayList<Caracteristica> getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(ArrayList<Caracteristica> caracteristica) {
		this.caracteristica = caracteristica;
	}

	
}
