package com.tdd.bowling;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BowlingScoreCalculatorTest {

  @Test
  public void should_get_score_equal_total_knockdown_bottles_when_calculate_total_score_given_no_spare_no_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 20;
    assertEquals(expectedScore, totalScore);
  }

  @Test
  public void should_get_score_equal_total_knockdown_bottles_plus_followed_one_knockdown_after_each_spare_when_calculate_total_score_given_at_least_one_spare_no_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 29;
    assertEquals(expectedScore, totalScore);
  }


  @Test
  public void should_get_score_equal_total_knockdown_bottles_plus_followed_two_knockdown_after_each_spike_when_calculate_total_score_given_no_spare_at_least_one_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 30;
    assertEquals(expectedScore, totalScore);
  }


  @Test
  public void should_get_score_equal_total_knockdown_bottles_plus_followed_one_knockdown_after_each_spare_plus_followed_two_knockdown_after_each_spike_when_calculate_total_score_given_at_least_one_spare_at_least_one_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(10, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 39;
    assertEquals(expectedScore, totalScore);
  }

  @Test
  public void should_get_score_equal_total_knockdown_plus_followed_two_knockdown_after_each_spike_when_calculate_total_score_given_all_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
        10);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 300;
    assertEquals(expectedScore, totalScore);
  }

  @Test
  public void should_get_score_equal_total_knockdown_plus_followed_one_knockdown_after_each_spare_when_calculate_total_score_given_all_spare_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 9, 1, 8, 2, 7,
        3, 6, 4, 5, 5, 5);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 154;
    assertEquals(expectedScore, totalScore);
  }
}
