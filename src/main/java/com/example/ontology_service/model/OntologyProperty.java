package com.example.ontology_service.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class OntologyProperty {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String dataType;

    // getters & setters
}
