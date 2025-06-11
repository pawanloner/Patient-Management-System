package patientService.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import patientService.dto.PatientResponseDTO;
import patientService.mapper.patientMapper;
import patientService.model.patient;
import patientService.repository.patientRepository;

@Service
public class patientService { 
    private patientRepository patientRepository;

    public patientService(patientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients(){
        List<patient> patients = patientRepository.findAll();

        List<PatientResponseDTO> patientResponseDTOs = patients.stream().map(patientMapper :: toDTO).toList();

        return patientResponseDTOs;
    }

    public PatientResponseDTO createPatient(patientRequestDTO patientRequestDTO){
        patient newPatient = patientRepository.save(patientMapper.toModel(null));
        return patientMapper.toDTO(newPatient);
    }
}
