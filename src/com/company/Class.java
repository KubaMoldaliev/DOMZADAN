package com.company;

public class Class {
    private int bytynSAn;
    private String soz;
    private int[] sanSaktayt;

    public Class(int bytynSAn, String soz, int[] sanSaktayt) {
        this.bytynSAn = bytynSAn;
        this.soz = soz;
        this.sanSaktayt = sanSaktayt;
    }

    public int getBytynSAn() {
        return bytynSAn;
    }

    public void setBytynSAn(int bytynSAn) {
        this.bytynSAn = bytynSAn;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getSanSaktayt() {
        return sanSaktayt;
    }

    public void setSanSaktayt(int[] sanSaktayt) {
        this.sanSaktayt = sanSaktayt;
    }
}
