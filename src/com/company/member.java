package com.company;

/**
 * Created by vianrosal on 1/6/17.
 */
public class member extends employee{
    // ptph = personal trainer/hr
    public final double retail = .8;
    public final int classPrice = 8;
    public final int ptph = 20;
    public final int pool = 10;
    private double bill = 0;
    public int pl;
    public final boolean memb = false;
    public int cls;
    public int hrs;
    public member(){}
    public member(int q,boolean w,int e,int r){
        pl = q;
        //memb = w;
        cls = e;
        hrs = r;
    }
    public double getBill(){
        bill = ((pool*pl) + (cls * classPrice) + (ptph * hrs));
        return bill *retail;
    }
}
