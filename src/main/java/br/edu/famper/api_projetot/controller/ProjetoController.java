package br.edu.famper.api_projetot.controller;

import br.edu.famper.api_projetot.model.Projeto;
import br.edu.famper.api_projetot.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/projeto")
public class ProjetoController {

        @Autowired
        private ProjetoService ProjetoService;

        @GetMapping
        public ResponseEntity<List<Projeto>> findAll() {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(ProjetoService.findAll());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Optional<Projeto>> findById(@PathVariable Long id){//metodo buscar um produto  {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(ProjetoService.findById(id));
        }

        @PostMapping
        public ResponseEntity<Projeto> create(@RequestBody Projeto projeto) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(ProjetoService.salvar(projeto));
        }

        @PutMapping
        public ResponseEntity<Projeto> update(@RequestBody Projeto projeto) {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(ProjetoService.update(projeto));
        }
        @DeleteMapping("/{id}")
            public ResponseEntity<?> delete(@PathVariable Long id){
             ProjetoService.deleteById(id);
                return ResponseEntity.status(HttpStatus.OK).build();
        }


}

