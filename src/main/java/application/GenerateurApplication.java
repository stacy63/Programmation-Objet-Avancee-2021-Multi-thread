package application;

import utils.GenerateurUtils;

public class GenerateurApplication {

    public static void main (String[] argv){


        /** SEQUENTIEL **/

        GenerateurUtils guSequentiel = new GenerateurUtils();
        long tempsExec = guSequentiel.calculMoyenneTempsSequentiel();

        /** THREAD **/

        long deb = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            GenerateurUtils guThread = new GenerateurUtils();
            Runnable r = guThread;
            Thread thread1 = new Thread(r);
            Thread thread2 = new Thread(r);
            Thread thread3 = new Thread(r);
            thread1.start();
            thread2.start();
            thread3.start();
            //Verification fonctionelle
            /*try{
                thread1.join();
                thread2.join();
                thread3.join();
                System.out.println(guThread.etudiants.size());
                System.out.println(guThread.etudiants.get(0));
                System.out.println(guThread.etudiants.get(1));
            } catch (InterruptedException e){
                e.printStackTrace();
            }*/
        }
        long temps_exec_thread = (System.currentTimeMillis()-deb)/100;

        //Comparaison
        if(tempsExec > temps_exec_thread) {
            System.out.println("Temps d'exécution moyen méthode multi-threadée : " + temps_exec_thread + " milliseconds < Temps d'exécution moyen méthode multi-threadée : "  + tempsExec + " milliseconds.");
        } else {
            System.out.println("Temps d'exécution moyen méthode multi-threadée : " + temps_exec_thread + " milliseconds > Temps d'exécution moyen méthode multi-threadée : " + tempsExec + " milliseconds.");
        }
    }
}
