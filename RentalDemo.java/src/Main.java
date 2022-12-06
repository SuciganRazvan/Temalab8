import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sammy one = new Sammy();
        one = getData(one);
        System.out.print("DETALIILE SAMMY");
        System.out.println("Numele= "+one.getNrContract()+ "\n Numarul de ore   "+one.getHoursAndMinutes()+" si minute"+one.getNrOre()+ "\n  Numarul de minute extra= "+one.getNrOre()+" \n Pretul total = "+one.getPret()+" \nTariful pe ora este= \n "+one.gettarif() );
        one.motto();

    }
    public static Sammy getData(Sammy san)
    {
        String name,z,numarTelefon,repNumar,nt,echipament;
        int orele;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Dati numele = ");
        name= keyboard.nextLine();
        System.out.print("Dati numarul de minute");
        orele= keyboard.nextInt();
        name = keyboard.nextLine();
        z = name;
        for (int i = 0; i < name.length(); i++) {
            if(name.length()==4) {
                if (name.charAt(0) >= 'a' && name.charAt(0) <= 'z') {
                    if (name.charAt(1) >= '0' && name.charAt(1) <= '9') {
                        if (name.charAt(2) >= '0' && name.charAt(2) <= '9') {
                            if (name.charAt(3) >= '0' && name.charAt(3) <= '9') {
                                name = z;
                            } else name = "A000";
                        } else name = "A000";
                    } else name = "A000";
                } else name = "A000";
            }else name = "A000";
        }
        System.out.print("Dati numarul de telefon = ");
        numarTelefon=keyboard.nextLine();

        repNumar=numarTelefon.replaceAll("[^a-zA-Z0-9]","");
        nt=repNumar;
        for(int j=0;j<repNumar.length();j++)
        {
            if(repNumar.length()==10)
            {
                repNumar=nt;
            }
            else repNumar="0000000000000000";
        }



        System.out.print("Dati tipul de echipament  = ");
        echipament=keyboard.nextLine();
        String d = name.toUpperCase();
        san.setContractNumber(d);
        san.setHoursAndMinutes(orele);
        san.setNrOreextra(orele);
        san.setNumarTelefon(repNumar);
        san.setEchipament(echipament);
        return san;
    }


}