public class Main {
    public static void main(String[] args) {
        //Objeto vendedor
        Vendedor vendedor1 = new Vendedor("Mateo Viera", "Tecnologia", 2850.75, 8, 92);
        //Lamo al metodos
        vendedor1.mostrarResumen();
        //Objeto Paciente
        Paciente p = new Paciente("Carlos Pérez", "0102030405", "Premium", 45, 25.50, 3, 4);
        //Llamo al metodo
        p.mostrarReporte();
    }
}