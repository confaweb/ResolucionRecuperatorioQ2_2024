package ar.edu.unlam.tiendaUnlam.producto;

public class ProductoFisico extends Producto{
	private Double peso;
	private Integer dimension;

	public ProductoFisico(Integer codigo, String nombre, Double precio, String descripcion, Integer cantidad,Double peso,Integer dimension) {
		super(codigo, nombre, precio, descripcion, cantidad);
		this.peso=peso;
		this.dimension=dimension;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getDimension() {
		return dimension;
	}

	public void setDimension(Integer dimension) {
		this.dimension = dimension;
	}

	
	@Override
	public String toString() {
		return "ProductoFisico [peso=" + peso + ", dimension=" + dimension+ super.toString() + "]";
	}
	

}
