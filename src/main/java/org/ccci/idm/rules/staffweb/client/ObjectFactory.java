
package org.ccci.idm.rules.staffweb.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ccci.idm.rules.staffweb.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProvisionSiebelResponsibilityAccessForEmployee_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "provisionSiebelResponsibilityAccessForEmployee");
    private final static QName _ProvisionSiebelResponsibilityAccessForEmployeeResponse_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "provisionSiebelResponsibilityAccessForEmployeeResponse");
    private final static QName _Exception_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ccci.idm.rules.staffweb.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProvisionSiebelResponsibilityAccessForEmployee }
     * 
     */
    public ProvisionSiebelResponsibilityAccessForEmployee createProvisionSiebelResponsibilityAccessForEmployee() {
        return new ProvisionSiebelResponsibilityAccessForEmployee();
    }

    /**
     * Create an instance of {@link ProvisionSiebelResponsibilityAccessForEmployeeResponse }
     * 
     */
    public ProvisionSiebelResponsibilityAccessForEmployeeResponse createProvisionSiebelResponsibilityAccessForEmployeeResponse() {
        return new ProvisionSiebelResponsibilityAccessForEmployeeResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionSiebelResponsibilityAccessForEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "provisionSiebelResponsibilityAccessForEmployee")
    public JAXBElement<ProvisionSiebelResponsibilityAccessForEmployee> createProvisionSiebelResponsibilityAccessForEmployee(ProvisionSiebelResponsibilityAccessForEmployee value) {
        return new JAXBElement<ProvisionSiebelResponsibilityAccessForEmployee>(_ProvisionSiebelResponsibilityAccessForEmployee_QNAME, ProvisionSiebelResponsibilityAccessForEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionSiebelResponsibilityAccessForEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "provisionSiebelResponsibilityAccessForEmployeeResponse")
    public JAXBElement<ProvisionSiebelResponsibilityAccessForEmployeeResponse> createProvisionSiebelResponsibilityAccessForEmployeeResponse(ProvisionSiebelResponsibilityAccessForEmployeeResponse value) {
        return new JAXBElement<ProvisionSiebelResponsibilityAccessForEmployeeResponse>(_ProvisionSiebelResponsibilityAccessForEmployeeResponse_QNAME, ProvisionSiebelResponsibilityAccessForEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
