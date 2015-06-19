
package wse.locadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wse.locadora package. 
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

    private final static QName _ListarCarrosPorLocadora_QNAME = new QName("http://service.pos.com/", "listarCarrosPorLocadora");
    private final static QName _PesquisarReserva_QNAME = new QName("http://service.pos.com/", "pesquisarReserva");
    private final static QName _BuscarLocadorasPorCidade_QNAME = new QName("http://service.pos.com/", "buscarLocadorasPorCidade");
    private final static QName _ListarCarrosResponse_QNAME = new QName("http://service.pos.com/", "listarCarrosResponse");
    private final static QName _PesquisarReservaResponse_QNAME = new QName("http://service.pos.com/", "pesquisarReservaResponse");
    private final static QName _ListarReservasResponse_QNAME = new QName("http://service.pos.com/", "listarReservasResponse");
    private final static QName _ListarCarrosPorLocadoraResponse_QNAME = new QName("http://service.pos.com/", "listarCarrosPorLocadoraResponse");
    private final static QName _ListarReservas_QNAME = new QName("http://service.pos.com/", "listarReservas");
    private final static QName _ListarCarros_QNAME = new QName("http://service.pos.com/", "listarCarros");
    private final static QName _CriarReserva_QNAME = new QName("http://service.pos.com/", "criarReserva");
    private final static QName _CriarReservaResponse_QNAME = new QName("http://service.pos.com/", "criarReservaResponse");
    private final static QName _BuscarLocadorasPorCidadeResponse_QNAME = new QName("http://service.pos.com/", "buscarLocadorasPorCidadeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wse.locadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarLocadorasPorCidadeResponse }
     * 
     */
    public BuscarLocadorasPorCidadeResponse createBuscarLocadorasPorCidadeResponse() {
        return new BuscarLocadorasPorCidadeResponse();
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
     * Create an instance of {@link ListarCarrosPorLocadoraResponse }
     * 
     */
    public ListarCarrosPorLocadoraResponse createListarCarrosPorLocadoraResponse() {
        return new ListarCarrosPorLocadoraResponse();
    }

    /**
     * Create an instance of {@link ListarReservas }
     * 
     */
    public ListarReservas createListarReservas() {
        return new ListarReservas();
    }

    /**
     * Create an instance of {@link ListarCarros }
     * 
     */
    public ListarCarros createListarCarros() {
        return new ListarCarros();
    }

    /**
     * Create an instance of {@link PesquisarReservaPorDataResponse }
     * 
     */
    public PesquisarReservaPorDataResponse createPesquisarReservaPorDataResponse() {
        return new PesquisarReservaPorDataResponse();
    }

    /**
     * Create an instance of {@link ListarReservasResponse }
     * 
     */
    public ListarReservasResponse createListarReservasResponse() {
        return new ListarReservasResponse();
    }

    /**
     * Create an instance of {@link ListarCarrosResponse }
     * 
     */
    public ListarCarrosResponse createListarCarrosResponse() {
        return new ListarCarrosResponse();
    }

    /**
     * Create an instance of {@link ListarCarrosPorLocadora }
     * 
     */
    public ListarCarrosPorLocadora createListarCarrosPorLocadora() {
        return new ListarCarrosPorLocadora();
    }

    /**
     * Create an instance of {@link PesquisarReservaPorData }
     * 
     */
    public PesquisarReservaPorData createPesquisarReservaPorData() {
        return new PesquisarReservaPorData();
    }

    /**
     * Create an instance of {@link BuscarLocadorasPorCidade }
     * 
     */
    public BuscarLocadorasPorCidade createBuscarLocadorasPorCidade() {
        return new BuscarLocadorasPorCidade();
    }

    /**
     * Create an instance of {@link Carro }
     * 
     */
    public Carro createCarro() {
        return new Carro();
    }

    /**
     * Create an instance of {@link Locadora }
     * 
     */
    public Locadora createLocadora() {
        return new Locadora();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCarrosPorLocadora }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "listarCarrosPorLocadora")
    public JAXBElement<ListarCarrosPorLocadora> createListarCarrosPorLocadora(ListarCarrosPorLocadora value) {
        return new JAXBElement<ListarCarrosPorLocadora>(_ListarCarrosPorLocadora_QNAME, ListarCarrosPorLocadora.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarReservaPorData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "pesquisarReserva")
    public JAXBElement<PesquisarReservaPorData> createPesquisarReserva(PesquisarReservaPorData value) {
        return new JAXBElement<PesquisarReservaPorData>(_PesquisarReserva_QNAME, PesquisarReservaPorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLocadorasPorCidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "buscarLocadorasPorCidade")
    public JAXBElement<BuscarLocadorasPorCidade> createBuscarLocadorasPorCidade(BuscarLocadorasPorCidade value) {
        return new JAXBElement<BuscarLocadorasPorCidade>(_BuscarLocadorasPorCidade_QNAME, BuscarLocadorasPorCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCarrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "listarCarrosResponse")
    public JAXBElement<ListarCarrosResponse> createListarCarrosResponse(ListarCarrosResponse value) {
        return new JAXBElement<ListarCarrosResponse>(_ListarCarrosResponse_QNAME, ListarCarrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarReservaPorDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "pesquisarReservaResponse")
    public JAXBElement<PesquisarReservaPorDataResponse> createPesquisarReservaResponse(PesquisarReservaPorDataResponse value) {
        return new JAXBElement<PesquisarReservaPorDataResponse>(_PesquisarReservaResponse_QNAME, PesquisarReservaPorDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "listarReservasResponse")
    public JAXBElement<ListarReservasResponse> createListarReservasResponse(ListarReservasResponse value) {
        return new JAXBElement<ListarReservasResponse>(_ListarReservasResponse_QNAME, ListarReservasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCarrosPorLocadoraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "listarCarrosPorLocadoraResponse")
    public JAXBElement<ListarCarrosPorLocadoraResponse> createListarCarrosPorLocadoraResponse(ListarCarrosPorLocadoraResponse value) {
        return new JAXBElement<ListarCarrosPorLocadoraResponse>(_ListarCarrosPorLocadoraResponse_QNAME, ListarCarrosPorLocadoraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarReservas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "listarReservas")
    public JAXBElement<ListarReservas> createListarReservas(ListarReservas value) {
        return new JAXBElement<ListarReservas>(_ListarReservas_QNAME, ListarReservas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCarros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "listarCarros")
    public JAXBElement<ListarCarros> createListarCarros(ListarCarros value) {
        return new JAXBElement<ListarCarros>(_ListarCarros_QNAME, ListarCarros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "criarReserva")
    public JAXBElement<CriarReserva> createCriarReserva(CriarReserva value) {
        return new JAXBElement<CriarReserva>(_CriarReserva_QNAME, CriarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "criarReservaResponse")
    public JAXBElement<CriarReservaResponse> createCriarReservaResponse(CriarReservaResponse value) {
        return new JAXBElement<CriarReservaResponse>(_CriarReservaResponse_QNAME, CriarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLocadorasPorCidadeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pos.com/", name = "buscarLocadorasPorCidadeResponse")
    public JAXBElement<BuscarLocadorasPorCidadeResponse> createBuscarLocadorasPorCidadeResponse(BuscarLocadorasPorCidadeResponse value) {
        return new JAXBElement<BuscarLocadorasPorCidadeResponse>(_BuscarLocadorasPorCidadeResponse_QNAME, BuscarLocadorasPorCidadeResponse.class, null, value);
    }

}
