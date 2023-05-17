
package ex.deadman.crudservice.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name_data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description_data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "nameData",
    "descriptionData"
})
@XmlRootElement(name = "SaveTestDataRequest")
public class SaveTestDataRequest {

    protected int id;
    @XmlElement(name = "name_data", required = true)
    protected String nameData;
    @XmlElement(name = "description_data", required = true)
    protected String descriptionData;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nameData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameData() {
        return nameData;
    }

    /**
     * Define el valor de la propiedad nameData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameData(String value) {
        this.nameData = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionData() {
        return descriptionData;
    }

    /**
     * Define el valor de la propiedad descriptionData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionData(String value) {
        this.descriptionData = value;
    }

}
