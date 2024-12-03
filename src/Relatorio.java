import java.util.ArrayList;
import java.util.Date;

public class Relatorio implements Monitoravel{
    private Date dataRelatorio;
    private ArrayList<FenomenoClimatico> fenomenosClimaticos;
    
    public Relatorio() {
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

    public void addFenomenoClimatico(FenomenoClimatico fenomenoClimatico) {
        if (!fenomenosClimaticos.contains(fenomenoClimatico)) {
            this.fenomenosClimaticos.add(fenomenoClimatico);
        }
        System.out.println("O fenômeno já foi adicionado");
    }
    
    public void removeFenomenoClimatico(FenomenoClimatico fenomenoClimatico){
        if(fenomenosClimaticos.contains(fenomenoClimatico)){
            this.fenomenosClimaticos.remove(fenomenoClimatico);
        }else{
            System.out.println("O fenomeno não está no relatório");
        }
    }

    public void gerarRelatorio() {
        dataRelatorio = new Date();

        System.out.println("--------------- R E L A T Ó R I O ---------------");
        System.out.println("Fenômenos climaticos: ");
        System.out.println("-------------------------------------------------");
        for(FenomenoClimatico fenomeno : fenomenosClimaticos) {
            System.out.println("- Fenômeno: "+fenomeno.getNome());
            System.out.println("- Areas afetadas: ");
            for(AreaGeografica area : fenomeno.getAreasAfetadas()){
                System.out.println("-> " + area.getLocalizacao());
            }
            System.out.println("-------------------------------------------------");
        }
        System.out.println("Data: "+dataRelatorio);
    }
}