package tutoreal.tareasweb.model;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless(name = "SessionEJB", mappedName = "GestorTareasWeb1-Model-SessionEJB")
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
}
