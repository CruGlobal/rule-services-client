
package org.ccci.idm.rules.staffweb.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisionStaffWebConsumerForEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionStaffWebConsumerForEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssoGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emplid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionStaffWebConsumerForEmployee", propOrder = {
    "serverId",
    "serverSecret",
    "ssoGuid",
    "emplid"
})
public class ProvisionStaffWebConsumerForEmployee {

    protected String serverId;
    protected String serverSecret;
    protected String ssoGuid;
    protected String emplid;

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
     * Gets the value of the emplid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplid() {
        return emplid;
    }

    /**
     * Sets the value of the emplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplid(String value) {
        this.emplid = value;
    }

}
