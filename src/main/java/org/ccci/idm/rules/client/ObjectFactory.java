
package org.ccci.idm.rules.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ccci.idm.rules.client package. 
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

    private final static QName _RunRules_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "runRules");
    private final static QName _Exception_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "Exception");
    private final static QName _RunRulesResponse_QNAME = new QName("http://webservice.rules.idm.ccci.org/", "runRulesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ccci.idm.rules.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RuleFilter }
     * 
     */
    public RuleFilter createRuleFilter() {
        return new RuleFilter();
    }

    /**
     * Create an instance of {@link RunRules }
     * 
     */
    public RunRules createRunRules() {
        return new RunRules();
    }

    /**
     * Create an instance of {@link RunRulesResponse }
     * 
     */
    public RunRulesResponse createRunRulesResponse() {
        return new RunRulesResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "runRules")
    public JAXBElement<RunRules> createRunRules(RunRules value) {
        return new JAXBElement<RunRules>(_RunRules_QNAME, RunRules.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RunRulesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.rules.idm.ccci.org/", name = "runRulesResponse")
    public JAXBElement<RunRulesResponse> createRunRulesResponse(RunRulesResponse value) {
        return new JAXBElement<RunRulesResponse>(_RunRulesResponse_QNAME, RunRulesResponse.class, null, value);
    }

}
