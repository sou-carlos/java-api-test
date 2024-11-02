package med.voll.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;

@Table(name = "doctors")
@Entity(name = "doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade specialty;

    @Embedded
    private Address address;

    public Doctor(RegisterDoctorDTO doctorData) {
        this.name = doctorData.name();
        this.email = doctorData.email();
        this.crm = doctorData.crm();
        this.address = new Address(doctorData.address());
        this.specialty = doctorData.especialidade();
    }
}
