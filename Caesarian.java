public class Caesarian{
    
    public static StringBuffer rightCipher(String message, int key){
        StringBuffer result = new StringBuffer();
        char current;
        for(int i = 0; i < message.length(); i++){
            current = message.charAt(i);
            if(current < '[' && current > '@'){
                
                result.append((char)(((int)current + key - 65) %26 +65));
            }
            else if(current > '`' && current < '{'){
                
                result.append((char)(((int)current + key - 97) %26 + 97));
            }
            else if(current == ' '){
                result.append(current);
            }
        }
        return result;
    }
    public static StringBuffer leftCipher(String message, int key){
        StringBuffer result = new StringBuffer();
        char current;
        for(int i = 0; i < message.length(); i++){
            current = message.charAt(i);
            if(current < '[' && current > '@'){
                int temp = (int)(current - key - 65) %26;
                if(temp < 0){
                    temp = 91 + temp;
                }
                else
                    temp = temp + 65;
                result.append((char)(temp));
            }
            else if(current > '`' && current < '{'){
                int temp = ((int)current - key -97) % 26;
                if(temp < 0){
                    temp = 123 + temp;
                }
                else
                    temp = temp + 97;
                result.append((char)temp);
                
            }
            else if(current == ' '){
                result.append(current);
            }
        }
        return result;

    }
    public static void main(String args[]){
        System.out.println(Caesarian.rightCipher("This Is A Test", 4));
        System.out.println(Caesarian.leftCipher("This Is A Test", 4));
    }
}