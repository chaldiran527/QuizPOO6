package campeonato;
import java.util.*;

public class Participante implements Comparable<Participante> {
    private String nombre;
    private Integer juegos;
    private Integer puntos;
    @Override
    public int compareTo(Participante pO)
    {
        if((this.juegos < pO.getJuegos()) || ((this.juegos == pO.getJuegos()) && (pO.getPuntos() <this.puntos)))
        {
            return -1;
        }
        return 1;
    }
    public Participante(String pNOmbre, int pJuegos, int pPuntos)
    {
        super();
        this.nombre = pNOmbre;
        this.juegos = pJuegos;
        this.puntos = pPuntos;
    }

    public void setJuegos(int pJuegos)
    {
        this.juegos = pJuegos;
    }

    public int getJuegos()
    {
        return this.juegos;
    }

    public void setPuntos(int pPuntos)
    {
        this.puntos = pPuntos;
    }

    public int getPuntos()
    {
        return this.puntos;
    }

    public String toString()
    {
        return this.nombre + "\t  " + this.juegos + "\t\t" + this.puntos;
    }
}
