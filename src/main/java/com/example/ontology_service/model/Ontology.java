package com.example.ontology_service.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Ontology {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = "HAS_CLASS")
    private List<OntologyClass> classes;

    // getters & setters
}
