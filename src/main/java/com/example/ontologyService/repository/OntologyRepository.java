// OntologyRepository.java
package com.example.ontologyService.repository;

import com.example.ontologyService.model.Ontology;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OntologyRepository extends Neo4jRepository<Ontology, Long> {
    // Additional custom queries if needed
}
