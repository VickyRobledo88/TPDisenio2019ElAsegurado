package ar.TpDisenio2019.ListaDesplegable;

import java.util.ArrayList;
import java.util.List;

import ar.TpDisenio2019.DTO.DTOProvincia;
import ar.TpDisenio2019.DTO.DTOTipodedocumento;
import ar.TpDisenio2019.Modelo.Provincia;
import ar.TpDisenio2019.Modelo.Tipodedocumento;

public class GestorListasDesplegables {

	public static List<DTOTipodedocumento> buscarDtosTipoDeDocumento() {

		GestorListasBDDesplegable gestionListaDesplegable = new GestorListasBDDesplegable();

		List<Tipodedocumento> listaTiposDocumento = new ArrayList<Tipodedocumento>();

		List<DTOTipodedocumento> dtoListaTipos = new ArrayList<DTOTipodedocumento>();

		listaTiposDocumento = gestionListaDesplegable.ObtenerTiposDocumento();

		for (Tipodedocumento listaTipo : listaTiposDocumento) {

			DTOTipodedocumento dtoTipodedocumento = new DTOTipodedocumento();
			dtoTipodedocumento.setIdTipoDeDocumento(listaTipo.getIdTipoDeDocumento());
			dtoTipodedocumento.setNombre(listaTipo.getNombre());

			dtoListaTipos.add(dtoTipodedocumento);
		}

		return dtoListaTipos;

	}

	public static List<DTOProvincia> buscarDtosProvincia() {

		GestorListasBDDesplegable gestionListaDesplegable = new GestorListasBDDesplegable();

		List<Provincia> listaProvincias = new ArrayList<Provincia>();

		List<DTOProvincia> dtoListaProvincias = new ArrayList<DTOProvincia>();

		listaProvincias = gestionListaDesplegable.ObtenerProvincias();

		for (Provincia listaProvincia : listaProvincias) {

			DTOProvincia dtoProvincia = new DTOProvincia();
			dtoProvincia.setIdProvincia(listaProvincia.getIdProvincia());
			dtoProvincia.setNombre(listaProvincia.getNombre());

			dtoListaProvincias.add(dtoProvincia);
		}

		return dtoListaProvincias;
	}
}