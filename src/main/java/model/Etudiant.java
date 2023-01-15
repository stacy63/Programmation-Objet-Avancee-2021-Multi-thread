package model;

public class Etudiant {

    public long identifiant_national_etudiant;

    public String nom;

    public String prenom;

    public String date_de_naissance;

    public String lieu_de_naissance;

    public String descriptif_parcours;

    /** CONSTRUCTEURS **/

    public Etudiant(){}

    public Etudiant(long id, String nom, String prenom, String date, String lieu, String desc){
        identifiant_national_etudiant=id;
        this.nom=nom;
        this.prenom=prenom;
        date_de_naissance=date;
        lieu_de_naissance=lieu;
        descriptif_parcours=desc;
    }

    /** GETTER **/

    public long getId(){ return identifiant_national_etudiant; }

    public String getNom(){ return nom;}

    public String getPrenom(){ return prenom; }

    public String getDate_de_naissance(){ return date_de_naissance; }

    public String getLieu_de_naissance(){ return lieu_de_naissance; }

    public String getDescriptif__parcours(){ return descriptif_parcours; }

    /** SETTER **/

    public void setId(Long id){ identifiant_national_etudiant= id; }

    public void setNom(String nom){ this.nom=nom;}

    public void getPrenom(String prenom){ this.prenom=prenom; }

    public void getDate_de_naissance(String date){ date_de_naissance=date; }

    public void getLieu_de_naissance(String lieu){ lieu_de_naissance=lieu; }

    public void getDescriptif_parcours(String descriptif){ descriptif_parcours=descriptif; }

    /** AFFICHAGE **/

    @Override
    public String toString(){
        return new String(this.identifiant_national_etudiant + " " + this.nom + " " + this.prenom + ", date naissance: " +
                this.date_de_naissance + ", lieu naissance: " + this.lieu_de_naissance + ", description: " + this.descriptif_parcours);
    }

}
