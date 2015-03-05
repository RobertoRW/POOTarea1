package clases;

public class Cuenta {
    private static long ultimaCuenta = 100000;

    private long numCuenta;
    private long dni;
    private double saldo;
    private double interes;

    /** Accesores **/
    public long getNumCuenta() {
        return numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    /** Constructores **/
    public Cuenta(long dni, double saldo, double interes) {
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
        numCuenta = ++ultimaCuenta;
    }

    public Cuenta() {
        this(0, 0, 0);
    }

    /** Metodos **/
    public void actualizarSaldo() {
        saldo += saldo * (interes/365/100); // Se asume que el saldo es un porcentaje (8.0 en lugar de 0.08)
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return;
        }

        System.out.println("Saldo insuficiente");
    }

    public void mostarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  "Numero de Cuenta= " + numCuenta +
                ", DNI= " + dni +
                ", Saldo= " + saldo +
                ", Interes= " + interes
                ;
    }
}
