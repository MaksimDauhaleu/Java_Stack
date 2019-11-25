public class StringManip{
    public String trimAndConcat(String str1, String str2) {
        String newString = str1.trim() + str2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String str, char x){
        Integer n = str.indexOf(x);
        return n;
    }
    public Integer getIndexOrNull(String str1, String str2){
        Integer rtn_int = str1.indexOf(str2);
        return rtn_int;
    }
    public String concatSubstring(String str1, Integer int1,Integer int2, String str2){
        String new_str = str1.substring(int1,int2);
        String f_str = new_str + str2;
        return f_str;
    }
}
