package ar.edu.unlam.tiendaUnlam.tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ar.edu.unlam.tiendaUnlam.producto.Producto;

public class Cliente {
	private String nombre;
	private String codigoCliente;
	private List<Producto> carrito;
	
	public Cliente(String nombre, String codigoCliente) {
		this.nombre=nombre;
		this.codigoCliente=codigoCliente;
		this.carrito=new ArrayList<Producto>();
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public List<Producto> getCarrito() {
		return carrito;
	}



	public void setCarrito(List<Producto> carrito) {
		this.carrito = carrito;
	}



	public void agregarProductoAlCarrito(Producto producto) {
		this.carrito.add(producto);
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codigoCliente, other.codigoCliente);
	}



	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", codigoCliente=" + codigoCliente + "]";
	}



	

	

}
