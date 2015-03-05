package clases;

public class Empleado {
    private int id = 0;
    private int sueldo = 0;
    private double impuesto = 0;
    private double horasExtra = 0;
    private int horasExtraRealizadas = 0;
    private boolean casado = false;
    private int numHijos = 0;

    /** Constructores **/
    public Empleado(int id) {
        this.id = id;
    }

    public Empleado() {}

    /** Accesores **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getHorasExtraRealizadas() {
        return horasExtraRealizadas;
    }

    public void setHorasExtraRealizadas(int horasExtraRealizadas) {
        this.horasExtraRealizadas = horasExtraRealizadas;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /** Metodos **/
    public double calcularHorasExtra() {
        return horasExtra * horasExtraRealizadas;
    }

    public double calcularSalarioBruto() {
        return sueldo + calcularHorasExtra();
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularRetencion();
    }

    public double calcularRetencion() {
        int deduccion = (casado) ? 2 : 0;
        deduccion += numHijos;

        return calcularSalarioBruto() * ((impuesto - deduccion) / 100);
    }

    public void printAll() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String estado = (casado) ? "Casado" : "Soltero";
        return  "ID= " + id +
                ", Sueldo Base= " + sueldo +
                ", Impuesto= " + impuesto +
                ", Pago por Horas Extra= " + horasExtra +
                ", Horas Extra Realizadas= " + horasExtraRealizadas +
                ", Estado Civil= " + estado +
                ", Numero de Hijos= " + numHijos +
                ", Pago por Horas Extra= " + calcularHorasExtra() +
                ", Retencion de Impuestos= " + calcularRetencion() +
                ", Salario Bruto= " + calcularSalarioBruto() +
                ", Salario Neto= " + calcularSalarioNeto()
                ;

    }
}
