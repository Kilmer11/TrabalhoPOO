import java.util.ArrayList;

public class FenomenoClimatico implements Monitoravel{
    private String nome;
    private double intensidade;
    private double duracao;
    private ArrayList<AreaGeografica> areasAfetadas;
    
    public FenomenoClimatico(String nome, double intensidade, double duracao) {
        areasAfetadas = new ArrayList<AreaGeografica>();
        this.nome = nome;
        this.intensidade = intensidade;
        this.duracao = duracao;
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

    public ArrayList<AreaGeografica> getAreasAfetadas() {
        return areasAfetadas;
    }

    public void setAreasAfetadas(ArrayList<AreaGeografica> areasAfetadas) {
        this.areasAfetadas = areasAfetadas;
    }

    public void addArea(AreaGeografica area){
        if(areasAfetadas.contains(area)){
           System.out.println("A área já foi adicionada"); 
        }
        areasAfetadas.add(area);
    }

    public void calcularEscala() {
        String escala = "";
        double tamanho = 0;

        for(AreaGeografica area : areasAfetadas){
            tamanho += area.getTamanho();
        }

        if (tamanho <= 2 ) {
            escala = "Micro";
        }else if (tamanho <= 20) {
            escala = "Meso";
        }else if (tamanho <= 2000) {
            escala = "Sinotico";
        }else {
            escala = "Global";
        }

        System.out.println(escala);
    }

    public void calcularGravidade(){
        String gravidade = "";

        if (intensidade <= 2 ) {
            gravidade = "leve";
        }else if (intensidade <= 5) {
            gravidade = "Moderado";
        }else if (intensidade <= 8) {
            gravidade = "Intenso";
        }else {
            gravidade = "Catastrófico";
        }

        System.out.println(gravidade);
    }

    public void gerarRelatorio() {
        double tamanho = 0;
        System.out.println("Nome: "+nome);
        System.out.println("Intesidade (Numa escala de 0 a 10): "+intensidade);
        System.out.println("Duração (em min): "+duracao);
        System.out.println("Localizações afetadas: ");
        for(AreaGeografica area : areasAfetadas){
            System.out.println(area.getLocalizacao());
            tamanho += area.getTamanho();
        }
        System.out.println("Area afetada (em km²): "+tamanho);

    }

}