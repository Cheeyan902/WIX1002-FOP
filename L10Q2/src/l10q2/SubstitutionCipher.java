package l10q2;

import java.io.*;
public class SubstitutionCipher implements MessageEncoder{
    
    protected String inputfile, outputfile;
    protected int shift;
    
    public SubstitutionCipher(String inputfile, String outputfile, int shift){
        this.inputfile = "C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L10Q2\\" + inputfile;
        this.outputfile = "C:\\Users\\tiewc\\OneDrive\\Documents\\NetBeansProjects\\L10Q2\\" + outputfile;
        this.shift = shift;
    }
    
    @Override
    public String encode(String plainText){
        String encodedmessage = "";
        for(int i = 0; i<plainText.length(); i++){
            encodedmessage += (char)(plainText.charAt(i) + this.shift);
        }
        return encodedmessage;
    }
    
    @Override
    public String decode(String cipherText) {
        String encodedMessage = "";
        for (int i = 0; i < cipherText.length(); i++) { 
            encodedMessage += (char) (cipherText.charAt(i) - this.shift); 
        }
        return encodedMessage;
    }
    
    public void convertFrom(String type) {
        
        try {
            
            BufferedReader file = new BufferedReader(new FileReader(this.inputfile));
            FileWriter output = new FileWriter(this.outputfile);
            String content = "", converted = "", line;

            while((line = file.readLine()) != null){ 
                content += line + "\n"; 
            }
            if (type.toLowerCase().contains("plain")){ 
                converted = this.encode(content); 
            }
            else if(type.toLowerCase().contains("cipher")){ 
                converted = this.decode(content); 
            }

            output.write(converted);
            System.out.println(converted);
            
            file.close();
            output.close();
            
        }catch(FileNotFoundException e){ 
            System.out.println("File Not Found!"); 
        }catch(IOException e){ 
            System.out.println("Problem with file input."); 
        }
    }
}
