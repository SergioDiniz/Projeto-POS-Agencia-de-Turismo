
package webservicesexternos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicesexternos package. 
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

    private final static QName _CriarReserva_QNAME = new QName("http://webservicesexternos/", "criarReserva");
    private final static QName _CriarReservaResponse_QNAME = new QName("http://webservicesexternos/", "criarReservaResponse");
    private final static QName _BuscarRestaurantesPorCidade_QNAME = new QName("http://webservicesexternos/", "buscarRestaurantesPorCidade");
    private final static QName _PesquisarReserva_QNAME = new QName("http://webservicesexternos/", "pesquisarReserva");
    private final static QName _BuscarRestaurantesPorCidadeResponse_QNAME = new QName("http://webservicesexternos/", "buscarRestaurantesPorCidadeResponse");
    private final static QName _ListarReservasResponse_QNAME = new QName("http://webservicesexternos/", "listarReservasResponse");
    private final static QName _PesquisarReservaResponse_QNAME = new QName("http://webservicesexternos/", "pesquisarReservaResponse");
    private final static QName _ListarReservas_QNAME = new QName("http://webservicesexternos/", "listarReservas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicesexternos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarRestaurantesPorCidade }
     * 
     */
    public BuscarRestaurantesPorCidade createBuscarRestaurantesPorCidade() {
        return new BuscarRestaurantesPorCidade();
    }

    /**
     * Create an instance of {@link CriarReserva }
     * 
     */
    public CriarReserva createCriarReserva() {
        return new CriarReserva();
    }

    /**
     * Create an instance of {@link CriarReservaResponse }
     * 
     */
    public CriarReservaResponse createCriarReservaResponse() {
        return new CriarReservaResponse();
    }

    /**
     * Create an instance of {@link ListarReservas }
     * 
     */
    public ListarReservas createListarReservas() {
        return new ListarReservas();
    }

    /**
     * Create an instance of {@link PesquisarReservaResponse }
     * 
     */
    public PesquisarReservaResponse createPesquisarReservaResponse() {
        return new PesquisarReservaResponse();
    }

    /**
     * Create an instance of {@link BuscarRestaurantesPorCidadeResponse }
     * 
     */
    public BuscarRestaurantesPorCidadeResponse createBuscarRestaurantesPorCidadeResponse() {
        return new BuscarRestaurantesPorCidadeResponse();
    }

    /**
     * Create an instance of {@link ListarReservasResponse }
     * 
     */
    public ListarReservasResponse createListarReservasResponse() {
        return new ListarReservasResponse();
    }

    /**
     * Create an instance of {@link PesquisarReserva }
     * 
     */
    public PesquisarReserva createPesquisarReserva() {
        return new PesquisarReserva();
    }

    /**
     * Create an instance of {@link ReservaRestaurante }
     * 
     */
    public ReservaRestaurante createReservaRestaurante() {
        return new ReservaRestaurante();
    }

    /**
     * Create an instance of {@link Restaurante }
     * 
     */
    public Restaurante createRestaurante() {
        return new Restaurante();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "criarReserva")
    public JAXBElement<CriarReserva> createCriarReserva(CriarReserva value) {
        return new JAXBElement<CriarReserva>(_CriarReserva_QNAME, CriarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "criarReservaResponse")
    public JAXBElement<CriarReservaResponse> createCriarReservaResponse(CriarReservaResponse value) {
        return new JAXBElement<CriarReservaResponse>(_CriarReservaResponse_QNAME, CriarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRestaurantesPorCidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "buscarRestaurantesPorCidade")
    public JAXBElement<BuscarRestaurantesPorCidade> createBuscarRestaurantesPorCidade(BuscarRestaurantesPorCidade value) {
        return new JAXBElement<BuscarRestaurantesPorCidade>(_BuscarRestaurantesPorCidade_QNAME, BuscarRestaurantesPorCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "pesquisarReserva")
    public JAXBElement<PesquisarReserva> createPesquisarReserva(PesquisarReserva value) {
        return new JAXBElement<PesquisarReserva>(_PesquisarReserva_QNAME, PesquisarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRestaurantesPorCidadeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "buscarRestaurantesPorCidadeResponse")
    public JAXBElement<BuscarRestaurantesPorCidadeResponse> createBuscarRestaurantesPorCidadeResponse(BuscarRestaurantesPorCidadeResponse value) {
        return new JAXBElement<BuscarRestaurantesPorCidadeResponse>(_BuscarRestaurantesPorCidadeResponse_QNAME, BuscarRestaurantesPorCidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "listarReservasResponse")
    public JAXBElement<ListarReservasResponse> createListarReservasResponse(ListarReservasResponse value) {
        return new JAXBElement<ListarReservasResponse>(_ListarReservasResponse_QNAME, ListarReservasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "pesquisarReservaResponse")
    public JAXBElement<PesquisarReservaResponse> createPesquisarReservaResponse(PesquisarReservaResponse value) {
        return new JAXBElement<PesquisarReservaResponse>(_PesquisarReservaResponse_QNAME, PesquisarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesexternos/", name = "listarReservas")
    public JAXBElement<ListarReservas> createListarReservas(ListarReservas value) {
        return new JAXBElement<ListarReservas>(_ListarReservas_QNAME, ListarReservas.class, null, value);
    }

}
