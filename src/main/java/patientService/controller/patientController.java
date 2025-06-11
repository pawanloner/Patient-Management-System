package patientService.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patientService.Service.patientService;
import patientService.dto.PatientResponseDTO;

@RestController
@RequestMapping("/patients") //http:localhost:4000/patients
public class patientController {
    private final patientService patientService;

    public patientController(patientService patientService){
        this.patientService = patientService;
    }    

@GetMapping
public ResponseEntity<List<PatientResponseDTO>> getPatients(){
    List<PatientResponseDTO> patients = patientService.getPatients();
    return ResponseEntity.ok().body(patients);
}



}
