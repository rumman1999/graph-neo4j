import com.example.ontologyService.repository.OntologyRepository;
import com.example.ontologyService.model.Ontology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Ontology Service is running!";
    }

    @RestController
    @RequestMapping("/ontologies")
    public static class OntologyController {

        @Autowired
        private OntologyRepository ontologyRepository;

        // CREATE
        @PostMapping
        public Ontology createOntology(@RequestBody Ontology ontology) {
            return ontologyRepository.save(ontology);
        }

        // READ
        @GetMapping("/{id}")
        public Optional<Ontology> getOntology(@PathVariable Long id) {
            return ontologyRepository.findById(id);
        }

        // LIST ALL
        @GetMapping
        public List<Ontology> getAllOntologies() {
            return ontologyRepository.findAll();
        }

        // DELETE
        @DeleteMapping("/{id}")
        public void deleteOntology(@PathVariable Long id) {
            ontologyRepository.deleteById(id);
        }
    }
}
