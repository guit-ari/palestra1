package palestra.demopalestra.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
public class Workout {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long workoutId;
   
    private String nome;
   
    @OneToOne
    private WorkoutCategory categorie;
   
    @OneToOne
    private  MusclesGroups gruppoMuscolare;
    @JsonProperty("pdifficoltà")
    private int difficoltà;
    
    @ManyToMany(mappedBy="workouts")
    private List<Equipment> equipments;



    public Workout(String nome, WorkoutCategory categorie, MusclesGroups gruppoMuscolare, int difficoltà,
            List<Equipment> equipments) {
        this.nome = nome;
        this.categorie = categorie;
        this.gruppoMuscolare = gruppoMuscolare;
        this.difficoltà = difficoltà;
        this.equipments = equipments;
    }



    public Workout(String nome, WorkoutCategory categorie, MusclesGroups gruppoMuscolare, int difficoltà) {
        this.nome = nome;
        this.categorie = categorie;
        this.gruppoMuscolare = gruppoMuscolare;
        this.difficoltà = difficoltà;
    }



    
   
    
    
}
