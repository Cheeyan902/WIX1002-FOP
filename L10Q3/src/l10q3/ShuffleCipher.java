package l10q3;

import java.io.*;

public class ShuffleCipher implements MessageEncoder{
    
    protected String inputfile, outputfile;
    protected int shuffle;
    
    public ShuffleCipher(String inputfile, String outputfile, int N){
        
        this.inputfile = "C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L10Q3\\" + inputfile;
        this.outputfile = "C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L10Q3\\" + outputfile;
        this.shuffle = N;
    }
    
    @Override
    public String encode(String plainText){
        int half = plainText.length() / 2;
        String firstHalf = plainText.substring(0, half); //substring(0,half) means the elements from 0 to half-1
        String secondHalf = plainText.substring(half); //substring (half) means the elements from half until the end
        StringBuilder shuffledText = new StringBuilder();
        for (int i = 0; i < half; i++) {
            shuffledText.append(firstHalf.charAt(i));
            shuffledText.append(secondHalf.charAt(i));
        }
        return shuffledText.toString();
    }
    
    @Override
    public String decode(String cipherText) {
       String left = "", right = "";
        int alternateLength = cipherText.length() / 2 * 2;
        for (int i = 0; i < alternateLength; i += 2) {
            left += cipherText.charAt(i);
            right += cipherText.charAt(i + 1);
        }
        if(cipherText.length() % 2 != 0){
            return left + right + cipherText.charAt(cipherText.length() - 1); 
        }
        return left + right;
    }
    
    public void shuffleFrom(String type){
        
          try {
              
            BufferedReader file = new BufferedReader(new FileReader(this.inputfile));
            FileWriter output = new FileWriter(this.outputfile);
            
            String content = "", line;

            while((line = file.readLine()) != null){ 
                content += line + "\n"; 
            }
            for(int i = 0; i < this.shuffle; i++){
                if (type.toLowerCase().contains("normal")){
                    content = encode(content); //content inside input file will become text for method encode or decode
                }else if(type.toLowerCase().contains("shuffle")){
                    content = decode(content); 
                }
            }

            output.write(content);
            System.out.println(content);
            
            file.close();
            output.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!"); 
        }catch(IOException e){
            System.out.println("Problem with file input"); 
        }
    }
}
