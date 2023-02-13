package palestra.demopalestra.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class WorkoutLogs {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long workoutLogId;
    private String nome;
   
    @OneToMany
    private List<WorkoutLogDetails> workoutsLogDetails;


    public WorkoutLogs(String nome) {
        this.nome = nome;
    }

    

}
