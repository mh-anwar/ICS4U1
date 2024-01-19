package Root;

import java.io.BufferedReader;
import java.net.*; // URL, HttpUrlConnection and all the exceptions
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// JSON Imports
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;

import java.io.*;

// This took 2 hours to make and debug....
public class GptApi {
    // Start making POST requests to chatgpt to fill out basic details
    public static String prompt(String query) {
        // Always set this
        String apiKey = System.getenv("OPENAI_KEY");
        String responseContent = "FAILED";
        JSONObject requestBody = null;

        String prompt = "You are a Java backend for a business simulation, use the options that are given and generate the data specifically according to the requirements. Do not provide anything except the data requested and only use JSON.";
        // Request body - do **NOT** modify or use GPT 4
        // remind me to never use JSON in java again - OR ANY API FOR THAT MATTER
        String requestString = "{" +
                "\"model\": \"gpt-3.5-turbo-1106\"," +
                "\"response_format\": {\"type\": \"json_object\"}," +
                "\"messages\": [{\"role\":\"system\",\"content\":\"" + prompt +
                "\"},{\"role\":\"user\",\"content\":\"" + query + "\"}]}";

        JSONParser parser = new JSONParser();
        try {
            requestBody = (JSONObject) parser.parse(requestString);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        // to let the request go thru set to != null
        if (requestBody != null) {
            // method chaining
            // https://www.baeldung.com/java-httpclient-post
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.openai.com/v1/chat/completions")) // url where request is sent
                    .headers("Content-Type", "application/json") // format of request body
                    .header("Authorization", "Bearer " + apiKey) // our api key to authorize our request
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody.toJSONString())) // the actual body
                    .build();
            HttpClient gptClient = HttpClient.newHttpClient();
            try {
                HttpResponse<String> response = gptClient.send(request, HttpResponse.BodyHandlers.ofString());
                responseContent = response.body(); // we need to parse this at some point
                System.out.println(responseContent);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        // try (BufferedReader in = new BufferedReader(new
        // InputStreamReader(conn.getInputStream()))) {
        // String inputLine;
        // while ((inputLine = in.readLine()) != null) {
        // data = (JSONObject) JSONValue.parse(inputLine);
        // }
        // }

        // Write data to a file (caching purposes)
        // JSONArray finalData = (JSONArray) data.get("items");
        /*
         * Iterator itr = leaderboard.iterator();
         * List<String> jsonValues = new ArrayList<String>();
         * 
         * Collections.sort(jsonValues);
         * JSONArray sortedJsonArray = new JSONArray(jsonValues);
         */
        return responseContent;
    }
}