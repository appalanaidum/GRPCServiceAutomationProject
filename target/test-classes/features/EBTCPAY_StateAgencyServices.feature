Feature: Retrieve State Agency Information
  As a client of the system
  I want to retrieve information about a state agency
  So that I can access relevant details

  @Sanity
  Scenario: Retrieve State Agency Information Successfully
    Given the gRPC client is connected to the server
    When I make a call to retrieve the state agency information with a valid state agency id "406a17c1-3574-4597-9345-3dceb12121ab"
    Then the response should include the state agency details
    And the response status code should indicate success

  @Sanity
  Scenario Outline: Retrieve Local Agency Information Successfully
    Given the gRPC client is connected to the server
    When I make a call to retrieve the local agency information with a valid StateAgencyId <StateAgencyId> and LocalAgencyId <LocalAgencyId> and MisLocalAgencyId <MisLocalAgencyId>
    Then the response should include the local agency details

    Examples: 
      | StateAgencyId                        | LocalAgencyId                        | MisLocalAgencyId |
      | 933edcf0-7925-4a86-89a3-7c8776df9448 | 48b9873c-1466-475b-937f-a33bac4fda1d |       9000000001 |
