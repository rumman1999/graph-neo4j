// OntologyClassRepository.java
package com.example.ontologyService.repository;

import com.example.ontologyService.model.OntologyClass;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface OntologyClassRepository extends Neo4jRepository<OntologyClass, Long> {
    // Additional custom queries if needed
}
