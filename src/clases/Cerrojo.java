package clases;

public class Cerrojo {
    private int primero;
    private int segundo;
    private int tercero;

    private boolean abierto = false;

    public Cerrojo(int primero, int segundo, int tercero) {
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
    }

    // Intenta abrir el cerrojo
    // Retorna el resultado (true si se abrio, false si no)
    public boolean abrir(int primero, int segundo, int tercero) {
        abierto = (this.primero == primero) && (this.segundo == segundo) && (this.tercero == tercero);
        return abierto;
    }

    // Intenta cambiar la combinacion
    // Si el cerrojo esta cerrado no la cambia
    public void cambiarComb(int primero, int segundo, int tercero) {
        if(!abierto) {
            System.out.println("No se puede cambiar la combinacion si el cerrojo esta cerrado");
            return;
        }

        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
    }

    // Cierra el cerrojo
    public void cerrar() {
        abierto = false;
    }

    // Dice si esta abierto (true) o cerrado (false)
    public boolean isAbierto() {
        return abierto;
    }
}
