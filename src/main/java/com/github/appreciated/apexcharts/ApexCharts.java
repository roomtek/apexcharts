package com.github.appreciated.apexcharts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.appreciated.apexcharts.config.*;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.Arrays;
import java.util.Map;

@Tag("apex-charts-wrapper")
@HtmlImport("frontend://com/github/appreciated/apexcharts/apexcharts-wrapper.html")
public class ApexCharts extends PolymerTemplate<ApexChartsModel> implements HasSize {

    public ApexCharts() {
        setWidth("300px");
        setHeight("300px");
    }

    public ApexCharts withAnnotations(ApexAnnotations annotations) {
        getModel().setAnnotations(annotations);
        return this;
    }

    public ApexCharts withChart(ApexChart chart) {
        getModel().setChart(chart);
        return this;
    }

    public ApexCharts withColors(String[] colors) {
        getModel().setColors(Arrays.asList(colors));
        return this;
    }

    public ApexCharts withDataLabels(ApexDataLabels dataLabels) {
        getModel().setDataLabels(dataLabels);
        return this;
    }

    public ApexCharts withFill(ApexFill fill) {
        getModel().setFill(fill);
        return this;
    }

    public ApexCharts withGrid(ApexGrid grid) {
        getModel().setGrid(grid);
        return this;
    }

    public ApexCharts withLabels(String... labels) {
        getModel().setLabels(Arrays.asList(labels));
        return this;
    }

    public ApexCharts withLegend(ApexLegend legend) {
        getModel().setLegend(legend);
        return this;
    }

    public ApexCharts withMarkers(ApexMarkers markers) {
        getModel().setMarkers(markers);
        return this;
    }

    public ApexCharts withNoData(ApexNoData noData) {
        getModel().setNoData(noData);
        return this;
    }

    public ApexCharts withPlotOptions(ApexPlotOptions plotOptions) {
        getModel().setPlotOptions(plotOptions);
        return this;
    }

    public ApexCharts withResponsive(ApexResponsive... responsive) {
        getModel().setResponsive(Arrays.asList(responsive));
        return this;
    }

    public ApexCharts withSeries(Double... series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withSeries(Map<String, Double> series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withStates(ApexStates states) {
        getModel().setStates(states);
        return this;
    }

    public ApexCharts withStroke(ApexStroke stroke) {
        getModel().setStroke(stroke);
        return this;
    }

    public ApexCharts withSubtitle(ApexTitleSubtitle subtitle) {
        getModel().setSubtitle(subtitle);
        return this;
    }

    public ApexCharts withTheme(ApexTheme theme) {
        getModel().setTheme(theme);
        return this;
    }

    public ApexCharts withTitle(ApexTitleSubtitle title) {
        getModel().setTitle(title);
        return this;
    }

    public ApexCharts withTooltip(ApexTooltip tooltip) {
        getModel().setTooltip(tooltip);
        return this;
    }

    public ApexCharts withXaxis(ApexXAxis xaxis) {
       // getModel().setXaxis(xaxis);
        return this;
    }

    public ApexCharts withYaxis(ApexYAxis... yaxis) {
        getModel().setYaxis(Arrays.asList(yaxis).toString());
        return this;
    }

}

