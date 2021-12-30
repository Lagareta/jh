package com.tp.tp5.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tp.tp5.model.API_Etalab.Etalab;
import com.tp.tp5.model.API_MeteoConcept.MeteoConcept;
import com.tp.tp5.model.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.net.URL;

@Controller
public class MeteoController {
    @Autowired
    AdresseRepository adresseRepository;
    @PostMapping("/meteo")
    public String showMeteo (@RequestBody(required = true) String adresseMeteo,
            Model model) throws IOException {
        adresseMeteo = adresseMeteo.substring(adresseMeteo.indexOf("=") + 1);
        model.addAttribute("adresseMeteo", adresseMeteo);
        System.out.println("\n\nParametre URL : " + adresseMeteo);
        URL url;

        // API data gouv
        url = new URL("https://api-adresse.data.gouv.fr/search/?q=" + adresseMeteo);
        Etalab localisation = new ObjectMapper().readValue(url, Etalab.class);

        double longitude = localisation.getFeatures().get(0).getGeometry().getCoordinates().get(0);
        double latitude = localisation.getFeatures().get(0).getGeometry().getCoordinates().get(1);


        System.out.println("--- Data Gouv ---");
        System.out.println("latitude : " + latitude);
        System.out.println("longitude : " + longitude);

        url = new URL("https://api.meteo-concept.com/api/forecast/daily?token=97ecc6007f7d58f4fe7d350e7409f973f549937a3d04e0971333a4c4fcb5fdc7&latlng=" + Math.round(latitude*1000.0)/1000.0 + "," + Math.round(longitude*1000.0)/1000.0);
        MeteoConcept meteo = new ObjectMapper().readValue(url, MeteoConcept.class);

        longitude = meteo.getCity().getLongitude();
        latitude = meteo.getCity().getLatitude();

        System.out.println("--- Meteo City ---");
        System.out.println("latitude : " + latitude);
        System.out.println("longitude : " + longitude);


        model.addAttribute ("meteo", meteo);
        return "meteo";
    }
}
