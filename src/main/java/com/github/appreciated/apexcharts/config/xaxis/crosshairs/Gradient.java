package com.github.appreciated.apexcharts.config.xaxis.crosshairs;

import java.util.List;

class Gradient {
    String colorFrom;
    String colorTo;
    List<Double> stops;
    Double opacityFrom;
    Double opacityTo;

    public String getColorFrom() {
        return colorFrom;
    }

    public void setColorFrom(String colorFrom) {
        this.colorFrom = colorFrom;
    }

    public String getColorTo() {
        return colorTo;
    }

    public void setColorTo(String colorTo) {
        this.colorTo = colorTo;
    }

    public List<Double> getStops() {
        return stops;
    }

    public void setStops(List<Double> stops) {
        this.stops = stops;
    }

    public Double getOpacityFrom() {
        return opacityFrom;
    }

    public void setOpacityFrom(Double opacityFrom) {
        this.opacityFrom = opacityFrom;
    }

    public Double getOpacityTo() {
        return opacityTo;
    }

    public void setOpacityTo(Double opacityTo) {
        this.opacityTo = opacityTo;
    }
}
