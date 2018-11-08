package vaadin.com.vaadinpostgres;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String website;

    public Company (String name, String website) {
        this.name = name;
        this.website = website;
    }

}
