package hellocucumber;

public class StepDefs {
    private String today;
    private String actualAnswer;
    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";

        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);

        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(expectedAnswer, actualAnswer);

        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    static String isItFriday(String today) {
        return "Nope";
    }
}
