/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.AnalyseDAO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tg.assurence.DAO.IAnalyseDAO;
import tg.assurence.DAO.IDAO;
import tg.assurence.DAO.impl.AnalyseDAO;
import tg.assurence.Service.IAnalyseService;
import tg.assurence.entity.Analyse;

/**
 *
 * @author amen
 */
@Stateless
public class AnalyseService extends CRUDService<Analyse, Integer> implements IAnalyseService {

    @EJB
    private IAnalyseDAO dao;

    public AnalyseService() {
    }
    
    
    @Override
    public IAnalyseDAO getDAO() {
        return dao;
    }

    
}
