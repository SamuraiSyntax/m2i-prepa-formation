package com.m2i.gestionetudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiantDetails) {
        Etudiant etudiant = etudiantRepository.findById(id).orElse(null);
        if (etudiant != null) {
            etudiant.setNom(etudiantDetails.getNom());
            etudiant.setPrenom(etudiantDetails.getPrenom());
            etudiant.setEmail(etudiantDetails.getEmail());
            return etudiantRepository.save(etudiant);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantRepository.deleteById(id);
    }
}
