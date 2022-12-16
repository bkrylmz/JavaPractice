package day28_ArrayList;

public class StrongPassport {
    public static void main(String[] args) {

        String passport = "Cydeo1990@";
        boolean r1 = passport.length()>=8&&!passport.contains(" ");// has at least 8 char and has not " "
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = passport.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2 = true;
            }
            else if(Character.isLowerCase(each)){
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else {
                r4 = true;
            }
        }
        boolean isStrongPassport = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassport = " + isStrongPassport);

            }
            public static boolean isStrongPassport(String Passport){
                String passport = "Cydeo1990@";
                boolean r1 = passport.length()>=8&&!passport.contains(" ");// has at least 8 char and has not " "
                boolean r2 = false; // has upper case
                boolean r3 = false; // has lower case
                boolean r4 = false; // has special char
                boolean r5 = false; // has digit

                char[] chars = passport.toCharArray();
                for (char each : chars) {
                    if(Character.isUpperCase(each)){
                        r2 = true;
                    }
                    else if(Character.isLowerCase(each)){
                        r3 = true;
                    } else if (Character.isDigit(each)) {
                        r5 = true;
                    }else {
                        r4 = true;
                    }
                }
                boolean isStrongPassport = r1 && r2 && r3 && r4 && r5;
                return isStrongPassport;

            }




}
