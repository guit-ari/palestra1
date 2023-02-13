package palestra.demopalestra;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import palestra.demopalestra.model.Equipment;
import palestra.demopalestra.model.MusclesGroups;
import palestra.demopalestra.model.Workout;
import palestra.demopalestra.model.WorkoutCategory;
import palestra.demopalestra.model.WorkoutLogDetails;
import palestra.demopalestra.model.WorkoutLogs;
import palestra.demopalestra.services.EquipmentService;
import palestra.demopalestra.services.MusclesGroupsService;
import palestra.demopalestra.services.WorkoutCategoryService;
import palestra.demopalestra.services.WorkoutLogDetailsService;
import palestra.demopalestra.services.WorkoutLogsService;
import palestra.demopalestra.services.WorkoutService;

@Component
public class MyApplicationRunner implements CommandLineRunner{
    @Autowired
    WorkoutCategoryService workoutCategoryService;
    @Autowired
    MusclesGroupsService musclesGroupsService;
    @Autowired
    WorkoutService workoutService;
    @Autowired
    EquipmentService equipmentService;
    @Autowired
    WorkoutLogsService workoutLogsService;
    @Autowired
    WorkoutLogDetailsService workoutLogDetailsService;

    @Override
    public void run(String... args) throws Exception {
       
        WorkoutCategory wC1=new WorkoutCategory("cardio");
        WorkoutCategory wC2=new WorkoutCategory("pesistica");
        WorkoutCategory wC3=new WorkoutCategory("stretching");
        WorkoutCategory wC4=new WorkoutCategory("corpo libero");
        workoutCategoryService.createWorkoutCategory(wC1);
        workoutCategoryService.createWorkoutCategory(wC2);
        workoutCategoryService.createWorkoutCategory(wC3);
        workoutCategoryService.createWorkoutCategory(wC4);
       

        MusclesGroups mgGambe=new MusclesGroups("Gambe");
        MusclesGroups mgPettorali=new MusclesGroups("Pettorali");
        MusclesGroups mgSpalle =new MusclesGroups("Spalle");
        MusclesGroups mgDorso=new MusclesGroups(" Dorso");
        MusclesGroups mgTricipiti=new MusclesGroups("Tricipiti");
        MusclesGroups mgAddome=new MusclesGroups("Addome");
        MusclesGroups mgBicipiti=new MusclesGroups("Bicipiti");
       
        musclesGroupsService.createMusclesGroups(mgGambe);
        musclesGroupsService.createMusclesGroups(mgPettorali);
        musclesGroupsService.createMusclesGroups(mgSpalle);
        musclesGroupsService.createMusclesGroups(mgDorso);
        musclesGroupsService.createMusclesGroups(mgTricipiti);
        musclesGroupsService.createMusclesGroups(mgAddome);
        musclesGroupsService.createMusclesGroups(mgBicipiti);
       

        Workout w1=new Workout("squat",wC2,mgGambe,5);
        workoutService.createWorkout(w1);
        Workout w7=new Workout("leg press",wC2,mgGambe,5);
        workoutService.createWorkout(w7);
        Workout w2= new Workout("panca piana", wC2,  mgPettorali, 3);
        workoutService.createWorkout(w2);
        Workout w3= new Workout("panca stretta", wC2, mgTricipiti, 4);
        workoutService.createWorkout(w3);
        Workout w4= new Workout("spinte con manubri", wC2, mgSpalle, 2);
        workoutService.createWorkout(w4);
        Workout w5= new Workout("Curl con manubri in piedi", wC2, mgBicipiti, 3);
        workoutService.createWorkout(w5);
        Workout w6= new Workout("Lat Machine", wC2, mgDorso, 5);
        workoutService.createWorkout(w6);
        //da implementare con i workout-stretching e cardio

        //creo lista workout dove mi serve la panca piana 
        List<Workout> woPanca= new ArrayList<>();
        woPanca.add(w2);
        woPanca.add(w3);
        //lista workout per bilanciere
        List<Workout> woBilanciere=new ArrayList<>();
        woBilanciere.add(w1);
        woBilanciere.add(w2);
        woBilanciere.add(w3);
        woBilanciere.add(w4);
        woBilanciere.add(w5);
        //lista wo per manubri
        List<Workout> woManubri=new ArrayList<>();
        woManubri.add(w3);
        woManubri.add(w4);
        woManubri.add(w5);
        //lista wo macchinari
        List<Workout> woMacchinari= new ArrayList<>();
        woMacchinari.add(w1);
        woMacchinari.add(w6);

        Equipment e1= new Equipment("panca", woPanca);
        equipmentService.createEquipment(e1);
        Equipment e2=new Equipment("bilanciere", woBilanciere);
        equipmentService.createEquipment(e2);
        Equipment e3=new Equipment("manubri", woManubri);
        equipmentService.createEquipment(e3);
        Equipment e4=new Equipment("macchinario", woMacchinari);
        equipmentService.createEquipment(e4);





        WorkoutLogs scheda1 =new WorkoutLogs("scheda 1");
        workoutLogsService.createWorkoutLogs(scheda1);

        WorkoutLogDetails wL1=new WorkoutLogDetails(scheda1, w1, 4, 5, 10, 2.5, 30, null);
        workoutLogDetailsService.createWorkoutLogDetails(wL1);
        
        WorkoutLogDetails wL2=new WorkoutLogDetails(scheda1, w2, 4, 5, 10, 2.5, 30, null);
        workoutLogDetailsService.createWorkoutLogDetails(wL2);
        
        WorkoutLogDetails wL3=new WorkoutLogDetails(scheda1, w3, 4, 5, 10, 2.5, 30, null);
        workoutLogDetailsService.createWorkoutLogDetails(wL3);
        
        WorkoutLogDetails wL4=new WorkoutLogDetails(scheda1, w4, 4, 5, 10, 2.5, 30, null);
        workoutLogDetailsService.createWorkoutLogDetails(wL4);


        

        
        
    }
    
}
