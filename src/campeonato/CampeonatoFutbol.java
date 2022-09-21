package campeonato;
import java.util.*;2
/*. Quiz #6
Existen participantes de un campeonato de algun deporte de su elección. Dichos participantes poseen un nombre,
la cantidad de juegos realizados y la cantidad de puntos obtenidos a la fecha. Si se quiere imprimir un ranking
 este debe ser en forma ascendente por la cantidad de juegos y segundo, descendente por la cantidad de puntos.*/
public class CampeonatoFutbol {
    private ArrayList<Participante> participantes;

    public ArrayList getParticipantes()
    {
        return this.participantes;
    }
    public void agregarJugador(String pNombre, int pJuegos, int pPuntos)
    {
        this.participantes.add(new Participante(pNombre, pJuegos, pPuntos));
    }
    public static void main(String[] args)
    {
        CampeonatoFutbol campeonato1 = new CampeonatoFutbol();
        campeonato1.participantes = new ArrayList<Participante>();

        campeonato1.agregarJugador("Jose", 28, 11);
        campeonato1.agregarJugador("Luis", 17, 22);
        campeonato1.agregarJugador("Huey", 22, 7);
        campeonato1.agregarJugador("Bill", 21, 5);
        campeonato1.agregarJugador("Abel", 27, 13);
        campeonato1.agregarJugador("Karl", 22, 34);
        campeonato1.agregarJugador("John", 21, 17);

        System.out.println("Lista original: ");
        System.out.println("Nombre\tJuegos\tPuntos");
        for(int i = 0; i < campeonato1.getParticipantes().size(); i++)
                {
                    System.out.println(campeonato1.getParticipantes().get(i));
                }

        Collections.sort(campeonato1.getParticipantes());

        System.out.println("\nLista ordenada: ");
        System.out.println("Nombre\tJuegos\tPuntos");
        for(int i = 0; i < campeonato1.getParticipantes().size(); i++)
        {
            System.out.println(campeonato1.getParticipantes().get(i));
        }
    }

}
