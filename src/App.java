public class App {
    public static void main(String[] args) throws Exception {
        AreaGeografica a1 = new AreaGeografica(10, "arenoso", "Parque do ibirapuera");
        AreaGeografica a2 = new AreaGeografica(200, "deserto", "Acopiara - CE");
        AreaGeografica a3 = new AreaGeografica(2023, "rochoso", "Casinhas");

        FenomenoClimatico f1 = new FenomenoClimatico("Furacão", 5, 2);
        FenomenoClimatico f2 = new FenomenoClimatico("Tempestade", 7, 2);
        FenomenoClimatico f3 = new FenomenoClimatico("Ciclone", 10, 20);

        Trabalhador t1 = new Trabalhador("Bruno Lixo", 24, "Supervisor");
        Trabalhador t2 = new Trabalhador("kilmer", 20, "estagiario");

        Relatorio r1 = new Relatorio();

        f1.addArea(a1);
        f1.addArea(a2);
        f2.addArea(a3);
        f3.addArea(a3);
        f3.addArea(a1);

        t2.addFenomeno(f1);
        t2.addFenomeno(f2);
        t2.addFenomeno(f3);
        t1.addFenomeno(f1);
        t1.addFenomeno(f2);

        r1.addFenomenoClimatico(f1);
        r1.gerarRelatorio();

    }
}