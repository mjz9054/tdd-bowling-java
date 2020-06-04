package com.tdd.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingScoreCalculator {

  public static int calculateTotalScore(List<Integer> knockdownBottlesNumberList) {

    List<Integer> extraList = new ArrayList<>();
    for (int i = 0; i < knockdownBottlesNumberList.size() - 1; i++) {
      Integer knockdownBottlesNumber = knockdownBottlesNumberList.get(i);
      Integer nextKnockdownBottlesNumber = knockdownBottlesNumberList.get(i + 1);

      if (knockdownBottlesNumber + nextKnockdownBottlesNumber == 10) {
        extraList.add(knockdownBottlesNumberList.get(i + 2));
        i++;
      }
    }
    extraList.addAll(knockdownBottlesNumberList);
    return extraList.stream().mapToInt(Integer::intValue).sum();
  }
}
