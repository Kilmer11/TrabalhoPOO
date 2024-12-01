import java.util.ArrayList;
import java.util.Date;

public class Relatorio {
    private Date dataRelatorio;
    private AreaGeografica areaGeografica;
    private ArrayList<FenomenoClimatico> fenomenosClimaticos;
    
    public Relatorio(AreaGeografica areaGeografica) {
        this.areaGeografica = areaGeografica;
        this.fenomenosClimaticos = new ArrayList<>();
    }

    public Date getDataRelatorio() {
        return dataRelatorio;
    }

    public void setDataRelatorio(Date dataRelatorio) {
        this.dataRelatorio = dataRelatorio;
    }

    public ArrayList<FenomenoClimatico> getFenomenosClimaticos() {
        return fenomenosClimaticos;
    }

    public void setFenomenosClimaticos(ArrayList<FenomenoClimatico> fenomenosClimaticos) {
        this.fenomenosClimaticos = fenomenosClimaticos;
    }

    public AreaGeografica getAreaGeografica() {
        return areaGeografica;
    }

    public void setAreaGeografica(AreaGeografica areaGeografica) {
        this.areaGeografica = areaGeografica;
    }

    public void addFenomenoClimatico(FenomenoClimatico fenomenoClimatico) {
        this.fenomenosClimaticos.add(fenomenoClimatico);
    }
    
    public void gerarRelatorio() {
        dataRelatorio = new Date();

        System.out.println("--------------- R E L A T Ó R I O ---------------");
        System.out.println("Fenômenos climaticos: ");
        for(int i = 0; i < fenomenosClimaticos.size(); i++) {
            System.out.println("- "+fenomenosClimaticos.get(i).getNome());
        }
        System.out.println("Localização: "+areaGeografica.getLocalizacao());
        System.out.println("Data: "+dataRelatorio);
    }
}
