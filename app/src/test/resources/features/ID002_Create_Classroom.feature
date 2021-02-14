Feature: Create Classroom

As a registered TodoPal Teacher
I would like to create a classroom
So that I can add my students to it and distribute tasks, as well as manage the race

Scenario Outline: Create empty classroom (Normal Flow)

    Given user "Michael Scott" with "michael.scott@gmail.com" is logged in as a teacher
    When "michael.scott@gmail.com" creates a classroom with name "ecse428" and image with path "img.jpg" and subject "math"
    Then a new classroom with name "ecse428" and a randomized unique 7-digit classroom id is created for "michael.scott@gmail.com"

Scenario Outline: Create classroom with already existing name (Error flow)

    Given user "Michael Scott" with "michael.scott@gmail.com" is logged in as a teacher
    Given "michael.scott@gmail.com" is responsible for classroom "ecse428"
    When "michael.scott@gmail.com" creates a classroom with name "ecse428" and image with path "img.jpg" and subject "math"
    Then a "Classroom with same name already created" message is issued