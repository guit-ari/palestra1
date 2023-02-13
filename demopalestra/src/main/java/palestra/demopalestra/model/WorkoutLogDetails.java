package palestra.demopalestra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class WorkoutLogDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long workoutLogDetailId;
    @OneToOne
    private WorkoutLogs WorkoutLog;

    @OneToOne
    private Workout workouts;

    private int sets;
    private int ripetizioni;
    private double peso;
    private double recover;
    private double tempo;
    private String note;

    public WorkoutLogDetails(WorkoutLogs workoutLog,Workout workouts, int sets, int ripetizioni, double peso, double recover,
            double tempo, String note) {
        this.WorkoutLog = workoutLog;
        this.workouts = workouts;
        this.sets = sets;
        this.ripetizioni = ripetizioni;
        this.peso = peso;
        this.recover = recover;
        this.tempo = tempo;
        this.note = note;
    }
 


}
