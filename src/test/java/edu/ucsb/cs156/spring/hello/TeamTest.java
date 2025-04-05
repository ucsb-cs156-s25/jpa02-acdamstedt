package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team otherTeam;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");   
        otherTeam = new Team("test-team"); 
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_case1_works() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_case2_works() {
        assertTrue(!team.equals("hello"));
    }

    @Test
    public void equals_case3_works() {
        assertTrue(team.equals(otherTeam));
    }

    @Test
    public void hashCode_works() {
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

}
