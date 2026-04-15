public class Vendedor {
    //Atributos publicos
    public String nombre;
    public String area;
    //Atributos Privados
    private double montoVendido;
    private  double porcentajeComision;
    private  double cumplimientoMeta ;

    //Constructor
    public Vendedor(String nombre, String area, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.area = area;
        setMontoVendido(montoVendido);
        setPorcentajeComision(porcentajeComision);
        setCumplimientoMeta(cumplimientoMeta);
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
    if (montoVendido >= 0)
        this.montoVendido = montoVendido;
    else
        System.out.println("Monto invalido. No puede ser negativo");
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        if (porcentajeComision >= 0 && porcentajeComision <= 100)
            this.porcentajeComision = porcentajeComision;
        else
            System.out.println("Error: Comisión inválida");

    }

    public double getCumplimientoMeta() {
        return cumplimientoMeta;
    }

    public void setCumplimientoMeta(double cumplimientoMeta) {
        if (cumplimientoMeta >= 0 && cumplimientoMeta <= 100)
            this.cumplimientoMeta = cumplimientoMeta;
        else
            System.out.println("Error: Cumplimiento inválido");
    }

    //METODOS

    public double calcularComision(){
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal(){
        return montoVendido+calcularComision();
    }

    public String obtenerEstadoCumplimiento(){
        if (cumplimientoMeta>=90)
            return  "Exelente";
        else if (cumplimientoMeta >= 70)
            return "Aceptable";
        else
            return "Bajo";
    }

    public String mensajeDesempenio(){
        if (cumplimientoMeta>=90)
            return  "Vendedor con cumplimiento sobresaliente";
        else if (cumplimientoMeta >= 70)
            return "Vendedor con cumplimiento aceptable";
        else
            return "Se requiere seguimiento comercial";
    }

    void mostrarResumen(){
        System.out.println("\n--- Reporte ---");
        System.out.println("Nombre: "+nombre);
        System.out.println("Area: "+area);
        System.out.println("Monto vendido: "+montoVendido);
        System.out.println("Comision: "+calcularComision());
        System.out.println("Ingreso Total: "+calcularIngresoTotal());
        System.out.println("Estado: "+obtenerEstadoCumplimiento());
        System.out.println("Mensaje: "+mensajeDesempenio());
        System.out.println("========================================");
    }

}
