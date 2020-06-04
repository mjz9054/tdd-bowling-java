package com.tdd.bowling;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BowlingScoreCalculatorTest {

  @Test
  public void should_get_score_equal_total_knockdown_bottles_when_calculate_total_score_given_no_spare_no_strike_knockdown_bottles_number_list() {

    // GIVEN
    List<Integer> knockdownBottlesNumberList = asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1);

    // WHEN
    int totalScore = BowlingScoreCalculator.calculateTotalScore(knockdownBottlesNumberList);

    // THEN
    int expectedScore = 20;
    assertEquals(expectedScore, totalScore);
  }
}
