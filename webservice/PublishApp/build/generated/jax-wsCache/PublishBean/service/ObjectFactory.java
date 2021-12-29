
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _AddAddressToCustomer_QNAME = new QName("http://ejb/", "addAddressToCustomer");
    private final static QName _AddAddressToCustomerResponse_QNAME = new QName("http://ejb/", "addAddressToCustomerResponse");
    private final static QName _AddCustomer_QNAME = new QName("http://ejb/", "addCustomer");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://ejb/", "addCustomerResponse");
    private final static QName _AddSubscription_QNAME = new QName("http://ejb/", "addSubscription");
    private final static QName _AddSubscriptionResponse_QNAME = new QName("http://ejb/", "addSubscriptionResponse");
    private final static QName _AddSubscriptionsToCustomer_QNAME = new QName("http://ejb/", "addSubscriptionsToCustomer");
    private final static QName _AddSubscriptionsToCustomerResponse_QNAME = new QName("http://ejb/", "addSubscriptionsToCustomerResponse");
    private final static QName _Address_QNAME = new QName("http://ejb/", "address");
    private final static QName _Customer_QNAME = new QName("http://ejb/", "customer");
    private final static QName _FindCustomerById_QNAME = new QName("http://ejb/", "findCustomerById");
    private final static QName _FindCustomerByIdResponse_QNAME = new QName("http://ejb/", "findCustomerByIdResponse");
    private final static QName _GetAddressOfCustomer_QNAME = new QName("http://ejb/", "getAddressOfCustomer");
    private final static QName _GetAddressOfCustomerResponse_QNAME = new QName("http://ejb/", "getAddressOfCustomerResponse");
    private final static QName _GetAddressesByCity_QNAME = new QName("http://ejb/", "getAddressesByCity");
    private final static QName _GetAddressesByCityResponse_QNAME = new QName("http://ejb/", "getAddressesByCityResponse");
    private final static QName _GetAddressesByZip_QNAME = new QName("http://ejb/", "getAddressesByZip");
    private final static QName _GetAddressesByZipResponse_QNAME = new QName("http://ejb/", "getAddressesByZipResponse");
    private final static QName _GetAllCustomers_QNAME = new QName("http://ejb/", "getAllCustomers");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://ejb/", "getAllCustomersResponse");
    private final static QName _GetCustomersByFirstName_QNAME = new QName("http://ejb/", "getCustomersByFirstName");
    private final static QName _GetCustomersByFirstNameResponse_QNAME = new QName("http://ejb/", "getCustomersByFirstNameResponse");
    private final static QName _GetCustomersByLastName_QNAME = new QName("http://ejb/", "getCustomersByLastName");
    private final static QName _GetCustomersByLastNameResponse_QNAME = new QName("http://ejb/", "getCustomersByLastNameResponse");
    private final static QName _GetSubscriptionsByType_QNAME = new QName("http://ejb/", "getSubscriptionsByType");
    private final static QName _GetSubscriptionsByTypeResponse_QNAME = new QName("http://ejb/", "getSubscriptionsByTypeResponse");
    private final static QName _GetSubscriptionsofCustomer_QNAME = new QName("http://ejb/", "getSubscriptionsofCustomer");
    private final static QName _GetSubscriptionsofCustomerResponse_QNAME = new QName("http://ejb/", "getSubscriptionsofCustomerResponse");
    private final static QName _RemoveAddressToCustomers_QNAME = new QName("http://ejb/", "removeAddressToCustomers");
    private final static QName _RemoveAddressToCustomersResponse_QNAME = new QName("http://ejb/", "removeAddressToCustomersResponse");
    private final static QName _RemoveCustomer_QNAME = new QName("http://ejb/", "removeCustomer");
    private final static QName _RemoveCustomerResponse_QNAME = new QName("http://ejb/", "removeCustomerResponse");
    private final static QName _RemoveSubscription_QNAME = new QName("http://ejb/", "removeSubscription");
    private final static QName _RemoveSubscriptionResponse_QNAME = new QName("http://ejb/", "removeSubscriptionResponse");
    private final static QName _RemoveSubscriptionsToCustomer_QNAME = new QName("http://ejb/", "removeSubscriptionsToCustomer");
    private final static QName _RemoveSubscriptionsToCustomerResponse_QNAME = new QName("http://ejb/", "removeSubscriptionsToCustomerResponse");
    private final static QName _Subscription_QNAME = new QName("http://ejb/", "subscription");
    private final static QName _UpdateCustomer_QNAME = new QName("http://ejb/", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://ejb/", "updateCustomerResponse");
    private final static QName _UpdateSubscription_QNAME = new QName("http://ejb/", "updateSubscription");
    private final static QName _UpdateSubscriptionResponse_QNAME = new QName("http://ejb/", "updateSubscriptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAddressToCustomer }
     * 
     */
    public AddAddressToCustomer createAddAddressToCustomer() {
        return new AddAddressToCustomer();
    }

    /**
     * Create an instance of {@link AddAddressToCustomerResponse }
     * 
     */
    public AddAddressToCustomerResponse createAddAddressToCustomerResponse() {
        return new AddAddressToCustomerResponse();
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link AddSubscription }
     * 
     */
    public AddSubscription createAddSubscription() {
        return new AddSubscription();
    }

    /**
     * Create an instance of {@link AddSubscriptionResponse }
     * 
     */
    public AddSubscriptionResponse createAddSubscriptionResponse() {
        return new AddSubscriptionResponse();
    }

    /**
     * Create an instance of {@link AddSubscriptionsToCustomer }
     * 
     */
    public AddSubscriptionsToCustomer createAddSubscriptionsToCustomer() {
        return new AddSubscriptionsToCustomer();
    }

    /**
     * Create an instance of {@link AddSubscriptionsToCustomerResponse }
     * 
     */
    public AddSubscriptionsToCustomerResponse createAddSubscriptionsToCustomerResponse() {
        return new AddSubscriptionsToCustomerResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link FindCustomerById }
     * 
     */
    public FindCustomerById createFindCustomerById() {
        return new FindCustomerById();
    }

    /**
     * Create an instance of {@link FindCustomerByIdResponse }
     * 
     */
    public FindCustomerByIdResponse createFindCustomerByIdResponse() {
        return new FindCustomerByIdResponse();
    }

    /**
     * Create an instance of {@link GetAddressOfCustomer }
     * 
     */
    public GetAddressOfCustomer createGetAddressOfCustomer() {
        return new GetAddressOfCustomer();
    }

    /**
     * Create an instance of {@link GetAddressOfCustomerResponse }
     * 
     */
    public GetAddressOfCustomerResponse createGetAddressOfCustomerResponse() {
        return new GetAddressOfCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAddressesByCity }
     * 
     */
    public GetAddressesByCity createGetAddressesByCity() {
        return new GetAddressesByCity();
    }

    /**
     * Create an instance of {@link GetAddressesByCityResponse }
     * 
     */
    public GetAddressesByCityResponse createGetAddressesByCityResponse() {
        return new GetAddressesByCityResponse();
    }

    /**
     * Create an instance of {@link GetAddressesByZip }
     * 
     */
    public GetAddressesByZip createGetAddressesByZip() {
        return new GetAddressesByZip();
    }

    /**
     * Create an instance of {@link GetAddressesByZipResponse }
     * 
     */
    public GetAddressesByZipResponse createGetAddressesByZipResponse() {
        return new GetAddressesByZipResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByFirstName }
     * 
     */
    public GetCustomersByFirstName createGetCustomersByFirstName() {
        return new GetCustomersByFirstName();
    }

    /**
     * Create an instance of {@link GetCustomersByFirstNameResponse }
     * 
     */
    public GetCustomersByFirstNameResponse createGetCustomersByFirstNameResponse() {
        return new GetCustomersByFirstNameResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByLastName }
     * 
     */
    public GetCustomersByLastName createGetCustomersByLastName() {
        return new GetCustomersByLastName();
    }

    /**
     * Create an instance of {@link GetCustomersByLastNameResponse }
     * 
     */
    public GetCustomersByLastNameResponse createGetCustomersByLastNameResponse() {
        return new GetCustomersByLastNameResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionsByType }
     * 
     */
    public GetSubscriptionsByType createGetSubscriptionsByType() {
        return new GetSubscriptionsByType();
    }

    /**
     * Create an instance of {@link GetSubscriptionsByTypeResponse }
     * 
     */
    public GetSubscriptionsByTypeResponse createGetSubscriptionsByTypeResponse() {
        return new GetSubscriptionsByTypeResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionsofCustomer }
     * 
     */
    public GetSubscriptionsofCustomer createGetSubscriptionsofCustomer() {
        return new GetSubscriptionsofCustomer();
    }

    /**
     * Create an instance of {@link GetSubscriptionsofCustomerResponse }
     * 
     */
    public GetSubscriptionsofCustomerResponse createGetSubscriptionsofCustomerResponse() {
        return new GetSubscriptionsofCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveAddressToCustomers }
     * 
     */
    public RemoveAddressToCustomers createRemoveAddressToCustomers() {
        return new RemoveAddressToCustomers();
    }

    /**
     * Create an instance of {@link RemoveAddressToCustomersResponse }
     * 
     */
    public RemoveAddressToCustomersResponse createRemoveAddressToCustomersResponse() {
        return new RemoveAddressToCustomersResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomer }
     * 
     */
    public RemoveCustomer createRemoveCustomer() {
        return new RemoveCustomer();
    }

    /**
     * Create an instance of {@link RemoveCustomerResponse }
     * 
     */
    public RemoveCustomerResponse createRemoveCustomerResponse() {
        return new RemoveCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscription }
     * 
     */
    public RemoveSubscription createRemoveSubscription() {
        return new RemoveSubscription();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionResponse }
     * 
     */
    public RemoveSubscriptionResponse createRemoveSubscriptionResponse() {
        return new RemoveSubscriptionResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionsToCustomer }
     * 
     */
    public RemoveSubscriptionsToCustomer createRemoveSubscriptionsToCustomer() {
        return new RemoveSubscriptionsToCustomer();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionsToCustomerResponse }
     * 
     */
    public RemoveSubscriptionsToCustomerResponse createRemoveSubscriptionsToCustomerResponse() {
        return new RemoveSubscriptionsToCustomerResponse();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscription }
     * 
     */
    public UpdateSubscription createUpdateSubscription() {
        return new UpdateSubscription();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionResponse }
     * 
     */
    public UpdateSubscriptionResponse createUpdateSubscriptionResponse() {
        return new UpdateSubscriptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAddressToCustomer")
    public JAXBElement<AddAddressToCustomer> createAddAddressToCustomer(AddAddressToCustomer value) {
        return new JAXBElement<AddAddressToCustomer>(_AddAddressToCustomer_QNAME, AddAddressToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAddressToCustomerResponse")
    public JAXBElement<AddAddressToCustomerResponse> createAddAddressToCustomerResponse(AddAddressToCustomerResponse value) {
        return new JAXBElement<AddAddressToCustomerResponse>(_AddAddressToCustomerResponse_QNAME, AddAddressToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscription")
    public JAXBElement<AddSubscription> createAddSubscription(AddSubscription value) {
        return new JAXBElement<AddSubscription>(_AddSubscription_QNAME, AddSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionResponse")
    public JAXBElement<AddSubscriptionResponse> createAddSubscriptionResponse(AddSubscriptionResponse value) {
        return new JAXBElement<AddSubscriptionResponse>(_AddSubscriptionResponse_QNAME, AddSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionsToCustomer")
    public JAXBElement<AddSubscriptionsToCustomer> createAddSubscriptionsToCustomer(AddSubscriptionsToCustomer value) {
        return new JAXBElement<AddSubscriptionsToCustomer>(_AddSubscriptionsToCustomer_QNAME, AddSubscriptionsToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionsToCustomerResponse")
    public JAXBElement<AddSubscriptionsToCustomerResponse> createAddSubscriptionsToCustomerResponse(AddSubscriptionsToCustomerResponse value) {
        return new JAXBElement<AddSubscriptionsToCustomerResponse>(_AddSubscriptionsToCustomerResponse_QNAME, AddSubscriptionsToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Address }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCustomerById }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findCustomerById")
    public JAXBElement<FindCustomerById> createFindCustomerById(FindCustomerById value) {
        return new JAXBElement<FindCustomerById>(_FindCustomerById_QNAME, FindCustomerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCustomerByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findCustomerByIdResponse")
    public JAXBElement<FindCustomerByIdResponse> createFindCustomerByIdResponse(FindCustomerByIdResponse value) {
        return new JAXBElement<FindCustomerByIdResponse>(_FindCustomerByIdResponse_QNAME, FindCustomerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressOfCustomer")
    public JAXBElement<GetAddressOfCustomer> createGetAddressOfCustomer(GetAddressOfCustomer value) {
        return new JAXBElement<GetAddressOfCustomer>(_GetAddressOfCustomer_QNAME, GetAddressOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressOfCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressOfCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressOfCustomerResponse")
    public JAXBElement<GetAddressOfCustomerResponse> createGetAddressOfCustomerResponse(GetAddressOfCustomerResponse value) {
        return new JAXBElement<GetAddressOfCustomerResponse>(_GetAddressOfCustomerResponse_QNAME, GetAddressOfCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByCity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByCity }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByCity")
    public JAXBElement<GetAddressesByCity> createGetAddressesByCity(GetAddressesByCity value) {
        return new JAXBElement<GetAddressesByCity>(_GetAddressesByCity_QNAME, GetAddressesByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByCityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByCityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByCityResponse")
    public JAXBElement<GetAddressesByCityResponse> createGetAddressesByCityResponse(GetAddressesByCityResponse value) {
        return new JAXBElement<GetAddressesByCityResponse>(_GetAddressesByCityResponse_QNAME, GetAddressesByCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByZip")
    public JAXBElement<GetAddressesByZip> createGetAddressesByZip(GetAddressesByZip value) {
        return new JAXBElement<GetAddressesByZip>(_GetAddressesByZip_QNAME, GetAddressesByZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByZipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByZipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByZipResponse")
    public JAXBElement<GetAddressesByZipResponse> createGetAddressesByZipResponse(GetAddressesByZipResponse value) {
        return new JAXBElement<GetAddressesByZipResponse>(_GetAddressesByZipResponse_QNAME, GetAddressesByZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomers")
    public JAXBElement<GetAllCustomers> createGetAllCustomers(GetAllCustomers value) {
        return new JAXBElement<GetAllCustomers>(_GetAllCustomers_QNAME, GetAllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersByFirstName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomersByFirstName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomersByFirstName")
    public JAXBElement<GetCustomersByFirstName> createGetCustomersByFirstName(GetCustomersByFirstName value) {
        return new JAXBElement<GetCustomersByFirstName>(_GetCustomersByFirstName_QNAME, GetCustomersByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersByFirstNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomersByFirstNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomersByFirstNameResponse")
    public JAXBElement<GetCustomersByFirstNameResponse> createGetCustomersByFirstNameResponse(GetCustomersByFirstNameResponse value) {
        return new JAXBElement<GetCustomersByFirstNameResponse>(_GetCustomersByFirstNameResponse_QNAME, GetCustomersByFirstNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersByLastName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomersByLastName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomersByLastName")
    public JAXBElement<GetCustomersByLastName> createGetCustomersByLastName(GetCustomersByLastName value) {
        return new JAXBElement<GetCustomersByLastName>(_GetCustomersByLastName_QNAME, GetCustomersByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersByLastNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomersByLastNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomersByLastNameResponse")
    public JAXBElement<GetCustomersByLastNameResponse> createGetCustomersByLastNameResponse(GetCustomersByLastNameResponse value) {
        return new JAXBElement<GetCustomersByLastNameResponse>(_GetCustomersByLastNameResponse_QNAME, GetCustomersByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsByType")
    public JAXBElement<GetSubscriptionsByType> createGetSubscriptionsByType(GetSubscriptionsByType value) {
        return new JAXBElement<GetSubscriptionsByType>(_GetSubscriptionsByType_QNAME, GetSubscriptionsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsByTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsByTypeResponse")
    public JAXBElement<GetSubscriptionsByTypeResponse> createGetSubscriptionsByTypeResponse(GetSubscriptionsByTypeResponse value) {
        return new JAXBElement<GetSubscriptionsByTypeResponse>(_GetSubscriptionsByTypeResponse_QNAME, GetSubscriptionsByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsofCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsofCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsofCustomer")
    public JAXBElement<GetSubscriptionsofCustomer> createGetSubscriptionsofCustomer(GetSubscriptionsofCustomer value) {
        return new JAXBElement<GetSubscriptionsofCustomer>(_GetSubscriptionsofCustomer_QNAME, GetSubscriptionsofCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsofCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsofCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsofCustomerResponse")
    public JAXBElement<GetSubscriptionsofCustomerResponse> createGetSubscriptionsofCustomerResponse(GetSubscriptionsofCustomerResponse value) {
        return new JAXBElement<GetSubscriptionsofCustomerResponse>(_GetSubscriptionsofCustomerResponse_QNAME, GetSubscriptionsofCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressToCustomers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddressToCustomers }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAddressToCustomers")
    public JAXBElement<RemoveAddressToCustomers> createRemoveAddressToCustomers(RemoveAddressToCustomers value) {
        return new JAXBElement<RemoveAddressToCustomers>(_RemoveAddressToCustomers_QNAME, RemoveAddressToCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressToCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddressToCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAddressToCustomersResponse")
    public JAXBElement<RemoveAddressToCustomersResponse> createRemoveAddressToCustomersResponse(RemoveAddressToCustomersResponse value) {
        return new JAXBElement<RemoveAddressToCustomersResponse>(_RemoveAddressToCustomersResponse_QNAME, RemoveAddressToCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCustomer")
    public JAXBElement<RemoveCustomer> createRemoveCustomer(RemoveCustomer value) {
        return new JAXBElement<RemoveCustomer>(_RemoveCustomer_QNAME, RemoveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCustomerResponse")
    public JAXBElement<RemoveCustomerResponse> createRemoveCustomerResponse(RemoveCustomerResponse value) {
        return new JAXBElement<RemoveCustomerResponse>(_RemoveCustomerResponse_QNAME, RemoveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscription")
    public JAXBElement<RemoveSubscription> createRemoveSubscription(RemoveSubscription value) {
        return new JAXBElement<RemoveSubscription>(_RemoveSubscription_QNAME, RemoveSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionResponse")
    public JAXBElement<RemoveSubscriptionResponse> createRemoveSubscriptionResponse(RemoveSubscriptionResponse value) {
        return new JAXBElement<RemoveSubscriptionResponse>(_RemoveSubscriptionResponse_QNAME, RemoveSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionsToCustomer")
    public JAXBElement<RemoveSubscriptionsToCustomer> createRemoveSubscriptionsToCustomer(RemoveSubscriptionsToCustomer value) {
        return new JAXBElement<RemoveSubscriptionsToCustomer>(_RemoveSubscriptionsToCustomer_QNAME, RemoveSubscriptionsToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionsToCustomerResponse")
    public JAXBElement<RemoveSubscriptionsToCustomerResponse> createRemoveSubscriptionsToCustomerResponse(RemoveSubscriptionsToCustomerResponse value) {
        return new JAXBElement<RemoveSubscriptionsToCustomerResponse>(_RemoveSubscriptionsToCustomerResponse_QNAME, RemoveSubscriptionsToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "subscription")
    public JAXBElement<Subscription> createSubscription(Subscription value) {
        return new JAXBElement<Subscription>(_Subscription_QNAME, Subscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateSubscription")
    public JAXBElement<UpdateSubscription> createUpdateSubscription(UpdateSubscription value) {
        return new JAXBElement<UpdateSubscription>(_UpdateSubscription_QNAME, UpdateSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateSubscriptionResponse")
    public JAXBElement<UpdateSubscriptionResponse> createUpdateSubscriptionResponse(UpdateSubscriptionResponse value) {
        return new JAXBElement<UpdateSubscriptionResponse>(_UpdateSubscriptionResponse_QNAME, UpdateSubscriptionResponse.class, null, value);
    }

}
