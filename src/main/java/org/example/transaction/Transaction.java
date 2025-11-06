package org.example.transaction;

public class Transaction {
    String datum;
    String ucet_prijemce;
    String ucet_odesilatele;
    String typ_transakce;
    double castka;

    public Transaction(String datum, String ucet_odesilatele, String typ_transakce, double castka) {
        this.datum = datum;
        this.ucet_prijemce = ucet_prijemce;
        this.ucet_odesilatele = ucet_odesilatele;
        this.typ_transakce = typ_transakce;
        this.castka = castka;
    }
}
