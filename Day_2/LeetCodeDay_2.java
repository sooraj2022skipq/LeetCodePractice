
import java.util.Arrays;
import java.util.HashMap;

public class leetCodeDay_2 {

    public static boolean isAnagram(String s, String t) {
        if(t.length()>s.length()){
            return false;
        }else{
            for (int i = 0; i < s.length(); i++) {
                if(!t.contains(s.charAt(i)+"")){
                    System.out.println(t);
                    System.out.println(s.charAt(i));
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) {

        String palindrome = "";
        s = s.replaceAll("[$&+,:;=\\\\?@#|/'<>.^*()%!-]","").toLowerCase().replace(" ","");
        System.out.println(s);
        for (int i =  s.length()-1; i >= 0; i--) {


            palindrome += s.charAt(i);
        }


        return palindrome.equals(s);

    }
    public static int uniqueMorseRepresentations(String[] words) {
        String res =  "";
        String[] result = new String[words.length];
        if(words.length>1){
            String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            String temp = "";
            for (int i = 0; i < words.length; i++) {
                result[i] = "";
                for (int j = 0; j < words[i].length(); j++) {

                    temp += arr[words[i].charAt(j)-97];

                }
                result[i] = temp;
                temp="";
            }
        }else {
            return 1;
        }




        return (int)Arrays.stream(result).distinct().count();
    }

    public static String decodeMessage(String key, String message) {
        int abc = 'a';
        String result = "";
        HashMap<Character,Character> sentence = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if(!sentence.containsKey(key.charAt(i))){
                if(key.charAt(i) == ' '){
                    sentence.put(' ',' ');
                }else{
                    sentence.put( key.charAt(i),(char)abc);

                    abc++;
                }
            }
        }

        for (int i = 0; i < message.length(); i++) {
            result += sentence.get(message.charAt(i));
        }

        return result;
    }


    public static int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                if(students[i] == seats[j]){

                    seats[j] = -1;
                    students[i] = -1;
                    break;
                }
            }

        }

        Arrays.sort(seats);
        Arrays.sort(students);



        for (int i = 0; i <seats.length; i++) {
            if(seats[i] != -1 && students[i] != -1){
                moves += Math.abs(seats[i] - students[i]);
            }
        }

        return moves;
    }

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] newArr = Arrays.copyOf(heights,heights.length);

        Arrays.sort(newArr);


        for (int i = 0; i < heights.length; i++) {
            if(newArr[i] != heights[i]){

                count++;
            }
        }
        return count ;

    }


    public static int ArrayChallenge(int[] arr) {
        // code goes here

        int diff = arr[1] - arr[0];

        boolean arth = false;
        boolean geo = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(diff != (arr[i+1]-arr[i])){
                arth = true;
                break;
            }
        }
        if (arth){
            return 1;
        }
        int mul = arr[1]/arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(mul != arr[i+1]/arr[i]){
                geo = false;
                break;

            }
        }

        if (geo){
            return 0;
        }
        return -1;
    }

    public static void main(String args[]){


        String s = "aacc", t= "ccac";
        System.out.println(Integer.parseInt(s));


    }

}
