package qaPuzzle.stepdefs;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class StepData {
    Response response;
    ValidatableResponse json;
    RequestSpecification request;
}
