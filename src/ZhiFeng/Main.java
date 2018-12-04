package ZhiFeng;

public class Main {

    public static void main(String[] args) {
        StringChecker sc1 = new CodeWordChecker(5,6,"$");
        StringChecker sc2 = new CodeWordChecker("pass");

        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("HappyCode"));

        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("MyPassPort"));
        System.out.println(sc2.isValid("Happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
