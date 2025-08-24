package abstractclasses;
/*
Robot wars

*/
public class Solution23 {
    public static void main(String[] args) {
        Robot amigo = new Robot("Amigo");
        Robot enemy = new Robot("Enemy");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defend();
        System.out.println(String.format("%s attacked %s: its %s  was attacked, and its %s was defended",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }

    public interface CanAttack {
        BodyPart attack();
    }

    public final class BodyPart {
        final static BodyPart LEG = new BodyPart("leg");
        final static BodyPart HEAD = new BodyPart("head");
        final static BodyPart ARM = new BodyPart("hand");

        private String bodyPart;

        private BodyPart(String bodyPart) {
            this.bodyPart = bodyPart;
        }

        @Override
        public String toString() {
            return this.bodyPart;
        }
    }
    public class AbstractRobot {
    }

}
