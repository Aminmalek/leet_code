public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String str = "?";

        for (int i = 0; i < strs[0].length(); i++) {
            String common = String.valueOf(strs[0].charAt(i));
            System.out.println(common);
            for (int j = 1; j < strs.length-1; j++) {
                System.out.println(strs[j]);
                if(strs[j].contains(common)){
                    str += common;
                    common += String.valueOf(strs[0].charAt(i + 1));
                }else{

                }
            }
        }
         return str;

    }







    public static void main(String[] args) {
        String[] arr = {"sokound", "mound", "ounxc"};
        System.out.println(longestCommonPrefix(arr));
    }


}
