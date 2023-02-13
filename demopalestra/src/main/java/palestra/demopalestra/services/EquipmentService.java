package palestra.demopalestra.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import palestra.demopalestra.model.Equipment;
import palestra.demopalestra.repository.EquipmentRepository;

@Service
public class EquipmentService {
    @Autowired
    EquipmentRepository equipmentRepository;
    
    public Equipment createEquipment(Equipment e) {
        return equipmentRepository.save(e);
    }

    public List<Equipment> getAllEquipments() {
        return equipmentRepository.findAll();
    }

    public void deleteEquipmentById(Long id) {
        equipmentRepository.deleteById(id);
    }

    public Equipment getEquipmentById(Long id) {

        Optional<Equipment> equipmentOpt = equipmentRepository.findById(id);
        return equipmentOpt.get();
    }

    public Equipment updateEquipment(Long id, Equipment newEquipment) {
        Equipment oldEquipment = getEquipmentById(id);
        if (oldEquipment != null) {

            oldEquipment.setNomeEquipaggiamento(newEquipment.getNomeEquipaggiamento());
            oldEquipment.setWorkouts(newEquipment.getWorkouts());
           
            return equipmentRepository.save(oldEquipment);

        } else
            return null;
    }


}
