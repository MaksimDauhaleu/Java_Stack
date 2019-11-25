public class StringManipTest{
    public static void main(String[] args) {
        // Trip and Concat

        StringManip manipulator = new StringManip();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);
    

        // Int char

        StringManip manip = new StringManip();
        char letter = 'o';
        Integer a = manip.getIndexOrNull("Coding", letter);
        Integer b = manip.getIndexOrNull("Hello World", letter);
        Integer c = manip.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Int str

        StringManip man = new StringManip();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer n = man.getIndexOrNull(word, subString);
        Integer m = man.getIndexOrNull(word, notSubString);
        System.out.println(n); 
        System.out.println(m); 

        // Substring

        StringManip p = new StringManip();
        String word_2 = p.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word_2); 
    }
}