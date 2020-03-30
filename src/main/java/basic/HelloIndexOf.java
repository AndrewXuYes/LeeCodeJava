package basic;

public class HelloIndexOf {

    public static int helleIndexof(String org, String comper) {
        int orglen = org.length();
        int comperlen = comper.length();

        if (orglen < 1 || comperlen < 1) return -1;

        for (int index = 0, mark = 0; index < orglen - comperlen + 1; index++, mark = 0) {
            while (org.charAt(mark + index) == comper.charAt(mark)) {
                if (++mark >= comperlen) return index;
            }
        }
        return -1;
    }

}
