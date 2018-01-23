public class Chien extends Animal implements Aboyer {

    /**
     * Implémentation de l'interface Aboyer
     */
    @Override
    public void aboyer() {
        System.out.println("Woof !");
    }

    /**
     * Surcharge de fonction
     */
    @Override
    public void live() {
        System.out.println("Je suis un chien vivant !");
    }

    /**
     * Implémentation d'une fonction abstraite
     */
    @Override
    public void faitLeBeau() {
        if (isAlive)
            System.out.println(getName() + "fait le beau");
    }
}
