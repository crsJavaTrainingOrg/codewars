package hu.adam.sevenKyu;

public class AritmetikaiOsszeadas{

    int[] helyiErtekek = new int[4];
    int maradek = 0;
    StringBuilder result = new StringBuilder();

    public  String sum(String a, String b){
        for(int i  = b.length()-1; i >= 0; i--){
            helyiErtekek[i] = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + maradek;

            if (helyiErtekek[i] >= 10){
                maradek = 1;
                helyiErtekek[i] = helyiErtekek[i] - 10;

            }

            else{
                maradek = 0;
            }

        }
        for(int i = 0; i < helyiErtekek.length; i++){
            if(i == 0 && helyiErtekek[i]==0){
                result.append("");
            }
            else {
                result.append(helyiErtekek[i]);
            }
        }
        System.out.print(result.toString());
        return result.toString();
    }

}