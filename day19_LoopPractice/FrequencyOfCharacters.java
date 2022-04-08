package day19_LoopPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str ="aabbbcdddaaeebbefffddghhhhjj";
        int count =0;
        String result="";

        for (int k = 0; k < str.length(); k++) {

            char ch=str.charAt(k);      //'a'

            count=0;


            for (int i = 0; i < str.length(); i++) {
                if (ch==str.charAt(i)){
                    count++;

                }
            }

            //str=str.replaceAll(str.substring(0,1), "");
            if (result.contains(""+ch)){
                continue;
            }
            result+=str.charAt(k);
            result+=count;


        }



        System.out.println(result);



    }
}
