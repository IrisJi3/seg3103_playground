defmodule Grades.Calculator do
  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do

    # Refactored for Q2.1
    {avg_homework, avg_labs} = avg(homework, labs)

    mark = calculate_grade(avg_labs, avg_homework, midterm, final)
    round(mark * 100)
  end

	# Refactored for Q2.1
  def avg(homework, labs) do
    avg_homework =
      if Enum.count(homework) == 0 do
        0
      else
        Enum.sum(homework) / Enum.count(homework)
      end

    avg_labs =
      if Enum.count(labs) == 0 do
        0
      else
        Enum.sum(labs) / Enum.count(labs)
      end
	  
	  {avg_homework, avg_labs} 
	end

  # Refactor for Q2.2
  def failed_to_participate(avg_homework, avg_exams, num_labs) do 
    avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3
  end

  # Refactor for Q2.3
  def calculate_grade(avg_labs, avg_homework, midterm, final) do 
    0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
  end
  
  # Refactor for Q2.4
  def avg_exams(midterm, final) do
    (midterm + final) / 2
  end
  
  # Refactor for Q2.4
  def num_labs(labs) do
      labs
      |> Enum.reject(fn mark -> mark < 0.25 end)
      |> Enum.count()
  end
  
  # Refactor for Q2.4
  def grading_letter(mark) do
    cond do
        mark > 0.895 -> "A+"
        mark > 0.845 -> "A"
        mark > 0.795 -> "A-"
        mark > 0.745 -> "B+"
        mark > 0.695 -> "B"
        mark > 0.645 -> "C+"
        mark > 0.595 -> "C"
        mark > 0.545 -> "D+"
        mark > 0.495 -> "D"
        mark > 0.395 -> "E"
        :else -> "F"
      end
  end
  
   # Refactor for Q 2.4
  def grading_point(mark) do  
      cond do
        mark > 0.895 -> 10
        mark > 0.845 -> 9
        mark > 0.795 -> 8
        mark > 0.745 -> 7
        mark > 0.695 -> 6
        mark > 0.645 -> 5
        mark > 0.595 -> 4
        mark > 0.545 -> 3
        mark > 0.495 -> 2
        mark > 0.395 -> 1
        :else -> 0
      end
  end
  
	def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
	
	{avg_homework, avg_labs} = avg(homework, labs)
	
    avg_exams = avg_exams(midterm, final)

    num_labs = num_labs(labs)


    if failed_to_participate(avg_homework, avg_exams, num_labs) do
      "EIN"
    else
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)
     
	 grading_letter(mark)
    end
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    
    {avg_homework, avg_labs} = avg(homework, labs)

    avg_exams = avg_exams(midterm, final)

    num_labs = num_labs(labs)


    if failed_to_participate(avg_homework, avg_exams, num_labs) do
      0
    else
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)

     grading_point(mark) 
    end
  end
end
