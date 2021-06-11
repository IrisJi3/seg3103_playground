defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "percentage_grade/1" do
    test "sample" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.70,
                 final: 0.9
               })
    end
  end
    describe "letter_grade/1" do
	test "ltr_gd_test_EIN" do
		assert "EIN" ==
				Calculator.letter_grade(%{
					homework: [0],
					labs: [0],
					midterm: 0,
					final: 0
				})
	end
  	test "test_E" do
		assert "E" ==
				Calculator.letter_grade(%{
					homework: [0.4],
					labs: [0.4, 0.4, 0.4],
					midterm: 0.4,
					final: 0.4
				})
	end
  	test "test_D" do
		assert "D" ==
				Calculator.letter_grade(%{
					homework: [0.5],
					labs: [0.5, 0.5, 0.5],
					midterm: 0.5,
					final: 0.5
				})
	end
  	test "test_D+" do
		assert "D+" ==
				Calculator.letter_grade(%{
					homework: [0.55],
					labs: [0.55, 0.55, 0.55],
					midterm: 0.55,
					final: 0.55
				})
	end
  	test "test_C" do
		assert "C" ==
				Calculator.letter_grade(%{
					homework: [0.6],
					labs: [0.6, 0.6, 0.6],
					midterm: 0.6,
					final: 0.6
				})
	end
  	test "test_C+" do
		assert "C+" ==
				Calculator.letter_grade(%{
					homework: [0.65],
					labs: [0.65, 0.65, 0.65],
					midterm: 0.65,
					final: 0.65
				})
	end
  	test "test_B" do
		assert "B" ==
				Calculator.letter_grade(%{
					homework: [0.7],
					labs: [0.7, 0.7, 0.7],
					midterm: 0.7,
					final: 0.7
				})
	end
  	test "test_B+" do
		assert "B+" ==
				Calculator.letter_grade(%{
					homework: [0.75],
					labs: [0.75, 0.75, 0.75],
					midterm: 0.75,
					final: 0.75
				})
	end
  	test "test_A-" do
		assert "A-" ==
				Calculator.letter_grade(%{
					homework: [0.8],
					labs: [0.8, 0.8, 0.8],
					midterm: 0.8,
					final: 0.8
				})
	end
  	test "test_A" do
		assert "A" ==
				Calculator.letter_grade(%{
					homework: [0.85],
					labs: [0.85, 0.9, 0.85],
					midterm: 0.85,
					final: 0.85
				})
	end
  	test "test_A+" do
		assert "A+" ==
				Calculator.letter_grade(%{
					homework: [1],
					labs: [1, 1, 1],
					midterm: 1,
					final: 1
				})
	end
end

  describe "numeric_grade/1" do
	test "test_0" do
		assert 0 ==
				Calculator.numeric_grade(%{
					homework: [0],
					labs: [0],
					midterm: 0,
					final: 0
				})
	end
  test "test_1" do
		assert 1 ==
				Calculator.numeric_grade(%{
					homework: [0.4],
					labs: [0.4, 0.4, 0.4],
					midterm: 0.4,
					final: 0.4
				})
	end
  	test "test_2" do
		assert 2 ==
				Calculator.numeric_grade(%{
					homework: [0.5],
					labs: [0.5, 0.5, 0.5],
					midterm: 0.5,
					final: 0.5
				})
	end
  	test "test_3" do
		assert 3 ==
				Calculator.numeric_grade(%{
					homework: [0.55],
					labs: [0.55, 0.55, 0.55],
					midterm: 0.55,
					final: 0.55
				})
	end
  	test "test_4" do
		assert 4 ==
				Calculator.numeric_grade(%{
					homework: [0.6],
					labs: [0.6, 0.6, 0.6],
					midterm: 0.6,
					final: 0.6
				})
	end
  	test "test_5" do
		assert 5 ==
				Calculator.numeric_grade(%{
					homework: [0.65],
					labs: [0.65, 0.65, 0.65],
					midterm: 0.65,
					final: 0.65
				})
	end
  	test "test_6" do
		assert 6 ==
				Calculator.numeric_grade(%{
					homework: [0.7],
					labs: [0.7, 0.7, 0.7],
					midterm: 0.7,
					final: 0.7
				})
	end
  	test "test_7" do
		assert 7 ==
				Calculator.numeric_grade(%{
					homework: [0.75],
					labs: [0.75, 0.75, 0.75],
					midterm: 0.75,
					final: 0.75
				})
				
	end
  	test "test_8" do
		assert 8 ==
				Calculator.numeric_grade(%{
					homework: [0.8],
					labs: [0.8, 0.8, 0.8],
					midterm: 0.8,
					final: 0.8
				})
	end
  	test "test_9" do
		assert 9 ==
				Calculator.numeric_grade(%{
					homework: [0.85],
					labs: [0.85, 0.9, 0.85],
					midterm: 0.85,
					final: 0.85
				})
	end
  	test "test_10" do
		assert 10 ==
				Calculator.numeric_grade(%{
					homework: [1],
					labs: [1, 1, 1],
					midterm: 1,
					final: 1
				})
	end
  end
end
