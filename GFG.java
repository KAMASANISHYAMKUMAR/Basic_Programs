class GFG {

    public static String camelToSnake(String str) {

        String result = "";
        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);

        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result
                        = result
                        + Character.toLowerCase(ch);
            } else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        String str = "GeeksForGeeks";
        System.out.print(camelToSnake(str));
    }
}