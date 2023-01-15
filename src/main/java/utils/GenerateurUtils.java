package utils;

import model.Etudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateurUtils implements Runnable {

    //Pour récupérer la liste générée par les threads
    public List<Etudiant> etudiants;

    public GenerateurUtils(){
        etudiants = new ArrayList<>();
    }

    //Generer un long positif aléatoire
    public long generateRandomLong(){
        long rand = new Random().nextLong();
        if(rand < 0){
            rand = rand * (-1);
        }
        return rand;
    }
    public Etudiant generateRandomEtudiant(){
        return new Etudiant(generateRandomLong(), "Leroi", "Claire-vi", "28_mai_1999",
                "Fontainebleau", "prepa et ISIMA");
    }

    //Seul un thread peut accéder à etudiants en même temps pour ajouter les étudiants générés par chacun d'entre eux.
    public void generateRandomEtudiants(int nb){
        List<Etudiant> etuds = new ArrayList<>();
        for(int i= 0; i<nb; i++){
            etuds.add(generateRandomEtudiant());
        }
        synchronized (this){
            etudiants.addAll(etuds);
        }
    }

    /** VERSION SEQUENTIELLE **/

    public long calculMoyenneTempsSequentiel(){
        long debut = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            generateRandomEtudiants(150000);
        }
        return (System.currentTimeMillis()-debut)/100;
    }

    /** VERSION THREAD **/

    public void run (){
        generateRandomEtudiants(50000);
    }

}
