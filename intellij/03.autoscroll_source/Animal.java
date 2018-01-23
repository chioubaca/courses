/**
 * Classe abstraite
 *
 * @author Lucas OMS
 */
public abstract class Animal {

    private String name;
    /**
     * Elément protected (accessible aux sous classes)
     */
    protected boolean isAlive;

    /**
     * Fonction surchargée
     */
    public void live() {
        System.out.println("Je suis vivant !");
    }

    /**
     * Fonction inutile
     *
     * @return true si en vie
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Fonction utilisée en dehors de cette classe
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Methode abstraite
     */
    public abstract void faitLeBeau();

    @Override
    public String toString() {
        return name;
    }
}
