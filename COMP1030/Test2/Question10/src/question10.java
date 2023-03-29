public class question10 {
    public static void main(String[] args) {

    String st1 = "adfpadfpadfpadfpadfp";
    String st2 = "adf";
    int times = 0;

    for(int i = 0; i <= st1.length() - st2.length(); i++) {
        String substring = st1.substring(i, i + st2.length());
        if (substring.equals(st2)) {
            times = times + 1;
            }
        }
        System.out.print(times);
    }
}