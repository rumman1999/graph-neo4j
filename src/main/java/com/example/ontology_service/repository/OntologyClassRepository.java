// OntologyClassRepository.java
package com.example.ontology_service.repository;

import com.example.ontologyservice.model.OntologyClass;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OntologyClassRepository extends Neo4jRepository<OntologyClass, Long> {
    // Additional custom queries if needed
}
