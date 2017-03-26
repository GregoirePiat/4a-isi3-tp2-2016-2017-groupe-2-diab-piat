import java.util.OptionalInt;

public interface Noeud {

    public OptionalInt accept(Visiteur v);

}
