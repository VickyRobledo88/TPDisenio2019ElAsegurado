package ar.TpDisenio2019.Dao;


import java.util.List;

import ar.TpDisenio2019.Modelo.Recibo;


public interface ReciboDao {
    
    public Recibo buscarPorId (int idRecibo);
    
    public void guardar (Recibo recibo);
    
    public List<Recibo> obtenerTodas();
}
