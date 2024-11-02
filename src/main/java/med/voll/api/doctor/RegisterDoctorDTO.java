package med.voll.api.doctor;

import med.voll.api.address.AddressDTO;

public record RegisterDoctorDTO(String name, String email, String crm, Especialidade especialidade, AddressDTO address) {
}
