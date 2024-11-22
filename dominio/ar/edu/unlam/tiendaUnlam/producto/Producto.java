package ar.edu.unlam.tiendaUnlam.producto;

import java.util.Objects;

public abstract class Producto implements Comparable<Producto>{
	private Integer codigo;
	private String nombre;
	private Double precio;
	private String descripcion; 
	private Integer cantidad;
	public Producto(Integer codigo, String nombre, Double precio, String descripcion, Integer cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.codigo.compareTo(o.codigo);
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + ", cantidad=" + cantidad + "]";
	}
	
	

}
