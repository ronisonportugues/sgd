package br.com.sgd.controller;

import java.io.Serializable;

import javax.inject.Named;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@Named
public class MapaController implements Serializable {

	private MapModel mapaSimples;

	public MapaController() {

		mapaSimples = new DefaultMapModel();

		LatLng coordenada = new LatLng(-20.471683, -54.62935);
		mapaSimples.addOverlay(new Marker(coordenada, "N&A Informática"));

	}

	public MapModel getMapasimples() {
		return mapaSimples;
	}
}
