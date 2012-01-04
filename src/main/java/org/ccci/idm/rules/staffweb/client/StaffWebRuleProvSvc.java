
package org.ccci.idm.rules.staffweb.client;

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
@WebService(name = "StaffWebRuleProvSvc", targetNamespace = "http://webservice.rules.idm.ccci.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StaffWebRuleProvSvc {


    /**
     * 
     * @param serverSecret
     * @param serverId
     * @param ssoGuid
     * @param emplid
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "provisionSiebelResponsibilityAccessForEmployee", targetNamespace = "http://webservice.rules.idm.ccci.org/", className = "org.ccci.idm.rules.staffweb.client.ProvisionSiebelResponsibilityAccessForEmployee")
    @ResponseWrapper(localName = "provisionSiebelResponsibilityAccessForEmployeeResponse", targetNamespace = "http://webservice.rules.idm.ccci.org/", className = "org.ccci.idm.rules.staffweb.client.ProvisionSiebelResponsibilityAccessForEmployeeResponse")
    public String provisionSiebelResponsibilityAccessForEmployee(
        @WebParam(name = "serverId", targetNamespace = "")
        String serverId,
        @WebParam(name = "serverSecret", targetNamespace = "")
        String serverSecret,
        @WebParam(name = "ssoGuid", targetNamespace = "")
        String ssoGuid,
        @WebParam(name = "emplid", targetNamespace = "")
        String emplid)
        throws Exception_Exception
    ;

}