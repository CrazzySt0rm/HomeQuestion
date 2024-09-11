package newarch.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import newarch.repository.CommonRepository;
@Entity
@Table(name = "warrior")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Warrior {

    private String name;
    private int power;
    private int defence;

    public static String Attack() {

        return " бьет мечом";
    }

    public static boolean yuseSkill() {
        return false;
    }


    class Berserk extends Warrior {

        Berserk randomBerserk = new Berserk();






    }

}
