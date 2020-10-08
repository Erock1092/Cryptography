public class Caesarian{
    
    private class Key{
        private int key = 0;
        private boolean isLeft = false;

    }
    private Key key;
    public void setKey(int key, boolean isLeft){
        this.key.isLeft = isLeft;
        this.key.key = key;

        
    }
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
    /*public static StringBuffer leftCipher(String message){
        for(int i = 0; i < message.length(); i++){

        }

    }*/
    public static void main(String args[]){
        System.out.println(Caesarian.rightCipher("This is a test", 4));
    }
}