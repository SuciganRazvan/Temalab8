public class Eveniment
{

    public static final int eveniment=50;
    public static final int pretmic=32;
    public static final int pretmare=35;
    private String EventNumber;
    private int Guests;
    public boolean largeEvent;
     private String numarTelefon;
    private int pretoaspete;
    private String tipEveniment;
    public void setEventNumber(String name)
    {

        EventNumber=name;
    }
    public void setTipEveniment(String name2)
    {
        tipEveniment=name2;
    }
    public String getTipEveniment()
    {
        return tipEveniment;
    }
    public void setNumarTelefon(String name1)
    {

        numarTelefon=name1.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }
    public String getnumarTelefon()
    {
        return numarTelefon;
    }
    public void setGuests(int oameni)
    {
        Guests=oameni;
        if(Guests>50)
        {
            pretoaspete=pretmic*Guests;
        }
        else pretoaspete=pretmare*Guests;

    }
    public String getEventNumber()
    {

        return EventNumber;
    }
    public int getGuests()
    {

        return Guests;
    }
    public int getPretoaspete()
    {

        return pretoaspete;
    }

    public  boolean isLargeEvent()
    {
        if(Guests>eveniment)
        {
            return largeEvent=true;
        }
        else return largeEvent=false;
    }}