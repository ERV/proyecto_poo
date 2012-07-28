package dominio;
import org.joda.time.LocalDate;

public class Transaccion {
	public enum Estado {NUEVO, ANULADA, CANCELADA}	
	
	private String concepto;	
	private int numero;
	private LocalDate fechaEmision;
	private String empresa;
	private double subtotal;
	private double igv;
	private double total;
	private String moneda;
	private LocalDate fechaVencimiento;
	private LocalDate fechaPago;
	private dominio.Venta.Estado estado;
	private String observaciones;	
	
	
}
