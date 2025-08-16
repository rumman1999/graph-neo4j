package com.example.ontologyService.repository;

import com.example.ontologyService.model.OntologyProperty;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.UUID;

public interface OntologyPropertyRepository extends Neo4jRepository<OntologyProperty, UUID> {}
