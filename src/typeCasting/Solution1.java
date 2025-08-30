package typeCasting;
/*
Building and School

*/

public class Solution1 {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //write your code here
        return null;
    }

    public static Building getBuilding() {
        //write your code here
        return null;
    }

    static class School /*write your code here*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*write your code here*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}

