public class App {
    public static void main(String[] args) throws Exception {
        FenomenoClimatico f1 = new FenomenoClimatico("Furacão", 5, 2, 4300);
        FenomenoClimatico f2 = new FenomenoClimatico("Tempestade", 5, 2, 4300);
        AreaGeografica a1 = new AreaGeografica(10, "arenoso", "Parque do ibirapuera");
        Relatorio r1 = new Relatorio(a1);

        f1.calculoEscala();
        f1.printaFenomenoClimatico();
        a1.printaAreaGerografica();
        r1.addFenomenoClimatico(f1);
        r1.addFenomenoClimatico(f2);
        r1.gerarRelatorio();
    }
}
