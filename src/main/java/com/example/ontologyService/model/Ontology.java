package com.example.ontologyService.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;
import java.util.UUID;

@Node
public class Ontology {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Relationship(type = "HAS_CLASS")
    private List<OntologyClass> classes;

    // ✅ Add default constructor
    public Ontology() {
        System.out.println(this);
    }

    // ✅ Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OntologyClass> getClasses() {
        return classes;
    }

    public void setClasses(List<OntologyClass> classes) {
        this.classes = classes;
    }
}
