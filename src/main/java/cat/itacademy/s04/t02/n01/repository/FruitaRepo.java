package cat.itacademy.s04.t02.n01.repository;

import cat.itacademy.s04.t02.n01.model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitaRepo extends JpaRepository<Fruita, Long> {
}