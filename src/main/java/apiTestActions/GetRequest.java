package apiTestActions;

import apiPojoDefs.AllLeaguesGet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.Response;
import utils.Constants;

import java.io.IOException;
import java.util.TreeMap;

import static com.jayway.restassured.RestAssured.given;


public class GetRequest {

    private Response responseGetRequest;
    // private GetTypeTouch getTypeTouch = new GetTypeTouch();

    public TreeMap<Integer,String> hitApiGetAllLeagues(String apiEndPoint) throws IOException {
        Integer statusCode = 0;
        String responseString = null;
        TreeMap<Integer,String> apiStatusCodeAndResponseString = new TreeMap<Integer,String>();

        responseGetRequest = given().
                header("X-RapidAPI-Host", "thesportsdb.p.rapidapi.com").
                header("X-RapidAPI-Key", Constants.apiKey).
                when().
                get(apiEndPoint);

        statusCode = responseGetRequest.getStatusCode();
        responseString = responseGetRequest.asString();

        apiStatusCodeAndResponseString.put(statusCode, responseString);
        return apiStatusCodeAndResponseString;

    }


    public AllLeaguesGet AllLeaguesResponseMapper(String respString) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return (mapper.readValue(respString, AllLeaguesGet.class));

    }



}
