package com.example.ontologyService.repository;

import com.example.ontologyService.model.OntologyClass;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.UUID;

public interface OntologyClassRepository extends Neo4jRepository<OntologyClass, UUID> {}
