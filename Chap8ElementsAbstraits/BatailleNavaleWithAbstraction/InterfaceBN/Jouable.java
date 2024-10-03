package Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.InterfaceBN;

public interface Jouable  {
    void jouer();
    default String getNomDuJeu() {
        return this.getClass().getSimpleName();
    }
}


