package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruita;
import cat.itacademy.s04.t02.n01.services.FruitaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruit")
public class FruitaController {

    @Autowired
    private FruitaServices service;

    @PostMapping("/add")
    public Fruita add(@RequestBody Fruita fruit){
        return service.addFruit(fruit);
    }

    @PutMapping("/update")
    public Fruita update(@RequestBody Fruita fruit){
        return service.updateFruit(fruit);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        service.deleteFruit(id);
    }

    @GetMapping("/getOne/{id}")
    public Optional<Fruita> getOne(@PathVariable int id){
        return service.getFruitById(id);
    }

    @GetMapping("/getAll")
    public List<Fruita> getAll() {
        return service.getAllFruit();
    }
}
