/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
import org.primefaces.event.TransferEvent;  
 
import org.primefaces.model.DualListModel;
import tg.assurence.entity.Medicament;
/**
 *
 * @author kpizia
 */
@ManagedBean
@RequestScoped
public class PickListBean implements Serializable{

    private DualListModel<Medicament> medicaments;  
      
    private DualListModel<String> cities;  
  
    public PickListBean() {  
        //Players  
        List<Medicament> source = new ArrayList<Medicament>();  
        List<Medicament> target = new ArrayList<Medicament>();  
          
        source.add(new Medicament("Paracétamol","500Mg"));  
        source.add(new Medicament("Nivaquine","100Mg"));  
        source.add(new Medicament("Quinine","100Ml"));  
        source.add(new Medicament("Vogalène","1L"));  
        source.add(new Medicament("Bactrime","250Mg"));  
        source.add(new Medicament("Novalgin","200Ml"));      
          
        medicaments = new DualListModel<Medicament>(source, target);  
          
        //Cities  
        List<String> citiesSource = new ArrayList<String>();  
        List<String> citiesTarget = new ArrayList<String>();  
          
        citiesSource.add("Istanbul");  
        citiesSource.add("Ankara");  
        citiesSource.add("Izmir");  
        citiesSource.add("Antalya");  
        citiesSource.add("Bursa");  
          
        cities = new DualListModel<String>(citiesSource, citiesTarget);  
    }  
      
    public DualListModel<Medicament> getMedicaments() {  
        return medicaments;  
    }  

    public void setMedicament(DualListModel<Medicament> medicament) {
        this.medicaments = medicament;
    }
      
    public DualListModel<String> getCities() {  
        return cities;    
}  
    public void setCities(DualListModel<String> cities) {  
        this.cities = cities;  
    }  
      
    public void onTransfer(TransferEvent event) {  
        StringBuilder builder = new StringBuilder();  
        for(Object item : event.getItems()) {  
            builder.append(((Medicament) item).getLibelle()).append("<br />");  
        }  
          
        FacesMessage msg = new FacesMessage();  
        msg.setSeverity(FacesMessage.SEVERITY_INFO);  
        msg.setSummary("Items Transferred");  
        msg.setDetail(builder.toString());  
          
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
}
