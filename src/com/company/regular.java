package com.company;

/**
 * Created by vianrosal on 1/6/17.
 */
public class regular extends member{
    //ptph = personal trainer per hour
    public final double retail = 1;
    public final int classPrice = 10;
    public final int ptph = 25;
    public final int pool = 0;    //o b/c n/a(undef.)
    private double bill = 0;
    public int pl;
    public boolean memb;
    public int cls;
    public int hrs;
    public regular(int q,boolean w,int e,int r){
        pl = q;
        memb = w;
        cls = e;
        hrs = r;
    }
    public double getBill(){
        bill = ((pool*pl) + (cls * classPrice) + (ptph * hrs));
        if (memb){
            bill+=65;
        }
        return bill *retail;
    }



}
