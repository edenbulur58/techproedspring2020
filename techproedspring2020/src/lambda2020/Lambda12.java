package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda12 {

	public static void main(String[] args) {
	Course courseTurkishDay=new Course("Summer","Turkish Day",97,128);
	Course courseTurkishNight=new Course("Winter","Turkish Night",98,154);
	Course courseEnglishDay=new Course("Spring","English Day",95,132);
	Course courseEnglishNight=new Course("Winter","English Night",93,144);
	
	List<Course>courseList=new ArrayList<>();
	courseList.add(courseTurkishDay);
	courseList.add(courseTurkishNight);
	courseList.add(courseEnglishDay);
	courseList.add(courseEnglishNight);
	System.out.println(courseList);
	
	
	//Check if all average scores are more than 90
	System.out.println(courseList.stream()
			                     .allMatch(t->t.getAverageScore()>90));//true
	
	
	//Check if all course names contains the word "Day"
	System.out.println(courseList.stream()
	                             .allMatch(t->t.getCourseName().contains("Day")));//false
	
	
	//Check if any number of students is 154
	System.out.println(courseList.stream()
			                     .anyMatch(t->t.getNumberOfStudents()==154));//true
	
	//Check if any season containts "Winter"
	System.out.println(courseList.stream()
			                     .anyMatch(t->t.getSeason().contains("Winter")));//true
	
	//Check if no number of students is equal to 0
	System.out.println(courseList.stream()
			                     .noneMatch(t->t.getNumberOfStudents()==0));//true
	
	//Sort the list elements according to the number of students
	Comparator<Course> comparotorForNumberOfStudent=Comparator.comparing(Course::getNumberOfStudents);
	System.out.println(courseList.stream()
			                     .sorted(comparotorForNumberOfStudent)
	                             .collect(Collectors.toList()));
	
	//courseList.stream()
	//          .sorted(comparotorForNumberOfStudent)
	//            .forEach(System.out::print);
	
	
//Sort the elements according to the name of the course	
	
Comparator<Course>comparatorForNameOfCourse=Comparator.comparing(Course::getCourseName);
System.out.println(courseList.stream()
		               .sorted(comparatorForNameOfCourse)
		               .collect(Collectors.toList()));

//Sort the elements according to the name of the course	in reversed order	
Comparator<Course>comparatorForNameOfCourse2=Comparator.comparing(Course::getCourseName).reversed();
             System.out.println(courseList.stream()
		               .sorted(comparatorForNameOfCourse2)
		               .collect(Collectors.toList()));
		           
//Sort the elements by using season and average score
             
 Comparator<Course> comparatorForSeasonAndAverage=Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);      
	 
 courseList.stream()
           .sorted(comparatorForSeasonAndAverage)
           .limit(3)//if you want to see just 3 elements use limit(3)
	       .collect(Collectors.toList());
	
//Print the element whose number of student is maximum on the console by using sort and limit methods 	
 Comparator<Course> maxNumberOfStudents=Comparator.comparing(Course::getNumberOfStudents).reversed();
	courseList.stream()
	          .sorted(maxNumberOfStudents)
	          .limit(1)
	          .forEach(System.out::print);
	
	System.out.println();
//Print the element whose number of student is maximum on the console by using sort and limit methods 		
	Comparator<Course> maxSecondNumberOfStudents=Comparator.comparing(Course::getNumberOfStudents).reversed();
	System.out.println(courseList.stream()
	          .sorted(maxSecondNumberOfStudents)	
	          .skip(1)//if you skip some elements use skip with the number of elements
	          .limit(1)
	          .collect(Collectors.toList()));
	
//Find the first element 	
	System.out.println(courseList.stream()
	                             .findFirst());

//Find the any element
	System.out.println(courseList.stream()//it is free to select any element in the stream
                                .findAny());          
	//Find the last element	
	Comparator<Course> findLastElement=Comparator.comparing(Course::getNumberOfStudents).reversed();
	System.out.println(courseList.stream()
			                     .sorted(findLastElement)
			                     .limit(1)
			                     .collect(Collectors.toList()));
	
	Comparator<Course> findLastElement2=Comparator.comparing(Course::getNumberOfStudents).reversed();
	System.out.println(courseList.stream()
			                     .sorted(findLastElement2)
			                     .findFirst());
	
//Find the sum of the number of students whose average scores are more than 95
	System.out.println(courseList.stream()
	                             .filter(t->t.getAverageScore()>95)
	                             .mapToInt(Course::getNumberOfStudents)//mapToInt() method converts stream values to Integers
	                             .sum());   

//Find the average of the number of students whose average grades are more than 93
	System.out.println(courseList.stream()
	                             .filter(t->t.getAverageScore()>93)
	                             .mapToDouble(Course::getNumberOfStudents)
	                             .average());//138==>(128+154+132)/3=138
	
//Find the number of courses whose average grades are more than 93
	
	System.out.println(courseList.stream()
	                             .filter(t->t.getAverageScore()>93)
	                             .count());//3
	
//Group the courses according to the season
	Comparator<Course> groupOfCourse=Comparator.comparing(Course::getSeason);
	
	System.out.println(courseList.stream()
	          .collect(Collectors.groupingBy(Course::getSeason)));

//Find the number of the courses according to the season
	System.out.println(courseList.stream()
			                     .collect(Collectors.groupingBy(Course::getSeason, Collectors.counting())));
	
//Find the number of the courses according to the courseName
	System.out.println(courseList.stream()
	          .collect(Collectors.groupingBy(Course::getCourseName, Collectors.counting())));
	
	
	}

}
