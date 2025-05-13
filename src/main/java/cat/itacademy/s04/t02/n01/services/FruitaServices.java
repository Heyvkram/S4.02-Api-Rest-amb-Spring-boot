package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.exceptions.FruitaNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruita;
import cat.itacademy.s04.t02.n01.repository.FruitaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaServices {

    @Autowired
    private FruitaRepo repository;

    public Fruita addFruit(Fruita fruit){
        return repository.save(fruit);
    }

    public Fruita updateFruit(Fruita fruit){
        if (!repository.existsById(fruit.getId())) {
            throw new FruitaNotFoundException("There´s no Fruit with this ID");
        }
        return repository.save(fruit);
    }

    public void deleteFruit(long id){
        if (!repository.existsById(id)) {
            throw new FruitaNotFoundException("There´s no Fruit with this ID");
        }
        repository.deleteById(id);
    }

    public Optional<Fruita> getFruitById(long id) {
        Optional<Fruita> fruit = repository.findById(id);
        if (fruit.isEmpty()) {
            throw new FruitaNotFoundException("There´s no Fruit with ID: " + id);
        }
        return fruit;
    }


    public List<Fruita> getAllFruit(){
        return repository.findAll();
    }
}
