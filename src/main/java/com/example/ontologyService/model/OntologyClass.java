// OntologyClass.java
package com.example.ontologyService.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;
import java.util.UUID;

@Node
public class OntologyClass {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Relationship(type = "HAS_PROPERTY")
    private List<OntologyProperty> properties;

    @Relationship(type = "SUBCLASS_OF")
    private OntologyClass parentClass;

    // ✅ Default constructor
    public OntologyClass() {}

    // ✅ Getters & Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<OntologyProperty> getProperties() { return properties; }
    public void setProperties(List<OntologyProperty> properties) { this.properties = properties; }

    public OntologyClass getParentClass() { return parentClass; }
    public void setParentClass(OntologyClass parentClass) { this.parentClass = parentClass; }
}
