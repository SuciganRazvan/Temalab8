public class Sammy {
    public static final int ora=60;
    public static final int rata=40;
    private String nrContract;
    private String numarTelefon;
    private String echipament;
    private int nrOreextra;
    private int minute;
    private int  HoursAndMinutes;
    private int pret;
    public void setContractNumber(String contact)
    {
        nrContract=contact;
    }
    public void setHoursAndMinutes(int orele) {
        HoursAndMinutes = orele / ora;
    }
    public void setEchipament(String echipament1)
    {
        echipament=echipament1;
    }
    public String getEchipament()
    {
        return echipament;
    }
    public static void motto()
    {

        System.out. print("MOTTOTOTOT");
    }
    public void setNumarTelefon(String numar)
    {
        numarTelefon=numar.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNrOreextra(int inchiere)
    {
        int inchiriereextra = 0, inchiereMeh;

        if (inchiere > 60)
        {
            for(int i = 60; i < inchiere; i++)
            {
                inchiriereextra++;

            }
        }

        inchiereMeh=inchiere+inchiriereextra;
        nrOreextra=inchiriereextra;
        pret=inchiereMeh;
    }

    public String getNrContract()
    {
        return nrContract;
    }

    public int getHoursAndMinutes() {
        return HoursAndMinutes;
    }
    public int getNrOre()
    {
        return nrOreextra;

    }
    public int getPret()
    {
        return HoursAndMinutes*rata+nrOreextra;
    }
    public int gettarif()
    {
        return rata;
    }

}