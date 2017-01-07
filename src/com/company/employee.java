package com.company;

/**
 * Created by vianrosal on 1/6/17.
 */
public class employee {
    //ptph = personal trainer per hour
    public final double retail = .9;
    public final int classPrice = 3;
    public final int ptph = 15;
    public final int pool = 3;
    private double bill = 0;
    public int pl;
    public boolean memb;
    public int cls;
    public int hrs;
    public employee(int q,boolean w,int e,int r){
        pl = q;
        memb = w;
        cls = e;
        hrs = r;
    }
    public employee(){
        //its lit fam
    }
    public double getBill(){
        bill = ((pool*pl) + (cls * classPrice) + (ptph * hrs));
        if (memb){
            bill++;
        }
        return bill *retail;
    }





}
