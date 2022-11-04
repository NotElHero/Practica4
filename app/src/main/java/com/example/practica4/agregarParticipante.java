package com.example.practica4;

import java.util.List;

public class agregarParticipante {
    List participantes;

    public String agregar(String participante){
        participantes.add(participante);
        return participante;
    }
}
