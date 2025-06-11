package patientService.mapper;

import java.time.LocalDate;

import patientService.dto.PatientResponseDTO;
import patientService.dto.patientRequestDTO;
import patientService.model.patient;

public class patientMapper {
    public static PatientResponseDTO toDTO(patientService.model.patient patient){
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patient.setName(patient.getName());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;

    }

    public static patient toModel(patientRequestDTO patientRequestDTO){
        patient patient = new patient();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegistrationDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));

        return patient;
        
    }
}
