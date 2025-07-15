package polimorfismTasks;
/*
Parent of the CTO class

*/
public class Solution8 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Employee {
        public void workHard() {
        }
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Employee implements Businessman {

    }
}
