public class Enigma{

    private String rotorInit[] = 
    {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO
        String dec = "";
        return dec;
    }


    
    public String encrypt(String message){
        //TODO
        String enc = "";
        int innerCount = -1;
        int outerCount = -1;
        int middleCount = -1;
        char innerRotor = 0;
        char outerRotor = 0;
        char middleRotor = 0;
        String step1 = "";
        for (int i = 0; i < message.length(); i++){
            //finds location of first letter in message
            innerCount = rotors[0].indexOf(message.charAt(i));
            outerRotor = rotors[2].charAt(innerCount);
            middleCount = rotors[1].indexOf(outerRotor);
            enc = enc + rotors[2].charAt(middleCount);

            rotate();
        }
        return enc;
    }

    
    private void rotate(){
        if(rotors[0].rotate()){

            if(rotors[1].rotate()){

                rotors[2].rotate();
            }
        }
    }
    
}
