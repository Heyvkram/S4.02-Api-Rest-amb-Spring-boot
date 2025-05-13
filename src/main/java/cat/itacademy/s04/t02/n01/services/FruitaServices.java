package cat.itacademy.s04.t02.n01.services;

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
        return repository.save(fruit);
    }

    public void deleteFruit(long id){
        repository.deleteById(id);
    }

    public Optional<Fruita> getFruitById(long id) {
        return repository.findById(id);
    }


    public List<Fruita> getAllFruit(){
        return repository.findAll();
    }
}
