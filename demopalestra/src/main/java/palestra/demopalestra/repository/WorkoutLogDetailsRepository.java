package palestra.demopalestra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import palestra.demopalestra.model.WorkoutLogDetails;

public interface WorkoutLogDetailsRepository extends JpaRepository<WorkoutLogDetails,Long> {
    
}
