// OntologyPropertyRepository.java
package com.example.ontology_service.repository;

import com.example.ontologyservice.model.OntologyProperty;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OntologyPropertyRepository extends Neo4jRepository<OntologyProperty, Long> {
    // Additional custom queries if needed
}
