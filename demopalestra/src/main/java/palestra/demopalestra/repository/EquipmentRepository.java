package palestra.demopalestra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import palestra.demopalestra.model.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long>{
    
}
