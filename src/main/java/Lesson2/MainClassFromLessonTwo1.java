package Lesson2;

public class MainClassFromLessonTwo1 {
    public static void main(String[] args){
        test();
    }
    private  static  void test(){
        String st1="st1";
        String st2="st2";
        int n =5;

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++ ){
            if (i%2!=0){
                sb.append(st2).append(" ") ;

            } else {
                sb.append(st1).append(" ");
            }

        }
        System.out.printf("  %s", sb);

    }
}
