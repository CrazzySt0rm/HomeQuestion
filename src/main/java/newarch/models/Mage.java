package newarch.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mage {

    private String name;
    private int power;
    private int defence;

    public static String Attack() {

        return " запустил огненный шар";
    }

    public static boolean yuseSkill() {
        return false;
    }
}
