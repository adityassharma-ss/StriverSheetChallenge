public class FindTheIndexOfTheFirstOccurenceInAString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int ans = strStr(haystack,needle);
        System.out.println(ans);
    }

    private static int strStr(String haystack, String needle){
        if(needle.length() == 0 || haystack.length() < needle.length()){
            return -1;
        }

        for(int i=0; i< haystack.length() - needle.length() +1; i++){
            String substr = haystack.substring(i, i+needle.length());
            if(substr.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
