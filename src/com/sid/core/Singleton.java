package com.sid.core;

public final class Singleton {
    
    private static final Singleton sinleton_inst= new Singleton();
    public static final Boolean have_Instance = true;
    private final Boolean inst_Avail=have_Instance;
    
    private Singleton(){};
    
    public final Boolean isInstAvail(){
    
        return inst_Avail;
    }
    
    public static void main(String[] args) {
        System.out.println(sinleton_inst.isInstAvail() ? "Instance is there." : "No instance");
    }
    
}
