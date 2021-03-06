
package br.com.maplink2.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AddressFinderSoap", targetNamespace = "http://webservices.maplink2.com.br")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AddressFinderSoap {


    /**
     * Retorna uma lista contendo POI candidatos.
     * 
     * @param token
     * @param name
     * @param resultRange
     * @param city
     * @return
     *     returns br.com.maplink2.webservices.POIInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/findPOI")
    @WebResult(name = "findPOIResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "findPOI", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindPOI")
    @ResponseWrapper(localName = "findPOIResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindPOIResponse")
    public POIInfo findPOI(
        @WebParam(name = "name", targetNamespace = "http://webservices.maplink2.com.br")
        String name,
        @WebParam(name = "city", targetNamespace = "http://webservices.maplink2.com.br")
        City city,
        @WebParam(name = "resultRange", targetNamespace = "http://webservices.maplink2.com.br")
        ResultRange resultRange,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna uma lista contendo endere\u00e7os candidatos.
     * 
     * @param ao
     * @param token
     * @param address
     * @return
     *     returns br.com.maplink2.webservices.AddressInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/findAddress")
    @WebResult(name = "findAddressResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "findAddress", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindAddress")
    @ResponseWrapper(localName = "findAddressResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindAddressResponse")
    public AddressInfo findAddress(
        @WebParam(name = "address", targetNamespace = "http://webservices.maplink2.com.br")
        Address address,
        @WebParam(name = "ao", targetNamespace = "http://webservices.maplink2.com.br")
        AddressOptions ao,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna uma lista contendo rodovias candidatas.
     * 
     * @param token
     * @param road
     * @return
     *     returns br.com.maplink2.webservices.RoadInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/findRoad")
    @WebResult(name = "findRoadResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "findRoad", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindRoad")
    @ResponseWrapper(localName = "findRoadResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindRoadResponse")
    public RoadInfo findRoad(
        @WebParam(name = "road", targetNamespace = "http://webservices.maplink2.com.br")
        Road road,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna uma lista contendo bairros/distritos candidatos.
     * 
     * @param token
     * @param rr
     * @param district
     * @return
     *     returns br.com.maplink2.webservices.DistrictInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/findDistrict")
    @WebResult(name = "findDistrictResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "findDistrict", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindDistrict")
    @ResponseWrapper(localName = "findDistrictResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindDistrictResponse")
    public DistrictInfo findDistrict(
        @WebParam(name = "district", targetNamespace = "http://webservices.maplink2.com.br")
        District district,
        @WebParam(name = "rr", targetNamespace = "http://webservices.maplink2.com.br")
        ResultRange rr,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna o endere\u00e7o do ponto informado.
     * 
     * @param point
     * @param token
     * @param tolerance
     * @return
     *     returns br.com.maplink2.webservices.AddressLocation
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getAddress")
    @WebResult(name = "getAddressResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getAddress", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetAddress")
    @ResponseWrapper(localName = "getAddressResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetAddressResponse")
    public AddressLocation getAddress(
        @WebParam(name = "point", targetNamespace = "http://webservices.maplink2.com.br")
        Point point,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token,
        @WebParam(name = "tolerance", targetNamespace = "http://webservices.maplink2.com.br")
        double tolerance);

    /**
     * Retorna a coordenada do endere\u00e7o informado.
     * 
     * @param token
     * @param address
     * @return
     *     returns br.com.maplink2.webservices.Point
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getXY")
    @WebResult(name = "getXYResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getXY", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetXY")
    @ResponseWrapper(localName = "getXYResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetXYResponse")
    public Point getXY(
        @WebParam(name = "address", targetNamespace = "http://webservices.maplink2.com.br")
        Address address,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna a coordenada da rodovia informada.
     * 
     * @param token
     * @param road
     * @return
     *     returns br.com.maplink2.webservices.Point
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRoadXY")
    @WebResult(name = "getRoadXYResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRoadXY", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRoadXY")
    @ResponseWrapper(localName = "getRoadXYResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRoadXYResponse")
    public Point getRoadXY(
        @WebParam(name = "road", targetNamespace = "http://webservices.maplink2.com.br")
        Road road,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna a a coordenada do ponto informado e a URL do mapa.
     * 
     * @param mo
     * @param token
     * @param address
     * @param radius
     * @return
     *     returns br.com.maplink2.webservices.MapInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getXYRadiusWithMap")
    @WebResult(name = "getXYRadiusWithMapResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getXYRadiusWithMap", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetXYRadiusWithMap")
    @ResponseWrapper(localName = "getXYRadiusWithMapResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetXYRadiusWithMapResponse")
    public MapInfo getXYRadiusWithMap(
        @WebParam(name = "address", targetNamespace = "http://webservices.maplink2.com.br")
        Address address,
        @WebParam(name = "mo", targetNamespace = "http://webservices.maplink2.com.br")
        MapOptions mo,
        @WebParam(name = "radius", targetNamespace = "http://webservices.maplink2.com.br")
        int radius,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna uma lista contendo dados da cidade informada.
     * 
     * @param cidade
     * @param ao
     * @param token
     * @return
     *     returns br.com.maplink2.webservices.CityLocationInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/findCity")
    @WebResult(name = "findCityResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "findCity", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindCity")
    @ResponseWrapper(localName = "findCityResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.FindCityResponse")
    public CityLocationInfo findCity(
        @WebParam(name = "cidade", targetNamespace = "http://webservices.maplink2.com.br")
        City cidade,
        @WebParam(name = "ao", targetNamespace = "http://webservices.maplink2.com.br")
        AddressOptions ao,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

}
