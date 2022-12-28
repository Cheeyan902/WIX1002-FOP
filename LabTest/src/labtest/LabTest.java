package labtest;

public class LabTest {

    public static void main(String[] args) {
        
        String [] reg = {"s12345","s24567","s23789","s14569","s18743"};
        String [] name = {"Ali","Beng","Carmen","Dinesh","Emilia"};
        Double [] marks = {77.9,23.5,90.3,68.0,75.2};
        
        System.out.println("Original Data: ");
        System.out.printf("%-5s %8s %15s\n", "Reg No.", "Name", "FOP Marks");
        System.out.println("+-----------------------------------+");
        
        for(int i=0; i<reg.length; i++){
            System.out.printf("%-11s %-10s %-15.2f\n", reg[i], name[i], marks[i]);
        }
        
        System.out.println("");
        System.out.println("Data (sorted by ID): ");
        System.out.printf("%-5s %8s %15s\n", "Reg No.", "Name", "FOP Marks");
        System.out.println("+-----------------------------------+");
        
        for(int i=0;i<reg.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(reg[i].compareTo(reg[j])<0)
                {
                   String a = reg[j];
                   reg[j] = reg[i];
                   reg[i]= a;
                   
                   String b =name[j];
                   name[j]=name[i];
                   name[i]=b;
                   double c = marks[j];
                   marks[j]=marks[i];
                   marks[i]=c;
                }
            }
        }
        for(int i=0;i<reg.length;i++)
        {
            System.out.printf("%-11s %-10s %-15.2f\n", reg[i], name[i], marks[i]);
                    }
        System.out.println("");
        

        System.out.println("Data (sorted by Marks): ");
        System.out.printf("%-5s %8s %15s\n", "Reg No.", "Name", "FOP Marks");
        System.out.println("+-----------------------------------+");
        
          for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<reg.length-1;j++)
            {
                if(marks[i]>marks[j])
                {
                   String a = reg[j];
                   reg[j] = reg[i];
                   reg[i]= a;
                   
                   String b =name[j];
                   name[j]=name[i];
                   name[i]=b;
                   double c = marks[j];
                   marks[j]=marks[i];
                   marks[i]=c;
                }
            }
           
        }
        for(int i=0;i<marks.length;i++)
        {
             System.out.printf("%-11s %-10s %-15.2f\n", reg[i], name[i], marks[i]);
        }
        System.out.println("");
        
        System.out.println("Data (sorted by Name): ");
        System.out.printf("%-5s %8s %15s\n", "Reg No.", "Name", "FOP Marks");
        System.out.println("+-----------------------------------+");
        
        for(int i=0;i<reg.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(name[i].compareTo(name[j])<0)
                {
                   String a = reg[j];
                   reg[j] = reg[i];
                   reg[i]= a;
                   
                   String b =name[j];
                   name[j]=name[i];
                   name[i]=b;
                   double c = marks[j];
                   marks[j]=marks[i];
                   marks[i]=c;

                }
            }
        }
            
        for(int i=0;i<reg.length;i++)
        {
          System.out.printf("%-11s %-10s %-15.2f\n", reg[i], name[i], marks[i]);        }
        System.out.println("");
    }
    
    }
