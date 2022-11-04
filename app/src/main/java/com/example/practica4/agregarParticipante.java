package com.example.practica4;

import java.util.ArrayList;

public class agregarParticipante {
    ArrayList participantes;

    public String agregar(String participante){
        participantes.add(participante);
        return participante;
    }
}
