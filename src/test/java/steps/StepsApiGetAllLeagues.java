package steps;

import apiPojoDefs.AllLeaguesGet;
import apiPojoDefs.League;
import apiTestActions.GetRequest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Constants;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

import static utils.Constants.myLogger;

public class StepsApiGetAllLeagues {

    List<League> allLeagusesList;
    private GetRequest getRequest = new GetRequest();
    private TreeMap<Integer,String> getAllLeaguesRespone = new TreeMap<Integer, String>();
    private AllLeaguesGet allLeaguesGetMappedResponse;
    String responseString = null;

    @Given("^I invoke the api to get all leagues information$")
    public void iInvokeTheApiToGetAllLeaguesInformation() throws IOException {


        getAllLeaguesRespone = getRequest.hitApiGetAllLeagues(Constants.apiUrlGetAllLeagues);
        responseString = getAllLeaguesRespone.get(200);
    }

    @Then("^I get the list of all available leagues$")
    public void iGetTheListOfAllAvailableLeagues() throws IOException {
        allLeaguesGetMappedResponse = getRequest.AllLeaguesResponseMapper(responseString);
        int k = 0;
    }


    @And("^I Validate the count of leagues$")
    public void iValidateTheCountOfLeagues() {
        allLeagusesList = allLeaguesGetMappedResponse.getLeagues();
        int count = allLeagusesList.size();
        myLogger.info(" number of leagues :- " + count);

    }
}
