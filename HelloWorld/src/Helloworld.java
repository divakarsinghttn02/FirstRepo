public class Helloworld {
    public static void main(String[] args) {
        String s = "Shekhar";
        String s1 ="Kapoor";
        String s2= s+s1;




        String s3 = s2 + "software" + "developer";
        System.out.println(s3);
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.hashCode());
    }
}
