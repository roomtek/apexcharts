package com.github.appreciated.apexcharts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.appreciated.apexcharts.config.*;
import com.github.appreciated.apexcharts.helper.Series;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.Arrays;

@Tag("apex-charts-wrapper")
@HtmlImport("frontend://com/github/appreciated/apexcharts/apexcharts-wrapper.html")
public class ApexCharts extends PolymerTemplate<ApexChartsModel> implements HasSize {

    public ApexCharts() {
        setWidth("300px");
        setHeight("300px");
    }

    public ApexCharts withAnnotations(Annotations annotations) {
        getModel().setAnnotations(annotations);
        return this;
    }

    public ApexCharts withChart(Chart chart) {
        getModel().setChart(chart);
        return this;
    }

    public ApexCharts withColors(String... colors) {
        try {
            getModel().setColors(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(colors));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withDataLabels(DataLabels dataLabels) {
        getModel().setDataLabels(dataLabels);
        return this;
    }

    public ApexCharts withFill(Fill fill) {
        getModel().setFill(fill);
        return this;
    }

    public ApexCharts withGrid(Grid grid) {
        getModel().setGrid(grid);
        return this;
    }

    public ApexCharts withLabels(String... labels) {
        getModel().setLabels(Arrays.asList(labels));
        return this;
    }

    public ApexCharts withLegend(Legend legend) {
        getModel().setLegend(legend);
        return this;
    }

    public ApexCharts withMarkers(Markers markers) {
        getModel().setMarkers(markers);
        return this;
    }

    public ApexCharts withNoData(NoData noData) {
        getModel().setNoData(noData);
        return this;
    }

    public ApexCharts withPlotOptions(PlotOptions plotOptions) {
        getModel().setPlotOptions(plotOptions);
        return this;
    }

    public ApexCharts withResponsive(Responsive... responsive) {
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

    public ApexCharts withSeries(Series... series) {
        try {
            getModel().setSeries(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(series));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withStates(States states) {
        getModel().setStates(states);
        return this;
    }

    public ApexCharts withStroke(Stroke stroke) {
        getModel().setStroke(stroke);
        return this;
    }

    public ApexCharts withSubtitle(TitleSubtitle subtitle) {
        try {
            getModel().setSubtitle(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(subtitle));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withTheme(Theme theme) {
        getModel().setTheme(theme);
        return this;
    }

    public ApexCharts withTitle(TitleSubtitle title) {
        try {
            getModel().setChartTitle( new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(title));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ApexCharts withTooltip(Tooltip tooltip) {
        getModel().setTooltip(tooltip);
        return this;
    }

    public ApexCharts withXaxis(XAxis xaxis) {
        getModel().setXaxis(xaxis);
        return this;
    }

    public ApexCharts withYaxis(YAxis... yaxis) {
        try {
            getModel().setYaxis( new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(yaxis));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return this;
    }

}

