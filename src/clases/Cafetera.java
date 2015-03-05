package clases;

public class Cafetera {
    private int _capacidadMaxima;
    private int _cantidadActual;

    /** Constructores **/
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        _cantidadActual = cantidadActual;
        _capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    public Cafetera() {
        this(1000, 0);
    }

    /** Accesores **/
    public int get_capacidadMaxima() {
        return _capacidadMaxima;
    }

    public void set_capacidadMaxima(int _capacidadMaxima) {
        this._capacidadMaxima = _capacidadMaxima;
    }

    public int get_cantidadActual() {
        return _cantidadActual;
    }

    public void set_cantidadActual(int _cantidadActual) {
        this._cantidadActual = _cantidadActual;
    }

    /** Metodos **/
    public void llenarCafetera() {
        _cantidadActual = _capacidadMaxima;
    }

    public void servirTaza(int tamanoTaza) {
        _cantidadActual -= Math.min(tamanoTaza, _cantidadActual);
    }

    public void vaciarCafetera() {
        _cantidadActual = 0;
    }

    // Agrega la cantidad de cafe indicada
    // Si se intenta agregar mas que la capacidad maxima solamente se agrega hasta el maximo
    public void agregarCafe(int cantidad) {
        _cantidadActual = Math.min(_capacidadMaxima, _cantidadActual + cantidad);
    }
}
