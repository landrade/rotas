
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
@WebService(name = "RouteSoap", targetNamespace = "http://webservices.maplink2.com.br")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RouteSoap {


    /**
     * Calcula os totais da rota informada.
     * 
     * @param ro
     * @param token
     * @param rs
     * @return
     *     returns br.com.maplink2.webservices.RouteTotals
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRouteTotals")
    @WebResult(name = "getRouteTotalsResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRouteTotals", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteTotals")
    @ResponseWrapper(localName = "getRouteTotalsResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteTotalsResponse")
    public RouteTotals getRouteTotals(
        @WebParam(name = "rs", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteStop rs,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Calcula os totais das rotas informadas no array.
     * 
     * @param ra
     * @param ro
     * @param token
     * @return
     *     returns br.com.maplink2.webservices.ArrayOfRouteTotals
     */
    @WebMethod(operationName = "GetRouteTotalsBatch", action = "http://webservices.maplink2.com.br/GetRouteTotalsBatch")
    @WebResult(name = "GetRouteTotalsBatchResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "GetRouteTotalsBatch", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteTotalsBatch")
    @ResponseWrapper(localName = "GetRouteTotalsBatchResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteTotalsBatchResponse")
    public ArrayOfRouteTotals getRouteTotalsBatch(
        @WebParam(name = "ra", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteArray ra,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna a rota entre os pontos informados com at\u00e9 duas alternativas (caso exista)
     * 
     * @param ro
     * @param token
     * @param rs
     * @return
     *     returns br.com.maplink2.webservices.AlternativeRouteInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRouteWithAlternatives")
    @WebResult(name = "getRouteWithAlternativesResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRouteWithAlternatives", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteWithAlternatives")
    @ResponseWrapper(localName = "getRouteWithAlternativesResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteWithAlternativesResponse")
    public AlternativeRouteInfo getRouteWithAlternatives(
        @WebParam(name = "rs", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteStop rs,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna rotas entre os pontos de origem e destinos informados.
     * 
     * @param ro
     * @param token
     * @param request
     * @return
     *     returns br.com.maplink2.webservices.MultiRoute
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getMultiRoute")
    @WebResult(name = "getMultiRouteResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getMultiRoute", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetMultiRoute")
    @ResponseWrapper(localName = "getMultiRouteResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetMultiRouteResponse")
    public MultiRoute getMultiRoute(
        @WebParam(name = "request", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfMultiRouteRequest request,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Retorna a rota entre os pontos informados.
     * 
     * @param ro
     * @param token
     * @param rs
     * @return
     *     returns br.com.maplink2.webservices.RouteInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRoute")
    @WebResult(name = "getRouteResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRoute", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRoute")
    @ResponseWrapper(localName = "getRouteResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteResponse")
    public RouteInfo getRoute(
        @WebParam(name = "rs", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteStop rs,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Gera o resumo da rota.
     * 
     * @param ro
     * @param token
     * @param rs
     * @return
     *     returns br.com.maplink2.webservices.ArrayOfRouteSummary
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRouteSummary")
    @WebResult(name = "getRouteSummaryResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRouteSummary", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteSummary")
    @ResponseWrapper(localName = "getRouteSummaryResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteSummaryResponse")
    public ArrayOfRouteSummary getRouteSummary(
        @WebParam(name = "rs", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteStop rs,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Gera a descri\u00e7\u00e3o da rota.
     * 
     * @param ro
     * @param token
     * @param rs
     * @return
     *     returns br.com.maplink2.webservices.ArrayOfSegmentDescription
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRouteDescription")
    @WebResult(name = "getRouteDescriptionResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRouteDescription", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteDescription")
    @ResponseWrapper(localName = "getRouteDescriptionResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteDescriptionResponse")
    public ArrayOfSegmentDescription getRouteDescription(
        @WebParam(name = "rs", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteStop rs,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

    /**
     * Calcula a rota e gera a imagem do mapa.
     * 
     * @param ro
     * @param mo
     * @param token
     * @param rs
     * @return
     *     returns br.com.maplink2.webservices.RouteInfo
     */
    @WebMethod(action = "http://webservices.maplink2.com.br/getRouteWithMap")
    @WebResult(name = "getRouteWithMapResult", targetNamespace = "http://webservices.maplink2.com.br")
    @RequestWrapper(localName = "getRouteWithMap", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteWithMap")
    @ResponseWrapper(localName = "getRouteWithMapResponse", targetNamespace = "http://webservices.maplink2.com.br", className = "br.com.maplink2.webservices.GetRouteWithMapResponse")
    public RouteInfo getRouteWithMap(
        @WebParam(name = "rs", targetNamespace = "http://webservices.maplink2.com.br")
        ArrayOfRouteStop rs,
        @WebParam(name = "ro", targetNamespace = "http://webservices.maplink2.com.br")
        RouteOptions ro,
        @WebParam(name = "mo", targetNamespace = "http://webservices.maplink2.com.br")
        MapOptions mo,
        @WebParam(name = "token", targetNamespace = "http://webservices.maplink2.com.br")
        String token);

}
