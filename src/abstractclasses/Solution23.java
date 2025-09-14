package abstractclasses;

/*
Robot wars

*/
public class Solution23 {
    public class Main {
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
            System.out.println(String.format("%s attacked %s: its %s was attacked, and its %s was defended",
                    robotFirst.getName(), robotSecond.getName(), attacked, defended));
        }

        // ========================== INTERFACES ==========================
        public interface CanAttack {
            BodyPart attack();
        }

        public interface CanDefend {
            BodyPart defend();
        }

        // ========================== BODY PART ==========================
        public static final class BodyPart {
            public static final BodyPart CHEST = new BodyPart("chest");
            public static final BodyPart LEG = new BodyPart("leg");
            public static final BodyPart HEAD = new BodyPart("head");
            public static final BodyPart ARM = new BodyPart("arm");

            private final String bodyPart;

            private BodyPart(String bodyPart) {
                this.bodyPart = bodyPart;
            }

            @Override
            public String toString() {
                return this.bodyPart;
            }
        }

        // ========================== ABSTRACT ROBOT ==========================
        public static abstract class AbstractRobot implements CanAttack, CanDefend {
            private String name;
            private int attackCount;
            private int defendCount;

            public AbstractRobot(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public BodyPart attack() {
                attackCount++;
                switch (attackCount) {
                    case 1:
                        return BodyPart.ARM;
                    case 2:
                        return BodyPart.HEAD;
                    case 3:
                        return BodyPart.LEG;
                    default:
                        attackCount = 0;
                        return BodyPart.CHEST;
                }
            }

            @Override
            public BodyPart defend() {
                defendCount++;
                switch (defendCount) {
                    case 1:
                        return BodyPart.HEAD;
                    case 2:
                        return BodyPart.LEG;
                    case 3:
                        return BodyPart.CHEST;
                    default:
                        defendCount = 0;
                        return BodyPart.ARM;
                }
            }
        }

        // ========================== ROBOT ==========================
        public static class Robot extends AbstractRobot {
            public Robot(String name) {
                super(name);
            }
        }
    }
}