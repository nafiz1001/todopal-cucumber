package todopal.cucumber.features;

import io.cucumber.junit.Cucumber;

import io.cucumber.java.en.*;
import org.junit.runner.RunWith;

import java.util.HashSet;
import java.util.Set;

public class TestCreateClassroom {
    @Given("user {string} with {string} is logged in as a teacher")
    public void user_name_with_email_is_logged_in_as_a_teacher(String name, String email) {
    }

    @When("{string} creates a classroom with name {string} and image with path {string} and subject {string}")
    public void createsAClassroomWithName(String email, String classroomName, String imagePath, String subject) {
    }

    @Then("a new classroom with name {string} and a randomized unique {int}-digit classroom id is created for {string}")
    public void aNewClassroomWithNameAndARandomizedUniqueDigitClassroomIdIsCreated(String classroomName, int classroomIdLength, String teacherEmail) {
    }

    @Given("{string} is responsible for classroom {string}")
    public void isResponsibleForClassroom(String email, String classroomName) {
    }

    @Then("a {string} message is issued")
    public void aMessageIsIssued(String classroomAlreadyCreatedError) {
    }
}
