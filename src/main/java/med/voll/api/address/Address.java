package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String logradouro;
    private String bairro;
    private String cep;
    private String address_number;
    private String complemento;
    private String city;
    private String uf;

    public Address(AddressDTO address) {
        this.logradouro = address.logradouro();
        this.bairro = address.bairro();
        this.cep = address.cep();
        this.address_number = address.address_number();
        this.complemento = address.complemento();
        this.city = address.city();
        this.uf = address.uf();
    }
}
