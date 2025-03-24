package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    private String analyserRequête(Requête requête) {
        // Comparaison avec la base de connaissances médicales
       return requête.getSymptomes().toString();
    }
    

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

     private String comparerDonnées() {
         // Retour des résultats de comparaison
        return this.listRequestes.size();
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {
        
        return "requête analysée";
    }

    private String comparerDonnes() {
        
        return "Cluster trouvé";
    }

}
