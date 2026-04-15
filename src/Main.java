public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Mateo Viera", "Tecnologia", 2850.75, 8, 92);
        vendedor1.mostrarResumen();

        Paciente p = new Paciente("Carlos Pérez", "0102030405", "Premium", 45, 25.50, 3, 4
        );

        p.mostrarReporte();
    }
}