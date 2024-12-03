public class AreaGeografica implements Monitoravel{
    private double tamanho;
    private String tipoTerreno;
    private String localizacao;
    
    public AreaGeografica(double tamanho, String tipoTerreno, String localizacao) {
        this.tamanho = tamanho;
        this.tipoTerreno = tipoTerreno;
        this.localizacao = localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void gerarRelatorio() {
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Tipo de terrreno: "+tipoTerreno);
        System.out.println("Localização: "+localizacao);
    }
}