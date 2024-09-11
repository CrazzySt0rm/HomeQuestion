package newarch.repository;


import newarch.models.Archer;
import newarch.models.Mage;
import newarch.models.Warrior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonRepository extends JpaRepository<Warrior, Long> {// общий репозиторий

    private String attack(Warrior warrior, Mage mage, Archer archer) {

        return ""; //"атакует мечом";
    }

//    private boolean yuseSkill(Warrior berserk, Archer ranger, Mage arcMage) {
//        return true;
//    }



    List<Warrior> warriorList(String name, int power, int defence);

    public static int attackSword(int a, int b) {
        return a + b;
    }

    public static String beat(Warrior nameOne, Mage nameTwo) {
        return nameOne + "beat" + nameTwo;
    }






}
