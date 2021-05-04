package javaHomeWork2;

public class InstructorManager extends UserManager{

	public void instructorInformation(Instructor instructor) {
		System.out.println("Eðitmen bilgisi : " + instructor.getFirstName() + " " + instructor.getLastName() + " "
				+ instructor.getProfession());
	}

	public void addCourse(Course course) {
		System.out.println("Yeni kurs eklendi : " + course.getName());
	}

	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi : " + course.getName());
	}
}
