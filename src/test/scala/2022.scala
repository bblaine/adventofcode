class Advent2022Suite extends munit.FunSuite {
  test("Day1") {
    val data = loadData("day1-sample")
    val obtained = maxCalories(data)
    val expected = 24000
    assertEquals(obtained, expected)
  }

  test("Day2") {
    val data = loadData("day1-sample")
    val obtained = topThreeCalories(data)
    val expected = 45000
    assertEquals(obtained, expected)
  }
}
