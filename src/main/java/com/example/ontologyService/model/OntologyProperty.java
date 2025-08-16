// OntologyProperty.java
package com.example.ontologyService.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.UUID;

@Node
public class OntologyProperty {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String dataType;

    // ✅ Default constructor
    public OntologyProperty() {}

    // ✅ Getters & Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDataType() { return dataType; }
    public void setDataType(String dataType) { this.dataType = dataType; }
}
