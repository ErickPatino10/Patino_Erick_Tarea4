public class Paciente {
    //Atributos publicos
    public String nombre;
    public String id;
    //Atributos privados
    private  String tipoSeguro;
    private  int edad;
    private double costoConsultas;
    private int numeroConsultas;
    private  int prioridad;

    //Constructor
    public Paciente(String nombre, String id, String tipoSeguro, int edad, double costoConsultas, int numeroConsultas, int prioridad) {
        this.nombre = nombre;
        this.id = id;
        setTipoSeguro(tipoSeguro);
        setEdad(edad);
        setCostoConsultas(costoConsultas);
        setNumeroConsultas(numeroConsultas);
        setPrioridad(prioridad);
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
    if ( edad>0)
        this.edad = edad;
    else
        System.out.println("Edad invalida");
    }

    public double getCostoConsultas() {
        return costoConsultas;
    }

    public void setCostoConsultas(double costoConsultas) {
        if (costoConsultas > 0)
            this.costoConsultas = costoConsultas;
        else
            System.out.println("Costo invalido");
    }

    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0 )
            this.numeroConsultas = numeroConsultas;
        else
            System.out.println("Numero de consultas invalido");
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad <= 5)
            this.prioridad = prioridad;
        else
            System.out.println("Prioridad inválida");
    }

    //Metodos
    public double calcularCostoTotal(){
        return costoConsultas * numeroConsultas;
    }

    public double calcularDescuento() {
    double total = calcularCostoTotal();
        if (tipoSeguro.equals("Basico"))
            return total * 0.10;
        else if (tipoSeguro.equals("Premium"))
            return total * 0.20;
        else
            return 0;
    }

    public double costoFinal() {
        return calcularCostoTotal() - calcularDescuento();
    }

    public String clasificacion() {
        if (prioridad >= 4) {
            return "Alta prioridad";
        } else if (prioridad >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }

    public String mensaje() {
        if (prioridad >= 4) {
            return "Atención inmediata requerida";
        } else if (prioridad >= 2) {
            return "Seguimiento necesario";
        } else {
            return "Control regular";
        }
    }

    public void mostrarReporte() {
        System.out.println("\n----- REPORTE PACIENTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Seguro: " + tipoSeguro);
        System.out.println("Edad: " + edad);
        System.out.println("Consultas: " + numeroConsultas);
        System.out.println("Costo total: " + calcularCostoTotal());
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Costo final: " + costoFinal());
        System.out.println("Clasificación: " + clasificacion());
        System.out.println("Mensaje: " + mensaje());
        System.out.println("========================================");
    }
}
