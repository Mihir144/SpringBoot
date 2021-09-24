package com.example.IT068_SpringProject.dto;

//import com.example.IT068_SpringProject.validation.StudentNamePrefix;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.validation.constraints.NotBlank;

//@Getter
//@Setter
//@Accessors(chain = true)
//@NoArgsConstructor
//public class StudentDTO {
//    @StudentNamePrefix(message = "Name must start with M")
//    @NotBlank(message = "Name is required!")
//    private String studentName;
////    @NotNull
////    @Min(value = 200)
////    @Positive(message = "Amount cannot be Zero or negative")
////    private int amount;
//}

public class StudentDTO{

	String studentName;
	String studentID;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
}