
package org.ccci.idm.rules.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssoGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruleFilter" type="{http://webservice.rules.idm.ccci.org/}ruleFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runRules", propOrder = {
    "serverId",
    "serverSecret",
    "ssoGuid",
    "ruleFilter"
})
public class RunRules {

    protected String serverId;
    protected String serverSecret;
    protected String ssoGuid;
    protected RuleFilter ruleFilter;

    /**
     * Gets the value of the serverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the serverSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerSecret() {
        return serverSecret;
    }

    /**
     * Sets the value of the serverSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerSecret(String value) {
        this.serverSecret = value;
    }

    /**
     * Gets the value of the ssoGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsoGuid() {
        return ssoGuid;
    }

    /**
     * Sets the value of the ssoGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsoGuid(String value) {
        this.ssoGuid = value;
    }

    /**
     * Gets the value of the ruleFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RuleFilter }
     *     
     */
    public RuleFilter getRuleFilter() {
        return ruleFilter;
    }

    /**
     * Sets the value of the ruleFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleFilter }
     *     
     */
    public void setRuleFilter(RuleFilter value) {
        this.ruleFilter = value;
    }

}
