
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Recur<I> {
    public I func;
}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//class Tree extends HashMap<String, Tree>{}

public class Recursive{

    public static void func(int a, List<Integer> b){
        a += 1;
        b.add(1);
    }

//    public static Tree buildTree(List<String> sentence){
//        Tree root = new Tree();
//        for (String s:
//             sentence) {
//            Tree base = root;
//            for (String word :
//                    s.split(" ")) {
//                if(!base.containsKey(word)){
//                    base.put(word, new Tree());
//                    base =base.get(word);
//                }
//
//            }
//return root;
//        }
//    }
    public static String recursive(String s){
        if(s.length()<=1){
            return s;
        }

        String firstChar = s.substring(0,1);
        String lastChar = s.substring(1);

        return recursive(lastChar)+firstChar;

    }
//    static void deleteBlank(List<String> names) {
//    }

    public static int[] runningSum(int[] nums) {


        int sum = 0;


        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=i ; j++) {
                sum += nums[j];
            }
            arr[i] = sum;
            sum = 0 ;

        }
        return arr;
    }


    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] ar = runningSum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ar[i]);
        }


//        int a = 0;
//        List<Integer> b = new ArrayList<>();
//        func(a,b);
//        System.out.println(a+ b.toString());
//        Recur<Function<Integer,Integer>> recurs = new Recur<>();
//        recurs.func = (n) -> n <= 1 ? 1 : n * recurs.func.apply(n-1);
//
//        int g = recurs.func.apply(4);
//        System.out.println(g);



//        List<String> names = new ArrayList<>(Arrays.asList("Ajmad","Sooraj","","","time"));
//        for (int i = 0; i <names.size(); i++) {
//            if(names.get(i).length()==0){
//                names.remove(i);
//            }
//
//        }
//
//        System.out.println((names.toString()));
    }


