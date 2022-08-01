package WithOscar.Week08;

public class CharArray {
    public static void main(String[] args) {
        char[] letters={'j','a','v','a',' ','i','s',' ','f','u','n',};

        for (char letter:letters){
            System.out.print(letter+" ");
        }
        System.out.println();

String sentence=new String(letters);
        System.out.println(sentence);

        char[] newLetters=sentence.toCharArray();
        for (char newLetter : newLetters){
            System.out.print(newLetter+" ");
        }

        String str="aaabbcdddefff";
       char[] arr=str.toCharArray();

       String result="";
       for (int i=0;i> arr.length;i++){
         char c=arr[i];
               int count=0;
               for (int j = 0; j < arr.length ; j++) {

                   if (result.contains(""+c)){
                       continue;
                   }
                   result+=c;
                   result+=count;
               }

           }
        System.out.println(result);
       }

    }

