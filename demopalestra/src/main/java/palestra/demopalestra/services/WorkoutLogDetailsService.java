package palestra.demopalestra.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import palestra.demopalestra.model.WorkoutLogDetails;
import palestra.demopalestra.repository.WorkoutLogDetailsRepository;
@Service
public class WorkoutLogDetailsService {
    @Autowired
    WorkoutLogDetailsRepository workoutLogDetailsRepository;
    
    public WorkoutLogDetails createWorkoutLogDetails(WorkoutLogDetails w) {
        return workoutLogDetailsRepository.save(w);
    }

    public List<WorkoutLogDetails> getAllWorkoutLogDetails() {
        return workoutLogDetailsRepository.findAll();
    }

    public void deleteWorkoutLogDetailsById(Long id) {
        workoutLogDetailsRepository.deleteById(id);
    }

    public WorkoutLogDetails getWorkoutLogDetailsById(Long id) {

        Optional<WorkoutLogDetails> workoutLogDetailsOpt = workoutLogDetailsRepository.findById(id);
        return workoutLogDetailsOpt.get();
    }

    public WorkoutLogDetails updateWorkoutLogDetails(Long id, WorkoutLogDetails newWorkoutLogDetails) {
        WorkoutLogDetails oldWorkoutLogDetails = getWorkoutLogDetailsById(id);
        if (oldWorkoutLogDetails != null) {

          
            oldWorkoutLogDetails.setNote(newWorkoutLogDetails.getNote());
            oldWorkoutLogDetails.setPeso(newWorkoutLogDetails.getPeso());
            oldWorkoutLogDetails.setRecover(newWorkoutLogDetails.getRecover());
            oldWorkoutLogDetails.setRipetizioni(newWorkoutLogDetails.getRipetizioni());
            oldWorkoutLogDetails.setSets(newWorkoutLogDetails.getSets());
            oldWorkoutLogDetails.setTempo(newWorkoutLogDetails.getTempo());
            oldWorkoutLogDetails.setWorkoutLog(newWorkoutLogDetails.getWorkoutLog());
            oldWorkoutLogDetails.setWorkouts(newWorkoutLogDetails.getWorkouts());
           
            return workoutLogDetailsRepository.save(oldWorkoutLogDetails);

        } else
            return null;
    }

    public WorkoutLogDetails updateLog(Long id, WorkoutLogDetails newWorkoutLogDetails) {
        WorkoutLogDetails oldWorkoutLogDetails = getWorkoutLogDetailsById(id);
        if (oldWorkoutLogDetails != null) {

          
            oldWorkoutLogDetails.setNote(newWorkoutLogDetails.getNote());
            oldWorkoutLogDetails.setPeso(newWorkoutLogDetails.getPeso());
            oldWorkoutLogDetails.setRecover(newWorkoutLogDetails.getRecover());
            oldWorkoutLogDetails.setRipetizioni(newWorkoutLogDetails.getRipetizioni());
            oldWorkoutLogDetails.setSets(newWorkoutLogDetails.getSets());
            oldWorkoutLogDetails.setTempo(newWorkoutLogDetails.getTempo());
           oldWorkoutLogDetails.setWorkoutLog(newWorkoutLogDetails.getWorkoutLog());
            oldWorkoutLogDetails.setWorkouts(newWorkoutLogDetails.getWorkouts());
           
            return workoutLogDetailsRepository.save(oldWorkoutLogDetails);

        } else
            return null;
    }
}
