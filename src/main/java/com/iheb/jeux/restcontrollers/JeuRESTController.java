package com.iheb.jeux.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iheb.jeux.entities.Jeu;
import com.iheb.jeux.service.JeuService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JeuRESTController {
	@Autowired
	JeuService jeuService;
	@RequestMapping(method = RequestMethod.GET)
	List<Jeu> getAllJeux() {
		return jeuService.getAllJeux();
		}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Jeu getJeuById(@PathVariable("id") Long id) {
	return jeuService.getJeu(id);

	}
	@RequestMapping(method = RequestMethod.POST)
	public Jeu createJeu(@RequestBody Jeu jeu) {
	return jeuService.saveJeu(jeu);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Jeu updateJeu(@RequestBody Jeu jeu) {
	return jeuService.updateJeu(jeu);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteJeu(@PathVariable("id") Long id)
	{
	jeuService.deleteJeuById(id);
	}
	@RequestMapping(value="/jxgen/{idGen}",method = RequestMethod.GET)
	public List<Jeu> getJeuxByGenId(@PathVariable("idGen") Long idGen) {
	return jeuService.findByGenreIdGen(idGen);
	}
		
}
