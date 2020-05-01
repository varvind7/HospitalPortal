
package server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "sayhello", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8080/hospservice/sayhello?wsdl")
public class Sayhello_Service
    extends Service
{

    private final static URL SAYHELLO_WSDL_LOCATION;
    private final static WebServiceException SAYHELLO_EXCEPTION;
    private final static QName SAYHELLO_QNAME = new QName("http://server/", "sayhello");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/hospservice/sayhello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAYHELLO_WSDL_LOCATION = url;
        SAYHELLO_EXCEPTION = e;
    }

    public Sayhello_Service() {
        super(__getWsdlLocation(), SAYHELLO_QNAME);
    }

    public Sayhello_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAYHELLO_QNAME, features);
    }

    public Sayhello_Service(URL wsdlLocation) {
        super(wsdlLocation, SAYHELLO_QNAME);
    }

    public Sayhello_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAYHELLO_QNAME, features);
    }

    public Sayhello_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Sayhello_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Sayhello
     */
    @WebEndpoint(name = "sayhelloPort")
    public Sayhello getSayhelloPort() {
        return super.getPort(new QName("http://server/", "sayhelloPort"), Sayhello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sayhello
     */
    @WebEndpoint(name = "sayhelloPort")
    public Sayhello getSayhelloPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "sayhelloPort"), Sayhello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAYHELLO_EXCEPTION!= null) {
            throw SAYHELLO_EXCEPTION;
        }
        return SAYHELLO_WSDL_LOCATION;
    }

}
