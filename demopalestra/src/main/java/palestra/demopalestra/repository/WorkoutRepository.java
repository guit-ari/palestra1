package palestra.demopalestra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import palestra.demopalestra.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout,Long>{
    
}
