package com.github.appreciated.apexcharts.config.chart.animations;

public enum Easing {
    linear("linear"),
    easein("easein"),
    easeout("easeout"),
    easeinout("easeinout");
    private String name;
    Easing(String name){
        this.name = name;
    }
}
