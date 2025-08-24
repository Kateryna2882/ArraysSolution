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

    public static class Robot extends AbstractRobot {
        String name;

        public Robot(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
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

    public interface CanDefend {
        BodyPart defend();
    }

    public static final class BodyPart {
        final static BodyPart CHEST = new BodyPart("chest") ;
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

    public class AbstractRobot implements CanAttack, CanDefend {
        private int hitCount;

        public BodyPart attack() {
            BodyPart attackedBodyPart = null;
            hitCount = hitCount + 1;

            if (hitCount == 1) {
                attackedBodyPart = BodyPart.ARM;
            } else if (hitCount == 2) {
                attackedBodyPart = BodyPart.HEAD;
            } else if (hitCount == 3) {
                attackedBodyPart = BodyPart.LEG;
            } else {
                hitCount = 0;
                attackedBodyPart = BodyPart.CHEST;
            }

            return attackedBodyPart;
        }

        public BodyPart defend() {
            BodyPart defendedBodyPart = null;
            hitCount = hitCount + 2;

            if (hitCount == 1) {
                defendedBodyPart = BodyPart.HEAD;
            } else if (hitCount == 2) {
                defendedBodyPart = BodyPart.LEG;
            } else if (hitCount == 3) {
                defendedBodyPart = BodyPart.CHEST;
            } else {
                hitCount = 0;
                defendedBodyPart = BodyPart.ARM;
            }
            return defendedBodyPart;
        }
    }
}
