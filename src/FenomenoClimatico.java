
public class FenomenoClimatico {
    private String nome;
    private double intensidade;
    private double duracao;
    private double areaAfetada;
    
    public FenomenoClimatico(String nome, double intensidade, double duracao, double areaAfetada) {
        this.nome = nome;
        this.intensidade = intensidade;
        this.duracao = duracao;
        this.areaAfetada = areaAfetada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getAreaAfetada() {
        return areaAfetada;
    }

    public void setAreaAfetada(double areaAfetada) {
        this.areaAfetada = areaAfetada;
    }

    public void calculoEscala() {
        String escala = "";

        if (areaAfetada <= 2 ) {
            escala = "Micro";
        }else if (areaAfetada <= 20) {
            escala = "Meso";
        }else if (areaAfetada <= 2000) {
            escala = "Sinotico";
        }else {
            escala = "Global";
        }

        System.out.println(escala);
    }

    public void printaFenomenoClimatico() {
        System.out.println("Nome: "+nome);
        System.out.println("Intesidade: "+intensidade);
        System.out.println("Duração (em min): "+duracao);
        System.out.println("Area afetada (em km²): "+areaAfetada);
    }
}
