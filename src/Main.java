public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println(e + "が発生。");
            System.out.println(e.getMessage());

        }
    }
}
