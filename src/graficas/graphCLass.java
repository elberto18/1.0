/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Estudiante
 */
public class graphCLass {
    
    public XYSeries crearDatos(){
        XYSeries serie = new XYSeries("Notas Esteban");
        serie.add(1,50);
        serie.add(2,35);
        serie.add(3,40);
        serie.add(4,49);
        serie.add(5,35);
        return serie;
        
    }
    public XYSeriesCollection crearColeccion(XYSeries serie){
        XYSeriesCollection setgraf = new XYSeriesCollection();
        setgraf.addSeries(serie);
        return setgraf;
    }
    public JFreeChart crearGrafico(XYSeriesCollection setgraf) throws IOException{
         JFreeChart chart1 = ChartFactory.createXYLineChart("NOTAS", "CORTE ", "CALIFICACION", setgraf, PlotOrientation.VERTICAL, true, true, false);
        ChartUtilities.saveChartAsJPEG(new File("grafico.jpg"), chart1, 500, 300);
        return chart1;
    }
}
