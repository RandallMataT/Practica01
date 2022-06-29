package com.practica.Practica01.service;

import com.practica.Practica01.domain.Estado;
import java.util.List;

public interface EstadoService {
    public List<Estado> getEstados ();
    
    public void save (Estado estado);
    
    public void delete (Estado estado);
    
    public Estado getEstado(Estado estado);
}
