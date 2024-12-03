import java.util.ArrayList;

public class Trabalhador {
    private String nome;
    private int idade;
    private String cargo;
    private ArrayList<FenomenoClimatico> fenomenosMonitorados;

    public Trabalhador(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.fenomenosMonitorados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<FenomenoClimatico> getFenomenosMonitorados() {
        return fenomenosMonitorados;
    }

    public void setFenomenosMonitorados(ArrayList<FenomenoClimatico> fenomenosMonitorados) {
        this.fenomenosMonitorados = fenomenosMonitorados;
    }

    public void addFenomeno(FenomenoClimatico fenomeno) {
        if (cargo.equalsIgnoreCase("estagiario") && fenomenosMonitorados.size() >= 2) {
            System.out.println("Estagiários só podem monitorar até 2 fenômenos, " + nome + " já monitora 2 fenômenos.");
        } else {
            fenomenosMonitorados.add(fenomeno);
            System.out.println("Fenômeno " + fenomeno.getNome() + " adicionado para " + nome);
        }
    }

    public void criarRelatorio() {
        if (!fenomenosMonitorados.isEmpty()) {
            Relatorio relatorio = new Relatorio();
            relatorio.setFenomenosClimaticos(fenomenosMonitorados);
            System.out.println("-------------------------------------------------");
            System.out.println("Monitorador: " + nome);
            relatorio.gerarRelatorio();
        } else {
            System.out.println("Não há fenomenos sendo monitorados por: " + nome);
        }
    }
}
