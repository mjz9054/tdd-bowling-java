package com.tdd.bowling;

import java.util.List;

public class BowlingScoreCalculator {

  public static int calculateTotalScore(List<Integer> knockdownBottlesNumberList) {
    return knockdownBottlesNumberList.stream().mapToInt(Integer::intValue).sum();
  }
}
