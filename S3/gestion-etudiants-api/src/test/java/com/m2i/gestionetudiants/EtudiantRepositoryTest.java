package com.m2i.gestionetudiants;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EtudiantRepositoryTest {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    void testCreateAndFindEtudiant() {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("TestNom");
        etudiant.setPrenom("TestPrenom");
        etudiant.setEmail("test.email@example.com");

        Etudiant savedEtudiant = etudiantRepository.save(etudiant);
        assertThat(savedEtudiant).isNotNull();
        assertThat(savedEtudiant.getId()).isNotNull();

        Etudiant foundEtudiant = etudiantRepository.findById(savedEtudiant.getId()).orElse(null);
        assertThat(foundEtudiant).isNotNull();
        assertThat(foundEtudiant.getNom()).isEqualTo("TestNom");
        assertThat(foundEtudiant.getPrenom()).isEqualTo("TestPrenom");
        assertThat(foundEtudiant.getEmail()).isEqualTo("test.email@example.com");
    }

    @Test
    void testFindAllEtudiants() {
        etudiantRepository.deleteAll(); // Clear existing data

        Etudiant etudiant1 = new Etudiant();
        etudiant1.setNom("Nom1");
        etudiant1.setPrenom("Prenom1");
        etudiant1.setEmail("email1@example.com");
        etudiantRepository.save(etudiant1);

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setNom("Nom2");
        etudiant2.setPrenom("Prenom2");
        etudiant2.setEmail("email2@example.com");
        etudiantRepository.save(etudiant2);

        Iterable<Etudiant> etudiants = etudiantRepository.findAll();
        assertThat(etudiants).hasSize(2);
    }
}
