public final class StringUtils {



    public static Double convertToDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static void main(String[] args){
        System.out.println(StringUtils.convertToDouble("11.2"));
    }
}