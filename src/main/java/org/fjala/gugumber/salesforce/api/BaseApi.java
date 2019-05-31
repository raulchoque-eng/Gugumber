package org.fjala.gugumber.salesforce.api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.fjala.gugumber.salesforce.common.ReaderApplicationProperties;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseApi {

    private String urlAPI;
    private String accessToken;
    private String contentType;
    private String url;
    private Response response;
    private RequestSpecification request;

    public BaseApi() {
        initialize();
        requestAuthentication();
    }

    public Response post(String endpoint, Map<String, String> newObject) {
        url = urlAPI.concat(endpoint);
        response = request.body(newObject)
                .when().post(url);
        return response;
    }

    public Response delete(String endpoint) {
        url = urlAPI.concat(endpoint);
        response = request.when().delete(url);
        return response;
    }

    public Response get(String endpoint) {
        url = urlAPI.concat(endpoint);
        response = request.when().get(url);
        return response;
    }

    private void initialize() {
        urlAPI = ReaderApplicationProperties.getInstance().getAppProperties().get("urlAPI");
        accessToken = ReaderApplicationProperties.getInstance().getAppProperties().get("Access-Token");
        contentType = ReaderApplicationProperties.getInstance().getAppProperties().get("Content-Type");
    }

    private void requestAuthentication() {
        request = given().headers("Content-Type", contentType)
                .auth().oauth2(accessToken);
    }
}
