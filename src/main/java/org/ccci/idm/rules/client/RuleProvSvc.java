
package org.ccci.idm.rules.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RuleProvSvc", targetNamespace = "http://webservice.rules.idm.ccci.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RuleProvSvc {


    /**
     * 
     * @param serverSecret
     * @param ruleFilter
     * @param serverId
     * @param ssoGuid
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "runRules", targetNamespace = "http://webservice.rules.idm.ccci.org/", className = "org.ccci.idm.rules.client.RunRules")
    @ResponseWrapper(localName = "runRulesResponse", targetNamespace = "http://webservice.rules.idm.ccci.org/", className = "org.ccci.idm.rules.client.RunRulesResponse")
    public String runRules(
        @WebParam(name = "serverId", targetNamespace = "")
        String serverId,
        @WebParam(name = "serverSecret", targetNamespace = "")
        String serverSecret,
        @WebParam(name = "ssoGuid", targetNamespace = "")
        String ssoGuid,
        @WebParam(name = "ruleFilter", targetNamespace = "")
        RuleFilter ruleFilter)
        throws Exception_Exception
    ;

}