package ar.edu.unlam.pruebasTiendaUnlam;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import ar.edu.unlam.tiendaUnlam.enums.Caracteristica;
import ar.edu.unlam.tiendaUnlam.exceptions.ProductoNoEncontradoException;
import ar.edu.unlam.tiendaUnlam.exceptions.ProductoNoSoportadoException;
import ar.edu.unlam.tiendaUnlam.producto.ProductoDigital;
import ar.edu.unlam.tiendaUnlam.producto.ProductoFisico;
import ar.edu.unlam.tiendaUnlam.producto.ProductoPersonalizado;
import ar.edu.unlam.tiendaUnlam.tienda.Cliente;
import ar.edu.unlam.tiendaUnlam.tienda.Tienda;

public class TiendaTest {

    @Test
    public void queSePuedaCrearUnProductoFisico() {
        ProductoFisico productoFisico = new ProductoFisico(15, "Camiseta", 45.0, "Camiseta de Futbol de River", 10, 0.5, 500);
        assertNotNull(productoFisico);
    }

    @Test
    public void queSePuedaCrearUnProductoDigital() {

        ProductoDigital productoDigital = new ProductoDigital(1, "Libro electrónico", 9.99,"El Señor de los anillos 2", 20, "PDF", 500);
        
        new ProductoDigital(2, "Curso de programación en Python", 49.99, "Aprende a programar desde cero", 100, "MP4", 2000);
        new ProductoDigital(3, "Álbum: Música para relajarse", 7.99, "10 canciones instrumentales", 50, "MP3", 150);
        new ProductoDigital(4, "Juego: Pixel Adventure", 14.99, "Explora un mundo pixelado lleno de aventuras", 30, "EXE", 500);
        new ProductoDigital(5, "App: Organizador de tareas", 2.99, "Gestiona tus tareas diarias", 1000, "APK", 10);
        new ProductoDigital(6, "Fuente: Script Elegant", 19.99, "Fuente con estilo caligráfico", 20, "OTF", 2);
        new ProductoDigital(7, "Plantilla: Diseño de sitio web", 24.99, "Crea tu sitio web en minutos", 50, "FIG", 5);
        new ProductoDigital(9, "Libro: Introducción a la inteligencia artificial", 29.99, "Explora los conceptos básicos de la IA", 80, "EPUB", 300);
        new ProductoDigital(10, "Suscripción: Plataforma de streaming", 9.99, "Accede a miles de películas y series", 1, "LINK", 1);
        
        assertNotNull(productoDigital);
    }

    @Test
    public void queSePuedaCrearUnProductoPersonalizado() {
    	
        ProductoPersonalizado productoPersonalizado = new ProductoPersonalizado(1, "Tarta personalizada", 35.0, "Tarta personalizada Chocolate de cumpleaños", 10, new ArrayList<>());
        ProductoPersonalizado tarta = new ProductoPersonalizado(2, "Tarta personalizada", 35.0, "Tarta de cumpleaños con diseño personalizado", 10, new ArrayList<>());
        ProductoPersonalizado taza = new ProductoPersonalizado(3, "Taza personalizada", 15.0, "Taza de cerámica con foto", 20, new ArrayList<>());
        ProductoPersonalizado camiseta = new ProductoPersonalizado(4, "Camiseta personalizada", 20.0, "Camiseta de algodón orgánico con diseño personalizado", 30, new ArrayList<>());
        ProductoPersonalizado almohada = new ProductoPersonalizado(5, "Almohada personalizada", 25.0, "Almohada de microfibra con foto", 15, new ArrayList<>());
        ProductoPersonalizado joya = new ProductoPersonalizado(6, "Joyería personalizada", 50.0, "Collar con nombre grabado", 10, new ArrayList<>());
        ProductoPersonalizado funda = new ProductoPersonalizado(7, "Funda de teléfono personalizada", 12.0, "Funda de silicona con diseño personalizado", 50, new ArrayList<>());
        ProductoPersonalizado puzzle = new ProductoPersonalizado(8, "Puzzle personalizado", 30.0, "Puzzle de 1000 piezas con foto personalizada", 15, new ArrayList<>());
        ProductoPersonalizado libro = new ProductoPersonalizado(9, "Libro personalizado", 40.0, "Libro de cuentos personalizado con el nombre del niño", 8, new ArrayList<>());
        ProductoPersonalizado poster = new ProductoPersonalizado(10, "Póster personalizado", 22.0, "Póster enmarcado con diseño personalizado", 20, new ArrayList<>());
        ProductoPersonalizado caja = new ProductoPersonalizado(11, "Caja de regalo personalizada", 18.0, "Caja de madera con grabado personalizado", 15, new ArrayList<>());
        assertNotNull(productoPersonalizado);
    }

    @Test
    public void queSePuedanIncorporarDistintosProductosALaTienda() {
        Tienda tienda = new Tienda();
        ProductoFisico productoFisico = new ProductoFisico(10, "Camiseta", 45.0, "Camiseta de Futbol de River", 10, 0.5, 500);
        ProductoDigital productoDigital = new ProductoDigital(4, "Juego: Pixel Adventure", 14.99, "Explora un mundo pixelado lleno de aventuras", 30, "EXE", 500);
        ProductoDigital productoDigital1 = new ProductoDigital(10, "Juego: Pixel Adventure", 14.99, "Explora un mundo pixelado lleno de aventuras", 30, "EXE", 500);
        ProductoPersonalizado almohada = new ProductoPersonalizado(5, "Almohada personalizada", 25.0, "Almohada de microfibra con foto", 15, new ArrayList<>());
        ProductoPersonalizado joya = new ProductoPersonalizado(6, "Joyería personalizada", 50.0, "Collar con nombre grabado", 10, new ArrayList<>());
        ProductoPersonalizado funda = new ProductoPersonalizado(7, "Funda de teléfono personalizada", 12.0, "Funda de silicona con diseño personalizado", 50, new ArrayList<>());
        ProductoPersonalizado puzzle = new ProductoPersonalizado(8, "Puzzle personalizado", 30.0, "Puzzle de 1000 piezas con foto personalizada", 15, new ArrayList<>());
        ProductoPersonalizado libro = new ProductoPersonalizado(9, "Libro personalizado", 40.0, "Libro de cuentos personalizado con el nombre del niño", 8, new ArrayList<>());
        ProductoPersonalizado poster = new ProductoPersonalizado(10, "Póster personalizado", 22.0, "Póster enmarcado con diseño personalizado", 20, new ArrayList<>());
        ProductoPersonalizado caja = new ProductoPersonalizado(11, "Caja de regalo personalizada", 18.0, "Caja de madera con grabado personalizado", 15, new ArrayList<>());
        tienda.agregarProducto(productoFisico);
        tienda.agregarProducto(productoDigital);
        tienda.agregarProducto(productoDigital1);
        tienda.agregarProducto(almohada);
        tienda.agregarProducto(joya);
        tienda.agregarProducto(funda);
        tienda.agregarProducto(puzzle);
        tienda.agregarProducto(libro);
        tienda.agregarProducto(poster);
        tienda.agregarProducto(caja);
        
        assertEquals(8, tienda.getProductos().size());
    }

    
    @Test
    public void queSePuedaAgregarUnProductoAlCarritoDeUnCliente() {
        // Crear un producto y un cliente
        ProductoFisico producto = new ProductoFisico(10, "Camiseta", 45.0, "Camiseta de Futbol de River", 10, 0.5, 500);
        ProductoPersonalizado libro = new ProductoPersonalizado(9, "Libro personalizado", 40.0, "Libro de cuentos personalizado con el nombre del niño", 8, new ArrayList<>());
        ProductoPersonalizado poster = new ProductoPersonalizado(12, "Póster personalizado", 22.0, "Póster enmarcado con diseño personalizado", 20, new ArrayList<>());
        ProductoPersonalizado caja = new ProductoPersonalizado(11, "Caja de regalo personalizada", 18.0, "Caja de madera con grabado personalizado", 15, new ArrayList<>());
        Cliente cliente = new Cliente("Juan", "12345678");

        // Agregar el producto al carrito
        cliente.agregarProductoAlCarrito(producto);
        cliente.agregarProductoAlCarrito(libro);
        cliente.agregarProductoAlCarrito(poster);
        cliente.agregarProductoAlCarrito(caja);

        // Verificar que el carrito tenga un producto
        assertEquals(4, cliente.getCarrito().size());
    }

//    @Test
//    public void queUnProductoPersonalizadoPuedeAgregarCaracteristicas() {
//    	Tienda tienda = new Tienda();
//    	
//        ProductoPersonalizado productoPersonalizado = new ProductoPersonalizado(6, "Joyería personalizada", 50.0, "Collar con nombre grabado", 10, new ArrayList<>());
//        tienda.agregarProducto(productoPersonalizado);
//        
//        try {
//			tienda.agregarCaracteristicaAProducto(productoPersonalizado, Caracteristica.LOGO_PERSONAL);
//			tienda.agregarCaracteristicaAProducto(productoPersonalizado, Caracteristica.COLOR_AZUL);
//	        tienda.agregarCaracteristicaAProducto(productoPersonalizado, Caracteristica.GRABADO);
//		} catch (ProductoNoEncontradoException e) {
//			assertTrue(false);
//		} catch (ProductoNoSoportadoException e) {
//			assertTrue(false);
//		}
//        
//        assertEquals(3, productoPersonalizado.getCaracteristica().size());
//    }
    @Test
    public void queUnProductoPersonalizadoPuedeAgregarCaracteristicas() throws ProductoNoEncontradoException, ProductoNoSoportadoException {
    	Tienda tienda = new Tienda();
    	
        ProductoPersonalizado productoPersonalizado = new ProductoPersonalizado(6, "Joyería personalizada", 50.0, "Collar con nombre grabado", 10, new ArrayList<>());
        tienda.agregarProducto(productoPersonalizado);
        
        tienda.agregarCaracteristicaAProducto(productoPersonalizado, Caracteristica.LOGO_PERSONAL);
		tienda.agregarCaracteristicaAProducto(productoPersonalizado, Caracteristica.COLOR_AZUL);
		tienda.agregarCaracteristicaAProducto(productoPersonalizado, Caracteristica.GRABADO);
        
        assertEquals(3, productoPersonalizado.getCaracteristica().size());
    }

    @Test
    (expected=ProductoNoSoportadoException.class)
    public void queUnProductoFisicoNoPuedaAgregarCaracteristicas() {
    	Tienda tienda = new Tienda();
    	ProductoFisico productoFisico = new ProductoFisico(4, "Camiseta", 45.0, "Camiseta de Futbol de River", 10, 0.5, 500);
    	ProductoDigital productoDigital = new ProductoDigital(9, "Libro: Introducción a la inteligencia artificial", 29.99, "Explora los conceptos básicos de la IA", 80, "EPUB", 300);
    	tienda.agregarProducto(productoFisico);
    	tienda.agregarProducto(productoDigital);
        
       
    }
//
//    @Test
//    public void obtenerListadoDeProductosFisicosOrdenadosPorDimension() {
//        // Implementar la lógica para ordenar los productos físicos por dimensión
//
//    }
//
//    @Test
//    public void obtenerListadoDeProductosDigitalesOrdenadosPorFormato() {
//        // Implementar la lógica para ordenar los productos digitales por formato
//    }
//
//    @Test
//    public void obtenerListadoDeProductosPersonalizadosCantidadDeCaracteristicas() {
//        // Implementar la lógica para obtener la cantidad de características de cada producto personalizado
//    }
}