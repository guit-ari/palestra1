package palestra.demopalestra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import palestra.demopalestra.model.Equipment;
import palestra.demopalestra.services.EquipmentService;

@RestController
@RequestMapping("api/equipment")
@CrossOrigin
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;

    @PostMapping("/create")
    public ResponseEntity<Equipment> createEquipment(@RequestBody Equipment newEquipment) {
        return new ResponseEntity<>(equipmentService.createEquipment(newEquipment), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Equipment>> getAllEquipments() {
        List<Equipment> equipment= equipmentService.getAllEquipments();
        return new ResponseEntity<List<Equipment>>(equipment, HttpStatus.OK);
    }

    @GetMapping("/equipment/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable Long id) {
        return new ResponseEntity<>(equipmentService.getEquipmentById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEquipmentById(@PathVariable Long id) {
        equipmentService.deleteEquipmentById(id);
        return new ResponseEntity<>("Equipment cancellata con successo", HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Equipment> updateEquipment(@PathVariable Long id, @RequestBody Equipment newEquipment) {
        return new ResponseEntity<Equipment>(equipmentService.updateEquipment(id, newEquipment), HttpStatus.OK);
    }

}
