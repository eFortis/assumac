/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.beans;

    import java.io.Serializable;  
      
    import org.primefaces.model.chart.CartesianChartModel;  
    import org.primefaces.model.chart.ChartSeries;
    import javax.faces.bean.ManagedBean;
    import javax.faces.bean.RequestScoped;
    @ManagedBean
    @RequestScoped 
    public class ChartBean implements Serializable {  
      
        private CartesianChartModel categoryModel;  
      
        public ChartBean() {  
            createCategoryModel();  
        }  
      
        public CartesianChartModel getCategoryModel() {  
            return categoryModel;  
        }  
      
        private void createCategoryModel() {  
            categoryModel = new CartesianChartModel();  
      
            ChartSeries boys = new ChartSeries();  
            boys.setLabel("Revenue");  
      
            boys.set("2004", 120);  
            boys.set("2005", 100);  
            boys.set("2006", 44);  
            boys.set("2007", 150);  
            boys.set("2008", 25);  
      
            ChartSeries girls = new ChartSeries();  
            girls.setLabel("Dépense");  
      
            girls.set("2004", 52);  
            girls.set("2005", 60);  
            girls.set("2006", 110);  
            girls.set("2007", 135);  
            girls.set("2008", 120);  
      
            categoryModel.addSeries(boys);  
            categoryModel.addSeries(girls);  
        }  
    }  
 
