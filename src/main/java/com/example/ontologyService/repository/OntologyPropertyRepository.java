package com.example.ontologyService.repository;

import com.example.ontologyService.model.OntologyProperty;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OntologyPropertyRepository extends Neo4jRepository<OntologyProperty, Long> {
    // Additional custom queries if needed
}
