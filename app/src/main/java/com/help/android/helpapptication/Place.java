package com.help.android.helpapptication;

public class Place {
    private String NAZWA;
    private String ADRES;
    private String TELEFON;
    private String INFORMACJA;
    private String GODZINY_OTWARCIA;
    private Boolean SCHRONIENIE;
    private Boolean DOSTEP_DO_KUCHNI;
    private Boolean DOSTEP_DO_LAZIENEK;
    private Boolean DOSTEP_DO_PRALNI;
    private String FORMA_POMOCY_OPIS;

    @Override
    public String toString() {
        return "Place{" +
                "NAZWA='" + NAZWA + '\'' +
                ", ADRES='" + ADRES + '\'' +
                ", TELEFON='" + TELEFON + '\'' +
                ", INFORMACJA='" + INFORMACJA + '\'' +
                ", GODZINY_OTWARCIA='" + GODZINY_OTWARCIA + '\'' +
                ", SCHRONIENIE=" + SCHRONIENIE +
                ", DOSTEP_DO_KUCHNI=" + DOSTEP_DO_KUCHNI +
                ", DOSTEP_DO_LAZIENEK=" + DOSTEP_DO_LAZIENEK +
                ", DOSTEP_DO_PRALNI=" + DOSTEP_DO_PRALNI +
                ", FORMA_POMOCY_OPIS='" + FORMA_POMOCY_OPIS + '\'' +
                '}';
    }

    public Place(String NAZWA, String ADRES, String TELEFON, String INFORMACJA, String GODZINY_OTWARCIA, Boolean SCHRONIENIE, Boolean DOSTEP_DO_KUCHNI, Boolean DOSTEP_DO_LAZIENEK, Boolean DOSTEP_DO_PRALNI, String FORMA_POMOCY_OPIS) {
        this.NAZWA = NAZWA;
        this.ADRES = ADRES;
        this.TELEFON = TELEFON;
        this.INFORMACJA = INFORMACJA;
        this.GODZINY_OTWARCIA = GODZINY_OTWARCIA;
        this.SCHRONIENIE = SCHRONIENIE;
        this.DOSTEP_DO_KUCHNI = DOSTEP_DO_KUCHNI;
        this.DOSTEP_DO_LAZIENEK = DOSTEP_DO_LAZIENEK;
        this.DOSTEP_DO_PRALNI = DOSTEP_DO_PRALNI;
        this.FORMA_POMOCY_OPIS = FORMA_POMOCY_OPIS;
    }

    public String getNAZWA() {
        return NAZWA;
    }

    public void setNAZWA(String NAZWA) {
        this.NAZWA = NAZWA;
    }

    public String getADRES() {
        return ADRES;
    }

    public void setADRES(String ADRES) {
        this.ADRES = ADRES;
    }

    public String getTELEFON() {
        return TELEFON;
    }

    public void setTELEFON(String TELEFON) {
        this.TELEFON = TELEFON;
    }

    public String getINFORMACJA() {
        return INFORMACJA;
    }

    public void setINFORMACJA(String INFORMACJA) {
        this.INFORMACJA = INFORMACJA;
    }

    public String getGODZINY_OTWARCIA() {
        return GODZINY_OTWARCIA;
    }

    public void setGODZINY_OTWARCIA(String GODZINY_OTWARCIA) {
        this.GODZINY_OTWARCIA = GODZINY_OTWARCIA;
    }

    public Boolean getSCHRONIENIE() {
        return SCHRONIENIE;
    }

    public void setSCHRONIENIE(Boolean SCHRONIENIE) {
        this.SCHRONIENIE = SCHRONIENIE;
    }

    public Boolean getDOSTEP_DO_KUCHNI() {
        return DOSTEP_DO_KUCHNI;
    }

    public void setDOSTEP_DO_KUCHNI(Boolean DOSTEP_DO_KUCHNI) {
        this.DOSTEP_DO_KUCHNI = DOSTEP_DO_KUCHNI;
    }

    public Boolean getDOSTEP_DO_LAZIENEK() {
        return DOSTEP_DO_LAZIENEK;
    }

    public void setDOSTEP_DO_LAZIENEK(Boolean DOSTEP_DO_LAZIENEK) {
        this.DOSTEP_DO_LAZIENEK = DOSTEP_DO_LAZIENEK;
    }

    public Boolean getDOSTEP_DO_PRALNI() {
        return DOSTEP_DO_PRALNI;
    }

    public void setDOSTEP_DO_PRALNI(Boolean DOSTEP_DO_PRALNI) {
        this.DOSTEP_DO_PRALNI = DOSTEP_DO_PRALNI;
    }

    public String getFORMA_POMOCY_OPIS() {
        return FORMA_POMOCY_OPIS;
    }

    public void setFORMA_POMOCY_OPIS(String FORMA_POMOCY_OPIS) {
        this.FORMA_POMOCY_OPIS = FORMA_POMOCY_OPIS;
    }
}
