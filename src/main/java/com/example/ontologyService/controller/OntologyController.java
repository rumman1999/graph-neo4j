// OntologyController.java
package com.example.ontologyService.controller;

import com.example.ontologyService.model.Ontology;
import com.example.ontologyService.repository.OntologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ontologies")
public class OntologyController {

    @Autowired
    private OntologyRepository ontologyRepository;

    // CREATE
    @PostMapping
    public Ontology createOntology(@RequestBody Ontology ontology) {
        return ontologyRepository.save(ontology);
    }

    // READ
    @GetMapping("/{id}")
    public Optional<Ontology> getOntology(@PathVariable Long id) {
        return ontologyRepository.findById(id);
    }

    // LIST ALL
    @GetMapping
    public List<Ontology> getAllOntologies() {
        return ontologyRepository.findAll();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteOntology(@PathVariable Long id) {
        ontologyRepository.deleteById(id);
    }
}
