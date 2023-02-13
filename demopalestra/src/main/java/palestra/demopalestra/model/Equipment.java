package palestra.demopalestra.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class Equipment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long equipmentId;
    private String nomeEquipaggiamento;
    @ManyToMany
    private List<Workout> workouts;
    public Equipment(String nomeEquipaggiamento, List<Workout> workouts) {
        this.nomeEquipaggiamento = nomeEquipaggiamento;
        this.workouts = workouts;
    }
    
}
