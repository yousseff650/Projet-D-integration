package com.example.projetdintergration;

public class ExempleDemande {

    private int im1,im2,menu;
    private String text1,text2;



    public int getIm1() {
        return im1;
    }

    public int getIm2() {
        return im2;
    }

    public int getMenu() {
        return menu;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public void setIm1(int im1) {
        this.im1 = im1;
    }

    public void setIm2(int im2) {
        this.im2 = im2;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public ExempleDemande(int im1, String text1 ,int im2,String text2 ) {
        this.im1 = im1;
        this.im2 = im2;
        this.menu = menu;
        this.text1 = text1;
        this.text2 = text2;
    }
}
