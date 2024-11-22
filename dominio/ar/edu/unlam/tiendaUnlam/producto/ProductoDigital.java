package ar.edu.unlam.tiendaUnlam.producto;

public class ProductoDigital extends Producto{

	private String tipoDeArchivo;
	private Integer tamanio;

	public ProductoDigital(Integer codigo, String nombre, Double precio, String descripcion, Integer cantidad,String tipoDeArchivo,Integer tamanio) {
		super(codigo, nombre, precio, descripcion, cantidad);
		this.tipoDeArchivo=tipoDeArchivo;
		this.tamanio=tamanio;
	}

	public String getTipoDeArchivo() {
		return tipoDeArchivo;
	}

	public void setTipoDeArchivo(String tipoDeArchivo) {
		this.tipoDeArchivo = tipoDeArchivo;
	}

	public Integer getTamanio() {
		return tamanio;
	}

	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "ProductoDigital [tipoDeArchivo=" + tipoDeArchivo + ", tamanio=" + tamanio + ", getCodigo()="
				+ getCodigo() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio() + ", getDescripcion()="
				+ getDescripcion() + ", getCantidad()=" + getCantidad() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	

}
