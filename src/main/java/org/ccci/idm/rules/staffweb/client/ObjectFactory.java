
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

    private final static QName _Exception_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "Exception");
    private final static QName _ProvisionStaffWebConsumerForEmployeeResponse_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "provisionStaffWebConsumerForEmployeeResponse");
    private final static QName _ProvisionStaffWebConsumerForEmployee_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "provisionStaffWebConsumerForEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ccci.idm.rules.staffweb.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProvisionStaffWebConsumerForEmployee }
     * 
     */
    public ProvisionStaffWebConsumerForEmployee createProvisionStaffWebConsumerForEmployee() {
        return new ProvisionStaffWebConsumerForEmployee();
    }

    /**
     * Create an instance of {@link ProvisionStaffWebConsumerForEmployeeResponse }
     * 
     */
    public ProvisionStaffWebConsumerForEmployeeResponse createProvisionStaffWebConsumerForEmployeeResponse() {
        return new ProvisionStaffWebConsumerForEmployeeResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionStaffWebConsumerForEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "provisionStaffWebConsumerForEmployeeResponse")
    public JAXBElement<ProvisionStaffWebConsumerForEmployeeResponse> createProvisionStaffWebConsumerForEmployeeResponse(ProvisionStaffWebConsumerForEmployeeResponse value) {
        return new JAXBElement<ProvisionStaffWebConsumerForEmployeeResponse>(_ProvisionStaffWebConsumerForEmployeeResponse_QNAME, ProvisionStaffWebConsumerForEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvisionStaffWebConsumerForEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "provisionStaffWebConsumerForEmployee")
    public JAXBElement<ProvisionStaffWebConsumerForEmployee> createProvisionStaffWebConsumerForEmployee(ProvisionStaffWebConsumerForEmployee value) {
        return new JAXBElement<ProvisionStaffWebConsumerForEmployee>(_ProvisionStaffWebConsumerForEmployee_QNAME, ProvisionStaffWebConsumerForEmployee.class, null, value);
    }

}
