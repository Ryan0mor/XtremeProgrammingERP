package modelo;

import java.util.ArrayList;

/*EQUIPO B*/
public class Proyecto {

    private String ID;
    private ArrayList<Story> listaStories;
    private ArrayList<Ciclo> listaCiclos;
    private ArrayList<MiembroEquipo> listaMiembros;
    //metadatos

    public void comenzar() {

    }

    public boolean aniadeStory(Story s) {
        return listaStories.add(s);
    }

    public void cambiaStory() {

    }

}
