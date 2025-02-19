public class Rotor {

    
    private String rotorValues;
    private char startChar;
    private char currentChar;

    private int numRot;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;

        this.currentChar = charAt(0);
        numRot = 0;
        
        while(!this.rotate());
            
    }
    //returns true when current character matches starting character
    //return false otherwise
    //rotates one click clockwise
    public boolean rotate(){
        this.currentChar = charAt(0);

        int length = this.rotorValues.length();
        this.rotorValues = this.rotorValues.substring(length-1, length) + this.rotorValues.substring(0,length-1);

        if (this.startChar == currentChar){
            this.currentChar = charAt(0);
            return true;
        }
        else
            return false;
    }
    
    //@return index at String where a given character appears
    public int indexOf(char c){
        //TODO
        char[] stringArray = this.rotorValues.toCharArray();
        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i] == c){
                return i;
            }
        }
        return -1; 
    }
    //@return char character located at param idx
    public char charAt(int idx){
        //TODO
        return this.rotorValues.charAt(idx);
    }

    //HELPER METHOD: if 27 rotations occured, return true
    //you can get status of rotation without causing a rotation accidentally
    public boolean fullyRotated(){
        if (this.startChar == this.currentChar){
            return true;
        }
        return false;
    }
}
    
