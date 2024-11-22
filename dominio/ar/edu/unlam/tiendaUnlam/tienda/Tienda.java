package ar.edu.unlam.tiendaUnlam.tienda;

import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.tiendaUnlam.enums.Caracteristica;
import ar.edu.unlam.tiendaUnlam.exceptions.ProductoNoEncontradoException;
import ar.edu.unlam.tiendaUnlam.exceptions.ProductoNoSoportadoException;
import ar.edu.unlam.tiendaUnlam.producto.Producto;
import ar.edu.unlam.tiendaUnlam.producto.ProductoPersonalizado;

public class Tienda {
	
	private Set <Producto>productos;
	public Tienda() {
		this.productos=new TreeSet<Producto>();
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public Boolean agregarProducto(Producto producto) {
		Boolean productoAgregado=this.productos.add(producto);
		return productoAgregado;
		// TODO Auto-generated method stub
		
	}

	public void agregarCaracteristicaAProducto(Producto productoPersonalizado,
			Caracteristica logoPersonal) throws ProductoNoSoportadoException, ProductoNoEncontradoException {
		if(!(logoPersonal instanceof Caracteristica))
			throw new ProductoNoSoportadoException("La caracteristica no Existe");
		else if (!(productoPersonalizado instanceof ProductoPersonalizado))
				throw new ProductoNoEncontradoException("El producto no se existe en la tienda");
		
			((ProductoPersonalizado) productoPersonalizado).getCaracteristica().add(logoPersonal);
		
	}

}

