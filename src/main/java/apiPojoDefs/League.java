package apiPojoDefs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idLeague",
        "strLeague",
        "strSport",
        "strLeagueAlternate"
})
public class League {

    @JsonProperty("idLeague")
    private String idLeague;
    @JsonProperty("strLeague")
    private String strLeague;
    @JsonProperty("strSport")
    private String strSport;
    @JsonProperty("strLeagueAlternate")
    private String strLeagueAlternate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idLeague")
    public String getIdLeague() {
        return idLeague;
    }

    @JsonProperty("idLeague")
    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    @JsonProperty("strLeague")
    public String getStrLeague() {
        return strLeague;
    }

    @JsonProperty("strLeague")
    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    @JsonProperty("strSport")
    public String getStrSport() {
        return strSport;
    }

    @JsonProperty("strSport")
    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    @JsonProperty("strLeagueAlternate")
    public String getStrLeagueAlternate() {
        return strLeagueAlternate;
    }

    @JsonProperty("strLeagueAlternate")
    public void setStrLeagueAlternate(String strLeagueAlternate) {
        this.strLeagueAlternate = strLeagueAlternate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}