package Lesson2;

public class MainClassFromLessonTwo2 {
    public static void main(String[] args){
        test1();
    }
    private  static  void test1(){
       int k=0;
       int sum=0;
       String string="aaaabbbccddd";
        //char[] arr = new char[]{a, a, a, a, b, b, b, c, d, d};
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length-1; i++) {
            if ((chars[i]==chars[i+1] ) || (chars[i]==chars[i]))   {
                k=k+1;
                //sb.append(chars[i]).append(k);
                sum=k;
                if (chars[i]!=chars[i+1] ) {
                    k=0;
                    sb.append(chars[i]).append(sum);
                }

            }
        }


        System.out.println(sb);
    }
}
