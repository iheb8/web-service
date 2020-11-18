package com.iheb.jeux;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.iheb.jeux.entities.Jeu;
import com.iheb.jeux.repos.JeuRepository;
import com.iheb.jeux.service.JeuService;
 

@SpringBootTest
class JeuxApplicationTests {
@Autowired
private JeuRepository jeuRepository;
private JeuService jeuService;
@Test
public void testCreateJeu() {
Jeu je = new Jeu("Need for speed",220.500,new Date());
jeuRepository.save(je);}

@Test
public void testFindJeu()
{
Jeu j = jeuRepository.findById(1L).get();
System.out.println(j);
}

@Test
public void testUpdateJeu()
{
	Jeu j = jeuRepository.findById(1L).get();
j.setPrixJeu(1000.0);
jeuRepository.save(j);
}
@Test
public void testDeleteJeu()
{
jeuRepository.deleteById(1L);;
}

@Test
public void testListerTousJeux()
{
List<Jeu> jx = jeuRepository.findAll();
for (Jeu j : jx)
{
System.out.println(j);
}
}
@Test
public void testFindByNomJeuContains()
{
Page<Jeu> jx = jeuService.getAllJeuxParPage(0,2);
System.out.println(jx.getSize());
System.out.println(jx.getTotalElements());
System.out.println(jx.getTotalPages());
jx.getContent().forEach(j -> {System.out.println(j.toString());
 });
/*ou bien
for (Produit p : prods)
{
System.out.println(p);
} */
}

}

