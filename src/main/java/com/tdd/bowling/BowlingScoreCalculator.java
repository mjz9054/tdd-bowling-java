package com.tdd.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingScoreCalculator {

  private static final int ROUND_NUMBER = 10;
  private static final int NUMBER_OF_BOTTLES = 10;

  public static int calculateTotalScore(List<Integer> knockdownBottlesNumberList) {

    List<Integer> extraList = new ArrayList<>();
    int round = 1;
    for (int i = 0; i < knockdownBottlesNumberList.size() - 1 && round <= ROUND_NUMBER - 1; ) {
      round++;
      Integer knockdownBottlesNumber = knockdownBottlesNumberList.get(i);

      if (knockdownBottlesNumber == NUMBER_OF_BOTTLES) {
        extraList.add(knockdownBottlesNumberList.get(i + 1));
        extraList.add(knockdownBottlesNumberList.get(i + 2));
        i++;
        continue;
      }

      Integer nextKnockdownBottlesNumber = knockdownBottlesNumberList.get(i + 1);
      if (knockdownBottlesNumber + nextKnockdownBottlesNumber == NUMBER_OF_BOTTLES) {
        extraList.add(knockdownBottlesNumberList.get(i + 2));
      }
      i += 2;
    }

    extraList.addAll(knockdownBottlesNumberList);
    return extraList.stream().mapToInt(Integer::intValue).sum();
  }
}
