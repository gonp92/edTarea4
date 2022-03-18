package cuentas;
/**
 * Esta clase es la clase CCuenta que permite conocer el saldo de la cuenta, el nombre
 * del propietario e ingresar y retirar cantidades de saldo.
 * 
 * @author Gonzalo Paniagua
 * @version 2.0
 * @since 1.0
 * 
 * 
 */
public class CCuenta {
	 private String nombre;
	    private String cuenta;
	    private double saldo;	    
	    private double tipoInteres;
/**
 * Este es el constructor por defecto
 */
	    public CCuenta()
	    {
	    }
/**
 * Este constructor introduce los siguientes parametros
 * @param nom - nombre del propietario de la cuenta
 * @param cue-numero de cuenta
 * @param sal-saldo
 * @param tipo-tipo de interes
 */
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }
/**
 * @return devuelve el saldo de la cuenta
 */
	    public double estado()
	    {
	        return saldo;
	    }
/**
 * Este metodo permite ingresar saldo en la cuenta
 * @param cantidad-cantidad a ingresar
 * @throws Exception -si la cantidad es menor que cero lanza la excepcion:"No se puede ingresar una cantidad negativa"
 */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }
/**
 * 
 * @param cantidad-cantidad a retirar
 * @throws Exception -si la cantidad es menor o igual que 0 lanza la excepcion: "No se puede retirar una cantidad negativa" y si el saldo es menor que la cantidad a retirar lanza la excecion:"No hay suficiente saldo"
 */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }
/**
 * 
 * @return devulve saldo
 */
	    private double getSaldo() {
			return saldo;
		}

		private void setSaldo(double saldo) {
			this.saldo = saldo;
		}
/**
 * 
 * @return devuelve la cuenta
 */
		private String getCuenta() {
			return cuenta;
		}

		private void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
/**
 * 
 * @return devuelve el nombre
 */
		
		private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

}
