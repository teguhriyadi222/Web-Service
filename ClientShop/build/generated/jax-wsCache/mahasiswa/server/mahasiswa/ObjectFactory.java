
package server.mahasiswa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server.mahasiswa package. 
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

    private final static QName _GetDataResponse_QNAME = new QName("http://mahasiswa.server/", "getDataResponse");
    private final static QName _EditDataResponse_QNAME = new QName("http://mahasiswa.server/", "editDataResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://mahasiswa.server/", "loginResponse");
    private final static QName _TambahDataResponse_QNAME = new QName("http://mahasiswa.server/", "tambahDataResponse");
    private final static QName _EditData_QNAME = new QName("http://mahasiswa.server/", "editData");
    private final static QName _Login_QNAME = new QName("http://mahasiswa.server/", "login");
    private final static QName _CariDataResponse_QNAME = new QName("http://mahasiswa.server/", "cariDataResponse");
    private final static QName _HapusData_QNAME = new QName("http://mahasiswa.server/", "hapusData");
    private final static QName _TambahData_QNAME = new QName("http://mahasiswa.server/", "tambahData");
    private final static QName _TampilData_QNAME = new QName("http://mahasiswa.server/", "tampilData");
    private final static QName _TampilDataResponse_QNAME = new QName("http://mahasiswa.server/", "tampilDataResponse");
    private final static QName _CariData_QNAME = new QName("http://mahasiswa.server/", "cariData");
    private final static QName _GetData_QNAME = new QName("http://mahasiswa.server/", "getData");
    private final static QName _UrutkanData_QNAME = new QName("http://mahasiswa.server/", "urutkanData");
    private final static QName _HapusDataResponse_QNAME = new QName("http://mahasiswa.server/", "hapusDataResponse");
    private final static QName _UrutkanDataResponse_QNAME = new QName("http://mahasiswa.server/", "urutkanDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server.mahasiswa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TambahDataResponse }
     * 
     */
    public TambahDataResponse createTambahDataResponse() {
        return new TambahDataResponse();
    }

    /**
     * Create an instance of {@link EditData }
     * 
     */
    public EditData createEditData() {
        return new EditData();
    }

    /**
     * Create an instance of {@link EditDataResponse }
     * 
     */
    public EditDataResponse createEditDataResponse() {
        return new EditDataResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link CariDataResponse }
     * 
     */
    public CariDataResponse createCariDataResponse() {
        return new CariDataResponse();
    }

    /**
     * Create an instance of {@link HapusData }
     * 
     */
    public HapusData createHapusData() {
        return new HapusData();
    }

    /**
     * Create an instance of {@link TambahData }
     * 
     */
    public TambahData createTambahData() {
        return new TambahData();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link TampilDataResponse }
     * 
     */
    public TampilDataResponse createTampilDataResponse() {
        return new TampilDataResponse();
    }

    /**
     * Create an instance of {@link TampilData }
     * 
     */
    public TampilData createTampilData() {
        return new TampilData();
    }

    /**
     * Create an instance of {@link HapusDataResponse }
     * 
     */
    public HapusDataResponse createHapusDataResponse() {
        return new HapusDataResponse();
    }

    /**
     * Create an instance of {@link UrutkanDataResponse }
     * 
     */
    public UrutkanDataResponse createUrutkanDataResponse() {
        return new UrutkanDataResponse();
    }

    /**
     * Create an instance of {@link CariData }
     * 
     */
    public CariData createCariData() {
        return new CariData();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link UrutkanData }
     * 
     */
    public UrutkanData createUrutkanData() {
        return new UrutkanData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "editDataResponse")
    public JAXBElement<EditDataResponse> createEditDataResponse(EditDataResponse value) {
        return new JAXBElement<EditDataResponse>(_EditDataResponse_QNAME, EditDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "tambahDataResponse")
    public JAXBElement<TambahDataResponse> createTambahDataResponse(TambahDataResponse value) {
        return new JAXBElement<TambahDataResponse>(_TambahDataResponse_QNAME, TambahDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "editData")
    public JAXBElement<EditData> createEditData(EditData value) {
        return new JAXBElement<EditData>(_EditData_QNAME, EditData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "cariDataResponse")
    public JAXBElement<CariDataResponse> createCariDataResponse(CariDataResponse value) {
        return new JAXBElement<CariDataResponse>(_CariDataResponse_QNAME, CariDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HapusData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "hapusData")
    public JAXBElement<HapusData> createHapusData(HapusData value) {
        return new JAXBElement<HapusData>(_HapusData_QNAME, HapusData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TambahData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "tambahData")
    public JAXBElement<TambahData> createTambahData(TambahData value) {
        return new JAXBElement<TambahData>(_TambahData_QNAME, TambahData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "tampilData")
    public JAXBElement<TampilData> createTampilData(TampilData value) {
        return new JAXBElement<TampilData>(_TampilData_QNAME, TampilData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "tampilDataResponse")
    public JAXBElement<TampilDataResponse> createTampilDataResponse(TampilDataResponse value) {
        return new JAXBElement<TampilDataResponse>(_TampilDataResponse_QNAME, TampilDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CariData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "cariData")
    public JAXBElement<CariData> createCariData(CariData value) {
        return new JAXBElement<CariData>(_CariData_QNAME, CariData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrutkanData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "urutkanData")
    public JAXBElement<UrutkanData> createUrutkanData(UrutkanData value) {
        return new JAXBElement<UrutkanData>(_UrutkanData_QNAME, UrutkanData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HapusDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "hapusDataResponse")
    public JAXBElement<HapusDataResponse> createHapusDataResponse(HapusDataResponse value) {
        return new JAXBElement<HapusDataResponse>(_HapusDataResponse_QNAME, HapusDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrutkanDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mahasiswa.server/", name = "urutkanDataResponse")
    public JAXBElement<UrutkanDataResponse> createUrutkanDataResponse(UrutkanDataResponse value) {
        return new JAXBElement<UrutkanDataResponse>(_UrutkanDataResponse_QNAME, UrutkanDataResponse.class, null, value);
    }

}
