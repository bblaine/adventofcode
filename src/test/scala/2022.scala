class Advent2022Suite extends munit.FunSuite {
  test("Day1") {
    val data = loadData("day1-sample")
    val obtained = maxCalories(data)
    val expected = 24000
    assertEquals(obtained, expected)
  }

  test("Day1-2") {
    val data = loadData("day1-sample")
    val obtained = topThreeCalories(data)
    val expected = 45000
    assertEquals(obtained, expected)
  }

  test("Day2") {
    val data = loadData2("day2-sample")
    val obtained = totalScore(data)
    val expected = 15
    assertEquals(obtained, expected)
  }

  test("Day2-2") {
    val data = loadData2("day2-sample").map(x => elfStrategy(x))
    val obtained = totalScore(data)
    val expected = 12
    assertEquals(obtained, expected)
  }

  test("Day3-1") {
    val data = loadData3("day3-sample")
    val obtained = ruckSackPrioritySum(data)
    val expected = 157
    assertEquals(obtained, expected)
  }

  test("Day4-1"){
    val data = loadData4("day4-sample")
    val obtained = assignmentContainsSum(data)
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Day4-2"){
    val data = loadData4("day4-sample")
    val obtained = assignmentOverlapSum(data)
    val expected = 4
    assertEquals(obtained, expected)
  }

}
