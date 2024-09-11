package newarch.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import newarch.models.Archer;
import newarch.models.Mage;
import newarch.models.Warrior;
import newarch.repository.CommonRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public abstract class Arena {

    private static CommonRepository commonRepository;

//    public static String Attack() {
//
//        return " бьет мечом";
//    }

    public static String fight() {
        Warrior berserk = new Warrior("Берсерк", 100, 200);
        Mage arcMage = new Mage("Маг", 500, 0);
        Warrior knight = new Warrior("Рыцарь", 200, 700);
        if (berserk.getPower() > 90) {
            System.out.println(berserk.getName() + Warrior.Attack());
            if (Mage.Attack().equals(Warrior.Attack())) {
                System.out.println(arcMage.getName() + "бьет как воин");
            }else {
                System.out.println(arcMage.getName() + Mage.Attack());
            }
        }else {
            System.out.println("ничего не происходит");
        }

        return "";
    }

    public static String shinjitsu() {
        Warrior berserk = new Warrior("Берсерк", 100, 200);
        Mage arcMage = new Mage("Маг", 500, 0);
        Warrior knight = new Warrior("Рыцарь", 200, 700);
        if (knight.getDefence() < arcMage.getPower()) {
            System.out.println("рыцарь не наносит удар");
        }
        if (knight.getDefence() > arcMage.getPower()) {
            System.out.println("рыцарь наносит удар");
        }
        if (berserk.getDefence() > arcMage.getPower()) {
            System.out.println(" берсерк побеждает");
        }
        if (berserk.getDefence() < arcMage.getPower()) {
            System.out.println(" берсерк проиграл");
        }
        return "";
    }

    public static String fightClub() {
        Warrior berserk = new Warrior("Берсерк", 100, 200);
        Mage arcMage = new Mage("Маг", 500, 0);
        Warrior knight = new Warrior("Рыцарь", 200, 700);
        if (berserk.yuseSkill()) {
            System.out.println(berserk.getName() + " " + Warrior.Attack());
        } else {
            System.out.println(berserk.getName() + " не сумел нанести удар");
        }
        if (arcMage.yuseSkill()) {
            System.out.println(arcMage.getName() + " " + Mage.Attack());
        }else {
            System.out.println(arcMage.getName() + " попал фаерболом себе в ногу");
        }
        if (knight.yuseSkill()) {
            System.out.println(knight.getName() + " " + Warrior.Attack());
        }

        return "";
    }


    public static String tryFight() {

        return commonRepository.warriorList("Берсерк", 5, 7).toString();




    }

    public static int nextFight() {
        return CommonRepository.attackSword(5, 9);
    }

    public static String nextFightTwo {
        Warrior berserk = new Warrior("Берсерк", 100, 200);
        Mage arcMage = new Mage("Маг", 500, 0);
        Warrior knight = new Warrior("Рыцарь", 200, 700);
        return CommonRepository.beat(berserk.getName(), arcMage.getName());
    }
}
