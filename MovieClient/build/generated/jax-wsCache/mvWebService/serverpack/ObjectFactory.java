
package serverpack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverpack package. 
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

    private final static QName _Checklogin_QNAME = new QName("http://serverpack/", "checklogin");
    private final static QName _CheckloginResponse_QNAME = new QName("http://serverpack/", "checkloginResponse");
    private final static QName _Getsqr_QNAME = new QName("http://serverpack/", "getsqr");
    private final static QName _GetsqrResponse_QNAME = new QName("http://serverpack/", "getsqrResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverpack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Checklogin }
     * 
     */
    public Checklogin createChecklogin() {
        return new Checklogin();
    }

    /**
     * Create an instance of {@link CheckloginResponse }
     * 
     */
    public CheckloginResponse createCheckloginResponse() {
        return new CheckloginResponse();
    }

    /**
     * Create an instance of {@link Getsqr }
     * 
     */
    public Getsqr createGetsqr() {
        return new Getsqr();
    }

    /**
     * Create an instance of {@link GetsqrResponse }
     * 
     */
    public GetsqrResponse createGetsqrResponse() {
        return new GetsqrResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checklogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "checklogin")
    public JAXBElement<Checklogin> createChecklogin(Checklogin value) {
        return new JAXBElement<Checklogin>(_Checklogin_QNAME, Checklogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckloginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "checkloginResponse")
    public JAXBElement<CheckloginResponse> createCheckloginResponse(CheckloginResponse value) {
        return new JAXBElement<CheckloginResponse>(_CheckloginResponse_QNAME, CheckloginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getsqr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "getsqr")
    public JAXBElement<Getsqr> createGetsqr(Getsqr value) {
        return new JAXBElement<Getsqr>(_Getsqr_QNAME, Getsqr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetsqrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverpack/", name = "getsqrResponse")
    public JAXBElement<GetsqrResponse> createGetsqrResponse(GetsqrResponse value) {
        return new JAXBElement<GetsqrResponse>(_GetsqrResponse_QNAME, GetsqrResponse.class, null, value);
    }

}
